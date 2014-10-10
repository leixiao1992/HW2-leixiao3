import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import cmu.edu.leixiao.genelingpipe;
import edu.cmu.deiis.types.Token;

/**
 * to search if the gene recognized by linpipe is also recognized by abner or
 * stanford. if one of them has recognized it, we should add it into final token
 * 
 * @author leixiao
 *
 */
public class ScoreAnnotator2 extends JCasAnnotator_ImplBase {
	
	public static final String PARAM_INPUTDIR1 = "output1";
	public static final String PARAM_INPUTDIR2 = "output2";
	public static String oPath1;
	public static String oPath2;

	public void initialize(org.apache.uima.UimaContext aContext) throws ResourceInitializationException {
		oPath1 = (String) aContext.getConfigParameterValue(PARAM_INPUTDIR1);
		oPath2 = (String) aContext.getConfigParameterValue(PARAM_INPUTDIR2);
	}

	public static String readToString(String fileName) {
		String encoding = "ISO-8859-1";
		File file = new File(fileName);
		Long filelength = file.length();
		byte[] filecontent = new byte[filelength.intValue()];
		try {
			FileInputStream in = new FileInputStream(file);
			in.read(filecontent);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			return new String(filecontent, encoding);
		} catch (UnsupportedEncodingException e) {
			System.err.println("The OS does not support " + encoding);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		//String candidate = readToString("/Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/data/stanford.in");
		//String candidate1 = readToString("/Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/data/abner.in");
		String candidate = readToString(oPath1);
		String candidate1 = readToString(oPath2);

		FSIterator iter = aJCas.getAnnotationIndex(genelingpipe.type).iterator();

		while (iter.isValid()) {

			genelingpipe b = (genelingpipe) iter.get();
			String id = b.getLgeneID();
			String text = b.getLgeneTag();
			int begin = b.getLhead();
			int end = b.getLtail();

			String regex = text;
			Pattern p = Pattern.compile(regex);

			Matcher matcher = p.matcher(candidate);
			Matcher mat = p.matcher(candidate1);

			if (matcher.find() || mat.find()) {

				Token name = new Token(aJCas);
				name.setTokenID(id);
				name.setTokenTag(text);
				name.setTokenHead(begin);
				name.setTokenTail(end);
				name.setTokenConfidence(2);
				name.addToIndexes();

			}

			iter.moveToNext();
		}

	}

}

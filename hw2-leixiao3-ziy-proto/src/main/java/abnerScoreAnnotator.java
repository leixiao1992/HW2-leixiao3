import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

import cmu.edu.leixiao.Abnergene;
import cmu.edu.leixiao.gene;
import cmu.edu.leixiao.genelingpipe;
import cmu.edu.leixiao.token1;
import edu.cmu.deiis.types.Token;

/**
 * Read the content from the abnergene and gene
 * and compare it with lingpipe
 * then return the genetag which is both in abnergene and lingpipe or both in gene and lingpipe
 * and store it in the token.type
 * @author leixiao
 *
 */
public class abnerScoreAnnotator extends JCasAnnotator_ImplBase {



	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		
		int count=0;
		//System.out.println("find"+count+"!!");
		String temp1=null;
		String temp2=null;
		FSIterator iter1 = aJCas.getAnnotationIndex(Abnergene.type).iterator();
		FSIterator iter = aJCas.getAnnotationIndex(gene.type).iterator();
		
		while (iter.isValid()) {
			gene a = (gene) iter.get();
			String te = a.getGeneTag();
			temp1+=te;
			iter.moveToNext();		
		}
		while (iter1.isValid()) {
			Abnergene m = (Abnergene) iter1.get();
			String t = m.getAbnergenetag();
			temp2+=t;
			iter1.moveToNext();		
		}
		
		FSIterator iter2 = aJCas.getAnnotationIndex(genelingpipe.type).iterator();
		
		while (iter2.isValid()) {

			genelingpipe b = (genelingpipe) iter2.get();
			String id = b.getLgeneID();
			String text = b.getLgeneTag();
			int begin = b.getLhead();
			int end = b.getLtail();

			String regex = text;
			Pattern p = Pattern.compile(regex);

			Matcher matcher = p.matcher(temp1);
			Matcher mat = p.matcher(temp2);

			if (matcher.find() || mat.find()) {
				
				count++;
				System.out.println("find"+count+"!!"+text);
				
				Token name = new Token(aJCas);
				name.setTokenID(id);
				name.setTokenTag(text);
				name.setTokenHead(begin);
				name.setTokenTail(end);
				name.setTokenConfidence(2);
				name.addToIndexes();

			}

			iter2.moveToNext();
		}

	}

}

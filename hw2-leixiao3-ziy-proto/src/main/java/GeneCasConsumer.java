import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

import cmu.edu.leixiao.gene;
import edu.cmu.deiis.types.Token;

/**
 * This is a casComsumer of the system. is to get the gene type and then output
 * them in the document. in this case, we put it into the hw2-leixiao.out. The
 * main idea of this part is to obtain the gene type.transfer it into the format
 * we want to store in the document and then put it into the outputfile.In
 * addition, the system also calculate the precision of this method with
 * f1-score.
 * 
 * @author leixiao
 *
 */
public class GeneCasConsumer extends CasConsumer_ImplBase {

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
	public void initialize() throws ResourceInitializationException {

		System.out.println("Entering Cas Consumer:");
	}

	public void processCas(CAS aCAS) throws ResourceProcessException {
		int count = 0;
		int total = 0;
		// TODO Auto-generated method stub

		// get the parameter value
		// it is the location of the output file

		String oPath = (String) getUimaContext().getConfigParameterValue("OutputDocument");

		// open the document
		File outFile;
		FileWriter fileWriter = null;
		outFile = new File(oPath.trim());
		try {
			fileWriter = new FileWriter(outFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JCas jcas;
		try {
			jcas = aCAS.getJCas();
		} catch (CASException e) {
			throw new ResourceProcessException(e);
		}

		// iterator
		Iterator iter = jcas.getAnnotationIndex(Token.type).iterator();
		while (iter.hasNext()) {
			total++;
			// gene annot = (gene) annotationIter.next();
			Token k = (Token) iter.next();
			// gene k = (gene)iter.next();
			String id = k.getTokenID();
			String tag = k.getTokenTag();
			int begin = k.getTokenHead();
			int end = k.getTokenTail();

			String m = id + "|" + begin + " " + end + "|" + tag + "\n";

			String regex = tag;

			String candidate = readToString("/Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/data/sample.out");

			Pattern p = Pattern.compile(regex);

			Matcher matcher = p.matcher(candidate);

			if (matcher.find()) {
				count++;

			} else
				// System.out.println("not found!!!");
				System.out.println("total:" + total);

			try {
				fileWriter.write(m);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// iter.moveToNext();
		}

		/**
		 * calculate the precision of system
		 */
		int calculate = 0;
		String can = readToString("/Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/data/sample.out");
		String r = "\n";
		Pattern pa = Pattern.compile(r);

		Matcher mat = pa.matcher(can);

		while (mat.find()) {
			calculate++;
			// System.out.println("count:"+count);

		}
		System.out.println("total in document:" + calculate);

		System.out.println("total:" + total);
		System.out.println("count:" + count);
		double precision = (double) count / (double) total;

		System.out.println("precision:" + precision);

		double recall = (double) count / (double) calculate;
		System.out.println("recall:" + recall);

		double f1_score = 2 * (recall * precision) / (recall + precision);
		System.out.println("f1_score:" + f1_score);

	}
}

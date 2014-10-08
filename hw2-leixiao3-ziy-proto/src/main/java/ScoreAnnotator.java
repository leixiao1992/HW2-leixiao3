import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

import cmu.edu.leixiao.gene;

/**
 * reading from the stanford and write the gene which is recognized by stanford into the stanford.in 
 * @author leixiao
 *
 */
public class ScoreAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		
		String oPath = "/Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/data/stanford.in";
		
		System.out.println(oPath);

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

		FSIterator iter = aJCas.getAnnotationIndex(gene.type).iterator();
		while (iter.isValid()) {

			gene a = (gene)iter.get();
			//String id = a.getGeneID();
			String text=a.getGeneTag();
		
			String m = text + "\n";
			
			try {
				fileWriter.write(m);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			iter.moveToNext();
		}
		
		
		

	}

}

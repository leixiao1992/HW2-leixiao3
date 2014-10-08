import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

import abner.Tagger;
import cmu.edu.leixiao.Abnergene;
import cmu.edu.leixiao.Sentence;

/**
 * This is a casAnnotator of the system which use Abner Method to recognize the
 * gene Entity. The main idea of this part is to deal with the SentenceText and
 * recognize the location of the gene tag. Put the SentenceText into this
 * method, it will automatically return a String[][].Through traversing the hash
 * string[][], we could get gene entity, which we store in Abnergene Type.
 * 
 * @author leixiao
 *
 */
public class abnerAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		/**
		 * define an iterator to traverse the content of the cas in form of the
		 * Sentence Type
		 */

		int j = 0;
		FSIterator iter = aJCas.getAnnotationIndex(Sentence.type).iterator();

		// iterate
		Tagger tag = new Tagger();

		while (iter.isValid()) {

			// get the sentence type
			Sentence a = (Sentence) iter.get();

			String docText = a.getSentenceText();

			j++;
			System.out.println(j);

			/** use the method of Abner, and recognize the gene entity */

			String text = docText;
			String[][] m = tag.getEntities(text);
			int i = 0;
			while (i < m[0].length) {

				Abnergene name = new Abnergene(aJCas);
				name.setAbnergenetag(m[0][i]);
				name.addToIndexes();
				i++;
			}
			iter.moveToNext();
		}
	}

}

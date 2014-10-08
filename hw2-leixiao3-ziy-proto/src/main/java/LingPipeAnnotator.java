import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

import cmu.edu.leixiao.Sentence;
import cmu.edu.leixiao.genelingpipe;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

/**
 * This is a casAnnotator of the system which use LingPipe Method to recognize
 * the gene Entity. The main idea of this part is to deal with the SentenceText
 * and recognize the location of the gene tag. Put the SentenceText into this
 * method, it will automatically return a set.Through traversing the set,
 * we could get gene entity, which we store in Lingpipegene Type.
 * 
 * @author leixiao
 *
 */

public class LingPipeAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		/**
		 * define an iterator to traverse the content of the cas in form of the
		 * Sentence Type
		 */
		
		String filename = "/Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/data/ne-en-bio-genetag-4.HmmChunker";
		File modelFile = new File(filename);

		// System.out.println("Reading chunker from file=" + modelFile);

		Chunker chunker = null;
		try {
			chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FSIterator iter = aJCas.getAnnotationIndex(Sentence.type).iterator();
		// iterate

		while (iter.isValid()) {

			// get the sentence type
			Sentence a = (Sentence) iter.get();
			String docText = a.getSentenceText();
			String id = a.getSentenceID();

			int begin = 0;
			int end = 0;

			Chunking chunking = chunker.chunk(docText);
			System.out.println("Chunking=" + chunking.chunkSet());

			Set<Chunk> set = chunking.chunkSet();
			Iterator<Chunk> it = set.iterator();

			while (it.hasNext()) {

				genelingpipe name = new genelingpipe(aJCas);

				Chunk str = it.next();
				System.out.println(str.start());
				System.out.println(str.end());

				begin = str.start();
				end = str.end();

				// store the tag into the geneTYPE cas
				String text = docText.substring(begin, end);
				
				String newtext1 = text.replace(")", "");
				String newtext2 = newtext1.replace("(", "");
				String newtext3 = newtext2.replace("[", "");
				String newtext4 = newtext3.replace("]", "");
				String newtext5 = newtext4.replace("+", "");
				name.setLgeneID(id);
				name.setLgeneTag(newtext5);
				name.setLhead(begin);
				name.setLtail(end);
				name.addToIndexes();

				System.out.println(id + " " + newtext5 + " " + begin + " " + end);
			}

			iter.moveToNext();
		}
	}
}
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

import cmu.edu.leixiao.genelingpipe;
import cmu.edu.leixiao.token1;
import edu.cmu.deiis.types.Token;

/**
 * reading from the token1 and lingpipe
 * return the tag which is both in token1 and lingpipe 
 * and store it in the token.type
 * 
 * @author leixiao
 *
 */
public class ScoreAnnotator extends JCasAnnotator_ImplBase {


	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		int count=0;

		FSIterator iter = aJCas.getAnnotationIndex(token1.type).iterator();
		FSIterator iter2 = aJCas.getAnnotationIndex(genelingpipe.type).iterator();
		
		while (iter.isValid()) {
			token1 a = (token1) iter.get();			
			String text = a.getToken1tag();
			
			while(iter2.isValid()){
				genelingpipe b=(genelingpipe)iter.get();
				String tag=b.getLgeneTag();
				String id=b.getLgeneID();
				int begin=b.getLhead();
				int end=b.getLtail();
				
				if(text.matches(tag)){
					
					Token name = new Token(aJCas);
					name.setTokenID(id);
					name.setTokenTag(tag);
					name.setTokenHead(begin);
					name.setTokenTail(end);
					name.setTokenConfidence(2);
					name.addToIndexes();
					count++;
					System.out.println("find"+count+"!!");
					iter2.moveToFirst();
					break;
				}
				iter2.moveToNext();
				if(!iter2.isValid()) {
					iter2.moveToFirst();
					break;
				}
			}	
			

			iter.moveToNext();
		}

	}

}

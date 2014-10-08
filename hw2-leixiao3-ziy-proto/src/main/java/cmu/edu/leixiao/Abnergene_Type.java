
/* First created by JCasGen Mon Oct 06 20:49:34 EDT 2014 */
package cmu.edu.leixiao;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Oct 06 20:49:36 EDT 2014
 * @generated */
public class Abnergene_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Abnergene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Abnergene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Abnergene(addr, Abnergene_Type.this);
  			   Abnergene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Abnergene(addr, Abnergene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Abnergene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.leixiao.Abnergene");
 
  /** @generated */
  final Feature casFeat_abnergeneID;
  /** @generated */
  final int     casFeatCode_abnergeneID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAbnergeneID(int addr) {
        if (featOkTst && casFeat_abnergeneID == null)
      jcas.throwFeatMissing("abnergeneID", "cmu.edu.leixiao.Abnergene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_abnergeneID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAbnergeneID(int addr, String v) {
        if (featOkTst && casFeat_abnergeneID == null)
      jcas.throwFeatMissing("abnergeneID", "cmu.edu.leixiao.Abnergene");
    ll_cas.ll_setStringValue(addr, casFeatCode_abnergeneID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_abnergenetag;
  /** @generated */
  final int     casFeatCode_abnergenetag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAbnergenetag(int addr) {
        if (featOkTst && casFeat_abnergenetag == null)
      jcas.throwFeatMissing("abnergenetag", "cmu.edu.leixiao.Abnergene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_abnergenetag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAbnergenetag(int addr, String v) {
        if (featOkTst && casFeat_abnergenetag == null)
      jcas.throwFeatMissing("abnergenetag", "cmu.edu.leixiao.Abnergene");
    ll_cas.ll_setStringValue(addr, casFeatCode_abnergenetag, v);}
    
  
 
  /** @generated */
  final Feature casFeat_abnerhead;
  /** @generated */
  final int     casFeatCode_abnerhead;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAbnerhead(int addr) {
        if (featOkTst && casFeat_abnerhead == null)
      jcas.throwFeatMissing("abnerhead", "cmu.edu.leixiao.Abnergene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_abnerhead);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAbnerhead(int addr, int v) {
        if (featOkTst && casFeat_abnerhead == null)
      jcas.throwFeatMissing("abnerhead", "cmu.edu.leixiao.Abnergene");
    ll_cas.ll_setIntValue(addr, casFeatCode_abnerhead, v);}
    
  
 
  /** @generated */
  final Feature casFeat_abnertail;
  /** @generated */
  final int     casFeatCode_abnertail;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAbnertail(int addr) {
        if (featOkTst && casFeat_abnertail == null)
      jcas.throwFeatMissing("abnertail", "cmu.edu.leixiao.Abnergene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_abnertail);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAbnertail(int addr, int v) {
        if (featOkTst && casFeat_abnertail == null)
      jcas.throwFeatMissing("abnertail", "cmu.edu.leixiao.Abnergene");
    ll_cas.ll_setIntValue(addr, casFeatCode_abnertail, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Abnergene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_abnergeneID = jcas.getRequiredFeatureDE(casType, "abnergeneID", "uima.cas.String", featOkTst);
    casFeatCode_abnergeneID  = (null == casFeat_abnergeneID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_abnergeneID).getCode();

 
    casFeat_abnergenetag = jcas.getRequiredFeatureDE(casType, "abnergenetag", "uima.cas.String", featOkTst);
    casFeatCode_abnergenetag  = (null == casFeat_abnergenetag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_abnergenetag).getCode();

 
    casFeat_abnerhead = jcas.getRequiredFeatureDE(casType, "abnerhead", "uima.cas.Integer", featOkTst);
    casFeatCode_abnerhead  = (null == casFeat_abnerhead) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_abnerhead).getCode();

 
    casFeat_abnertail = jcas.getRequiredFeatureDE(casType, "abnertail", "uima.cas.Integer", featOkTst);
    casFeatCode_abnertail  = (null == casFeat_abnertail) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_abnertail).getCode();

  }
}



    

/* First created by JCasGen Sun Oct 05 22:39:48 EDT 2014 */
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
public class genelingpipe_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (genelingpipe_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = genelingpipe_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new genelingpipe(addr, genelingpipe_Type.this);
  			   genelingpipe_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new genelingpipe(addr, genelingpipe_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = genelingpipe.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.leixiao.genelingpipe");
 
  /** @generated */
  final Feature casFeat_LgeneID;
  /** @generated */
  final int     casFeatCode_LgeneID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLgeneID(int addr) {
        if (featOkTst && casFeat_LgeneID == null)
      jcas.throwFeatMissing("LgeneID", "cmu.edu.leixiao.genelingpipe");
    return ll_cas.ll_getStringValue(addr, casFeatCode_LgeneID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLgeneID(int addr, String v) {
        if (featOkTst && casFeat_LgeneID == null)
      jcas.throwFeatMissing("LgeneID", "cmu.edu.leixiao.genelingpipe");
    ll_cas.ll_setStringValue(addr, casFeatCode_LgeneID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_LgeneTag;
  /** @generated */
  final int     casFeatCode_LgeneTag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLgeneTag(int addr) {
        if (featOkTst && casFeat_LgeneTag == null)
      jcas.throwFeatMissing("LgeneTag", "cmu.edu.leixiao.genelingpipe");
    return ll_cas.ll_getStringValue(addr, casFeatCode_LgeneTag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLgeneTag(int addr, String v) {
        if (featOkTst && casFeat_LgeneTag == null)
      jcas.throwFeatMissing("LgeneTag", "cmu.edu.leixiao.genelingpipe");
    ll_cas.ll_setStringValue(addr, casFeatCode_LgeneTag, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Lhead;
  /** @generated */
  final int     casFeatCode_Lhead;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLhead(int addr) {
        if (featOkTst && casFeat_Lhead == null)
      jcas.throwFeatMissing("Lhead", "cmu.edu.leixiao.genelingpipe");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Lhead);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLhead(int addr, int v) {
        if (featOkTst && casFeat_Lhead == null)
      jcas.throwFeatMissing("Lhead", "cmu.edu.leixiao.genelingpipe");
    ll_cas.ll_setIntValue(addr, casFeatCode_Lhead, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Ltail;
  /** @generated */
  final int     casFeatCode_Ltail;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLtail(int addr) {
        if (featOkTst && casFeat_Ltail == null)
      jcas.throwFeatMissing("Ltail", "cmu.edu.leixiao.genelingpipe");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Ltail);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLtail(int addr, int v) {
        if (featOkTst && casFeat_Ltail == null)
      jcas.throwFeatMissing("Ltail", "cmu.edu.leixiao.genelingpipe");
    ll_cas.ll_setIntValue(addr, casFeatCode_Ltail, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public genelingpipe_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_LgeneID = jcas.getRequiredFeatureDE(casType, "LgeneID", "uima.cas.String", featOkTst);
    casFeatCode_LgeneID  = (null == casFeat_LgeneID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_LgeneID).getCode();

 
    casFeat_LgeneTag = jcas.getRequiredFeatureDE(casType, "LgeneTag", "uima.cas.String", featOkTst);
    casFeatCode_LgeneTag  = (null == casFeat_LgeneTag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_LgeneTag).getCode();

 
    casFeat_Lhead = jcas.getRequiredFeatureDE(casType, "Lhead", "uima.cas.Integer", featOkTst);
    casFeatCode_Lhead  = (null == casFeat_Lhead) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Lhead).getCode();

 
    casFeat_Ltail = jcas.getRequiredFeatureDE(casType, "Ltail", "uima.cas.Integer", featOkTst);
    casFeatCode_Ltail  = (null == casFeat_Ltail) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Ltail).getCode();

  }
}



    
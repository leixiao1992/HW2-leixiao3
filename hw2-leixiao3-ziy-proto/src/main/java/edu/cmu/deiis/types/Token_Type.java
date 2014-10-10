
/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Oct 09 23:13:45 EDT 2014
 * @generated */
public class Token_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Token");



  /** @generated */
  final Feature casFeat_tokenID;
  /** @generated */
  final int     casFeatCode_tokenID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTokenID(int addr) {
        if (featOkTst && casFeat_tokenID == null)
      jcas.throwFeatMissing("tokenID", "edu.cmu.deiis.types.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tokenID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenID(int addr, String v) {
        if (featOkTst && casFeat_tokenID == null)
      jcas.throwFeatMissing("tokenID", "edu.cmu.deiis.types.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_tokenID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenTag;
  /** @generated */
  final int     casFeatCode_tokenTag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTokenTag(int addr) {
        if (featOkTst && casFeat_tokenTag == null)
      jcas.throwFeatMissing("tokenTag", "edu.cmu.deiis.types.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tokenTag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenTag(int addr, String v) {
        if (featOkTst && casFeat_tokenTag == null)
      jcas.throwFeatMissing("tokenTag", "edu.cmu.deiis.types.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_tokenTag, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TokenHead;
  /** @generated */
  final int     casFeatCode_TokenHead;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokenHead(int addr) {
        if (featOkTst && casFeat_TokenHead == null)
      jcas.throwFeatMissing("TokenHead", "edu.cmu.deiis.types.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_TokenHead);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenHead(int addr, int v) {
        if (featOkTst && casFeat_TokenHead == null)
      jcas.throwFeatMissing("TokenHead", "edu.cmu.deiis.types.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_TokenHead, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TokenTail;
  /** @generated */
  final int     casFeatCode_TokenTail;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokenTail(int addr) {
        if (featOkTst && casFeat_TokenTail == null)
      jcas.throwFeatMissing("TokenTail", "edu.cmu.deiis.types.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_TokenTail);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenTail(int addr, int v) {
        if (featOkTst && casFeat_TokenTail == null)
      jcas.throwFeatMissing("TokenTail", "edu.cmu.deiis.types.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_TokenTail, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TokenConfidence;
  /** @generated */
  final int     casFeatCode_TokenConfidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokenConfidence(int addr) {
        if (featOkTst && casFeat_TokenConfidence == null)
      jcas.throwFeatMissing("TokenConfidence", "edu.cmu.deiis.types.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_TokenConfidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenConfidence(int addr, int v) {
        if (featOkTst && casFeat_TokenConfidence == null)
      jcas.throwFeatMissing("TokenConfidence", "edu.cmu.deiis.types.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_TokenConfidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenID = jcas.getRequiredFeatureDE(casType, "tokenID", "uima.cas.String", featOkTst);
    casFeatCode_tokenID  = (null == casFeat_tokenID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenID).getCode();

 
    casFeat_tokenTag = jcas.getRequiredFeatureDE(casType, "tokenTag", "uima.cas.String", featOkTst);
    casFeatCode_tokenTag  = (null == casFeat_tokenTag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenTag).getCode();

 
    casFeat_TokenHead = jcas.getRequiredFeatureDE(casType, "TokenHead", "uima.cas.Integer", featOkTst);
    casFeatCode_TokenHead  = (null == casFeat_TokenHead) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenHead).getCode();

 
    casFeat_TokenTail = jcas.getRequiredFeatureDE(casType, "TokenTail", "uima.cas.Integer", featOkTst);
    casFeatCode_TokenTail  = (null == casFeat_TokenTail) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenTail).getCode();

 
    casFeat_TokenConfidence = jcas.getRequiredFeatureDE(casType, "TokenConfidence", "uima.cas.Integer", featOkTst);
    casFeatCode_TokenConfidence  = (null == casFeat_TokenConfidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenConfidence).getCode();

  }
}



    


/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Oct 09 23:13:45 EDT 2014
 * XML source: /Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: tokenID

  /** getter for tokenID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTokenID() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenID == null)
      jcasType.jcas.throwFeatMissing("tokenID", "edu.cmu.deiis.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_tokenID);}
    
  /** setter for tokenID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenID(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenID == null)
      jcasType.jcas.throwFeatMissing("tokenID", "edu.cmu.deiis.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_tokenID, v);}    
   
    
  //*--------------*
  //* Feature: tokenTag

  /** getter for tokenTag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTokenTag() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenTag == null)
      jcasType.jcas.throwFeatMissing("tokenTag", "edu.cmu.deiis.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_tokenTag);}
    
  /** setter for tokenTag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenTag(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenTag == null)
      jcasType.jcas.throwFeatMissing("tokenTag", "edu.cmu.deiis.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_tokenTag, v);}    
   
    
  //*--------------*
  //* Feature: TokenHead

  /** getter for TokenHead - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTokenHead() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenHead == null)
      jcasType.jcas.throwFeatMissing("TokenHead", "edu.cmu.deiis.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_TokenHead);}
    
  /** setter for TokenHead - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenHead(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenHead == null)
      jcasType.jcas.throwFeatMissing("TokenHead", "edu.cmu.deiis.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_TokenHead, v);}    
   
    
  //*--------------*
  //* Feature: TokenTail

  /** getter for TokenTail - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTokenTail() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenTail == null)
      jcasType.jcas.throwFeatMissing("TokenTail", "edu.cmu.deiis.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_TokenTail);}
    
  /** setter for TokenTail - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenTail(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenTail == null)
      jcasType.jcas.throwFeatMissing("TokenTail", "edu.cmu.deiis.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_TokenTail, v);}    
   
    
  //*--------------*
  //* Feature: TokenConfidence

  /** getter for TokenConfidence - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTokenConfidence() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenConfidence == null)
      jcasType.jcas.throwFeatMissing("TokenConfidence", "edu.cmu.deiis.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_TokenConfidence);}
    
  /** setter for TokenConfidence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenConfidence(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenConfidence == null)
      jcasType.jcas.throwFeatMissing("TokenConfidence", "edu.cmu.deiis.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_TokenConfidence, v);}    
  }

    
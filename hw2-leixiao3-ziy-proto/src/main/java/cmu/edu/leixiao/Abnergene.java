

/* First created by JCasGen Mon Oct 06 20:49:34 EDT 2014 */
package cmu.edu.leixiao;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Oct 09 23:13:45 EDT 2014
 * XML source: /Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Abnergene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Abnergene.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Abnergene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Abnergene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Abnergene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Abnergene(JCas jcas, int begin, int end) {
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
  //* Feature: abnergeneID

  /** getter for abnergeneID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAbnergeneID() {
    if (Abnergene_Type.featOkTst && ((Abnergene_Type)jcasType).casFeat_abnergeneID == null)
      jcasType.jcas.throwFeatMissing("abnergeneID", "cmu.edu.leixiao.Abnergene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Abnergene_Type)jcasType).casFeatCode_abnergeneID);}
    
  /** setter for abnergeneID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAbnergeneID(String v) {
    if (Abnergene_Type.featOkTst && ((Abnergene_Type)jcasType).casFeat_abnergeneID == null)
      jcasType.jcas.throwFeatMissing("abnergeneID", "cmu.edu.leixiao.Abnergene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Abnergene_Type)jcasType).casFeatCode_abnergeneID, v);}    
   
    
  //*--------------*
  //* Feature: abnergenetag

  /** getter for abnergenetag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAbnergenetag() {
    if (Abnergene_Type.featOkTst && ((Abnergene_Type)jcasType).casFeat_abnergenetag == null)
      jcasType.jcas.throwFeatMissing("abnergenetag", "cmu.edu.leixiao.Abnergene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Abnergene_Type)jcasType).casFeatCode_abnergenetag);}
    
  /** setter for abnergenetag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAbnergenetag(String v) {
    if (Abnergene_Type.featOkTst && ((Abnergene_Type)jcasType).casFeat_abnergenetag == null)
      jcasType.jcas.throwFeatMissing("abnergenetag", "cmu.edu.leixiao.Abnergene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Abnergene_Type)jcasType).casFeatCode_abnergenetag, v);}    
   
    
  //*--------------*
  //* Feature: abnerhead

  /** getter for abnerhead - gets 
   * @generated
   * @return value of the feature 
   */
  public int getAbnerhead() {
    if (Abnergene_Type.featOkTst && ((Abnergene_Type)jcasType).casFeat_abnerhead == null)
      jcasType.jcas.throwFeatMissing("abnerhead", "cmu.edu.leixiao.Abnergene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Abnergene_Type)jcasType).casFeatCode_abnerhead);}
    
  /** setter for abnerhead - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAbnerhead(int v) {
    if (Abnergene_Type.featOkTst && ((Abnergene_Type)jcasType).casFeat_abnerhead == null)
      jcasType.jcas.throwFeatMissing("abnerhead", "cmu.edu.leixiao.Abnergene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Abnergene_Type)jcasType).casFeatCode_abnerhead, v);}    
   
    
  //*--------------*
  //* Feature: abnertail

  /** getter for abnertail - gets 
   * @generated
   * @return value of the feature 
   */
  public int getAbnertail() {
    if (Abnergene_Type.featOkTst && ((Abnergene_Type)jcasType).casFeat_abnertail == null)
      jcasType.jcas.throwFeatMissing("abnertail", "cmu.edu.leixiao.Abnergene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Abnergene_Type)jcasType).casFeatCode_abnertail);}
    
  /** setter for abnertail - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAbnertail(int v) {
    if (Abnergene_Type.featOkTst && ((Abnergene_Type)jcasType).casFeat_abnertail == null)
      jcasType.jcas.throwFeatMissing("abnertail", "cmu.edu.leixiao.Abnergene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Abnergene_Type)jcasType).casFeatCode_abnertail, v);}    
  }

    
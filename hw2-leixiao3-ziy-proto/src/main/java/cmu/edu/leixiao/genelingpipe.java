

/* First created by JCasGen Sun Oct 05 22:39:48 EDT 2014 */
package cmu.edu.leixiao;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Oct 09 23:13:45 EDT 2014
 * XML source: /Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class genelingpipe extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(genelingpipe.class);
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
  protected genelingpipe() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public genelingpipe(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public genelingpipe(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public genelingpipe(JCas jcas, int begin, int end) {
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
  //* Feature: LgeneID

  /** getter for LgeneID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLgeneID() {
    if (genelingpipe_Type.featOkTst && ((genelingpipe_Type)jcasType).casFeat_LgeneID == null)
      jcasType.jcas.throwFeatMissing("LgeneID", "cmu.edu.leixiao.genelingpipe");
    return jcasType.ll_cas.ll_getStringValue(addr, ((genelingpipe_Type)jcasType).casFeatCode_LgeneID);}
    
  /** setter for LgeneID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLgeneID(String v) {
    if (genelingpipe_Type.featOkTst && ((genelingpipe_Type)jcasType).casFeat_LgeneID == null)
      jcasType.jcas.throwFeatMissing("LgeneID", "cmu.edu.leixiao.genelingpipe");
    jcasType.ll_cas.ll_setStringValue(addr, ((genelingpipe_Type)jcasType).casFeatCode_LgeneID, v);}    
   
    
  //*--------------*
  //* Feature: LgeneTag

  /** getter for LgeneTag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLgeneTag() {
    if (genelingpipe_Type.featOkTst && ((genelingpipe_Type)jcasType).casFeat_LgeneTag == null)
      jcasType.jcas.throwFeatMissing("LgeneTag", "cmu.edu.leixiao.genelingpipe");
    return jcasType.ll_cas.ll_getStringValue(addr, ((genelingpipe_Type)jcasType).casFeatCode_LgeneTag);}
    
  /** setter for LgeneTag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLgeneTag(String v) {
    if (genelingpipe_Type.featOkTst && ((genelingpipe_Type)jcasType).casFeat_LgeneTag == null)
      jcasType.jcas.throwFeatMissing("LgeneTag", "cmu.edu.leixiao.genelingpipe");
    jcasType.ll_cas.ll_setStringValue(addr, ((genelingpipe_Type)jcasType).casFeatCode_LgeneTag, v);}    
   
    
  //*--------------*
  //* Feature: Lhead

  /** getter for Lhead - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLhead() {
    if (genelingpipe_Type.featOkTst && ((genelingpipe_Type)jcasType).casFeat_Lhead == null)
      jcasType.jcas.throwFeatMissing("Lhead", "cmu.edu.leixiao.genelingpipe");
    return jcasType.ll_cas.ll_getIntValue(addr, ((genelingpipe_Type)jcasType).casFeatCode_Lhead);}
    
  /** setter for Lhead - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLhead(int v) {
    if (genelingpipe_Type.featOkTst && ((genelingpipe_Type)jcasType).casFeat_Lhead == null)
      jcasType.jcas.throwFeatMissing("Lhead", "cmu.edu.leixiao.genelingpipe");
    jcasType.ll_cas.ll_setIntValue(addr, ((genelingpipe_Type)jcasType).casFeatCode_Lhead, v);}    
   
    
  //*--------------*
  //* Feature: Ltail

  /** getter for Ltail - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLtail() {
    if (genelingpipe_Type.featOkTst && ((genelingpipe_Type)jcasType).casFeat_Ltail == null)
      jcasType.jcas.throwFeatMissing("Ltail", "cmu.edu.leixiao.genelingpipe");
    return jcasType.ll_cas.ll_getIntValue(addr, ((genelingpipe_Type)jcasType).casFeatCode_Ltail);}
    
  /** setter for Ltail - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLtail(int v) {
    if (genelingpipe_Type.featOkTst && ((genelingpipe_Type)jcasType).casFeat_Ltail == null)
      jcasType.jcas.throwFeatMissing("Ltail", "cmu.edu.leixiao.genelingpipe");
    jcasType.ll_cas.ll_setIntValue(addr, ((genelingpipe_Type)jcasType).casFeatCode_Ltail, v);}    
  }

    
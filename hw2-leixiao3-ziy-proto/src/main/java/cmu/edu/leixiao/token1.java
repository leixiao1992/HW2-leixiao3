

/* First created by JCasGen Thu Oct 09 23:13:45 EDT 2014 */
package cmu.edu.leixiao;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Oct 09 23:13:45 EDT 2014
 * XML source: /Users/leixiao/git/HW2-leixiao3/hw2-leixiao3-ziy-proto/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class token1 extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(token1.class);
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
  protected token1() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public token1(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public token1(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public token1(JCas jcas, int begin, int end) {
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
  //* Feature: token1tag

  /** getter for token1tag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getToken1tag() {
    if (token1_Type.featOkTst && ((token1_Type)jcasType).casFeat_token1tag == null)
      jcasType.jcas.throwFeatMissing("token1tag", "cmu.edu.leixiao.token1");
    return jcasType.ll_cas.ll_getStringValue(addr, ((token1_Type)jcasType).casFeatCode_token1tag);}
    
  /** setter for token1tag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setToken1tag(String v) {
    if (token1_Type.featOkTst && ((token1_Type)jcasType).casFeat_token1tag == null)
      jcasType.jcas.throwFeatMissing("token1tag", "cmu.edu.leixiao.token1");
    jcasType.ll_cas.ll_setStringValue(addr, ((token1_Type)jcasType).casFeatCode_token1tag, v);}    
  }

    
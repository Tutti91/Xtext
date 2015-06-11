/**
 */
package org.xtext.language.language;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.language.language.Start#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.language.language.LanguagePackage#getStart()
 * @model
 * @generated
 */
public interface Start extends XExpression
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(DATE)
	 * @see org.xtext.language.language.LanguagePackage#getStart_Name()
	 * @model containment="true"
	 * @generated
	 */
  DATE getName();

  /**
	 * Sets the value of the '{@link org.xtext.language.language.Start#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
  void setName(DATE value);

} // Start

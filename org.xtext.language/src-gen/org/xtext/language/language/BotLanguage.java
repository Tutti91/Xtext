/**
 */
package org.xtext.language.language;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bot Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.language.language.BotLanguage#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.language.language.LanguagePackage#getBotLanguage()
 * @model
 * @generated
 */
public interface BotLanguage extends EObject
{
  /**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.xtext.language.language.LanguagePackage#getBotLanguage_Instructions()
	 * @model containment="true"
	 * @generated
	 */
  EList<XExpression> getInstructions();

} // BotLanguage

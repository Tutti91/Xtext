/**
 */
package org.xtext.language.language;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.language.language.LanguagePackage
 * @generated
 */
public interface LanguageFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  LanguageFactory eINSTANCE = org.xtext.language.language.impl.LanguageFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Bot Language</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bot Language</em>'.
	 * @generated
	 */
  BotLanguage createBotLanguage();

  /**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
  Button createButton();

  /**
	 * Returns a new object of class '<em>Login URL</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login URL</em>'.
	 * @generated
	 */
  LoginURL createLoginURL();

  /**
	 * Returns a new object of class '<em>Logout</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logout</em>'.
	 * @generated
	 */
  Logout createLogout();

  /**
	 * Returns a new object of class '<em>Username</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Username</em>'.
	 * @generated
	 */
  Username createUsername();

  /**
	 * Returns a new object of class '<em>Password</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password</em>'.
	 * @generated
	 */
  Password createPassword();

  /**
	 * Returns a new object of class '<em>Notification Adress</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Adress</em>'.
	 * @generated
	 */
  NotificationAdress createNotificationAdress();

  /**
	 * Returns a new object of class '<em>Start</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start</em>'.
	 * @generated
	 */
  Start createStart();

  /**
	 * Returns a new object of class '<em>DATE</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>DATE</em>'.
	 * @generated
	 */
  DATE createDATE();

  /**
	 * Returns a new object of class '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop</em>'.
	 * @generated
	 */
  Stop createStop();

  /**
	 * Returns a new object of class '<em>Var</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var</em>'.
	 * @generated
	 */
  Var createVar();

  /**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
  Function createFunction();

  /**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
  Form createForm();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  LanguagePackage getLanguagePackage();

} //LanguageFactory

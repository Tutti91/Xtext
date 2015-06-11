/**
 */
package org.xtext.language.language;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.language.language.LanguageFactory
 * @model kind="package"
 * @generated
 */
public interface LanguagePackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "language";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.xtext.org/language/Language";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "language";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  LanguagePackage eINSTANCE = org.xtext.language.language.impl.LanguagePackageImpl.init();

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.BotLanguageImpl <em>Bot Language</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.BotLanguageImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getBotLanguage()
	 * @generated
	 */
  int BOT_LANGUAGE = 0;

  /**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOT_LANGUAGE__INSTRUCTIONS = 0;

  /**
	 * The number of structural features of the '<em>Bot Language</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOT_LANGUAGE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.ButtonImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getButton()
	 * @generated
	 */
  int BUTTON = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.LoginURLImpl <em>Login URL</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.LoginURLImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getLoginURL()
	 * @generated
	 */
  int LOGIN_URL = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOGIN_URL__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Login URL</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOGIN_URL_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.LogoutImpl <em>Logout</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.LogoutImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getLogout()
	 * @generated
	 */
  int LOGOUT = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOGOUT__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Logout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOGOUT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.UsernameImpl <em>Username</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.UsernameImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getUsername()
	 * @generated
	 */
  int USERNAME = 4;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int USERNAME__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Username</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int USERNAME_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.PasswordImpl <em>Password</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.PasswordImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getPassword()
	 * @generated
	 */
  int PASSWORD = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Password</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.NotificationAdressImpl <em>Notification Adress</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.NotificationAdressImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getNotificationAdress()
	 * @generated
	 */
  int NOTIFICATION_ADRESS = 6;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOTIFICATION_ADRESS__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Notification Adress</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOTIFICATION_ADRESS_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.StartImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getStart()
	 * @generated
	 */
  int START = 7;

  /**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int START__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int START_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.DATEImpl <em>DATE</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.DATEImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getDATE()
	 * @generated
	 */
  int DATE = 8;

  /**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE__DAY = 0;

  /**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE__MONTH = 1;

  /**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE__YEAR = 2;

  /**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE__HOURS = 3;

  /**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE__MINUTES = 4;

  /**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE__SECOND = 5;

  /**
	 * The number of structural features of the '<em>DATE</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.StopImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getStop()
	 * @generated
	 */
  int STOP = 9;

  /**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STOP__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STOP_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.VarImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getVar()
	 * @generated
	 */
  int VAR = 10;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VAR__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VAR_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.FunctionImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getFunction()
	 * @generated
	 */
  int FUNCTION = 11;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FUNCTION__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FUNCTION__ACTIONS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FUNCTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.xtext.language.language.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.language.language.impl.FormImpl
	 * @see org.xtext.language.language.impl.LanguagePackageImpl#getForm()
	 * @generated
	 */
  int FORM = 12;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.BotLanguage <em>Bot Language</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bot Language</em>'.
	 * @see org.xtext.language.language.BotLanguage
	 * @generated
	 */
  EClass getBotLanguage();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.language.language.BotLanguage#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.xtext.language.language.BotLanguage#getInstructions()
	 * @see #getBotLanguage()
	 * @generated
	 */
  EReference getBotLanguage_Instructions();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.xtext.language.language.Button
	 * @generated
	 */
  EClass getButton();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.Button#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.Button#getName()
	 * @see #getButton()
	 * @generated
	 */
  EAttribute getButton_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.LoginURL <em>Login URL</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login URL</em>'.
	 * @see org.xtext.language.language.LoginURL
	 * @generated
	 */
  EClass getLoginURL();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.LoginURL#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.LoginURL#getName()
	 * @see #getLoginURL()
	 * @generated
	 */
  EAttribute getLoginURL_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Logout <em>Logout</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logout</em>'.
	 * @see org.xtext.language.language.Logout
	 * @generated
	 */
  EClass getLogout();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.Logout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.Logout#getName()
	 * @see #getLogout()
	 * @generated
	 */
  EAttribute getLogout_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Username <em>Username</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Username</em>'.
	 * @see org.xtext.language.language.Username
	 * @generated
	 */
  EClass getUsername();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.Username#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.Username#getName()
	 * @see #getUsername()
	 * @generated
	 */
  EAttribute getUsername_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password</em>'.
	 * @see org.xtext.language.language.Password
	 * @generated
	 */
  EClass getPassword();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.Password#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.Password#getName()
	 * @see #getPassword()
	 * @generated
	 */
  EAttribute getPassword_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.NotificationAdress <em>Notification Adress</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Adress</em>'.
	 * @see org.xtext.language.language.NotificationAdress
	 * @generated
	 */
  EClass getNotificationAdress();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.NotificationAdress#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.NotificationAdress#getName()
	 * @see #getNotificationAdress()
	 * @generated
	 */
  EAttribute getNotificationAdress_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see org.xtext.language.language.Start
	 * @generated
	 */
  EClass getStart();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.language.language.Start#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.xtext.language.language.Start#getName()
	 * @see #getStart()
	 * @generated
	 */
  EReference getStart_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.DATE <em>DATE</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATE</em>'.
	 * @see org.xtext.language.language.DATE
	 * @generated
	 */
  EClass getDATE();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.DATE#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.xtext.language.language.DATE#getDay()
	 * @see #getDATE()
	 * @generated
	 */
  EAttribute getDATE_Day();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.DATE#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.xtext.language.language.DATE#getMonth()
	 * @see #getDATE()
	 * @generated
	 */
  EAttribute getDATE_Month();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.DATE#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.xtext.language.language.DATE#getYear()
	 * @see #getDATE()
	 * @generated
	 */
  EAttribute getDATE_Year();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.DATE#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see org.xtext.language.language.DATE#getHours()
	 * @see #getDATE()
	 * @generated
	 */
  EAttribute getDATE_Hours();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.DATE#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see org.xtext.language.language.DATE#getMinutes()
	 * @see #getDATE()
	 * @generated
	 */
  EAttribute getDATE_Minutes();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.DATE#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see org.xtext.language.language.DATE#getSecond()
	 * @see #getDATE()
	 * @generated
	 */
  EAttribute getDATE_Second();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see org.xtext.language.language.Stop
	 * @generated
	 */
  EClass getStop();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.language.language.Stop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.xtext.language.language.Stop#getName()
	 * @see #getStop()
	 * @generated
	 */
  EReference getStop_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see org.xtext.language.language.Var
	 * @generated
	 */
  EClass getVar();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.Var#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.Var#getName()
	 * @see #getVar()
	 * @generated
	 */
  EAttribute getVar_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.xtext.language.language.Function
	 * @generated
	 */
  EClass getFunction();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
  EAttribute getFunction_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.language.language.Function#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.xtext.language.language.Function#getActions()
	 * @see #getFunction()
	 * @generated
	 */
  EReference getFunction_Actions();

  /**
	 * Returns the meta object for class '{@link org.xtext.language.language.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.xtext.language.language.Form
	 * @generated
	 */
  EClass getForm();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.language.language.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.language.language.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
  EAttribute getForm_Name();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  LanguageFactory getLanguageFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.BotLanguageImpl <em>Bot Language</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.BotLanguageImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getBotLanguage()
		 * @generated
		 */
    EClass BOT_LANGUAGE = eINSTANCE.getBotLanguage();

    /**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BOT_LANGUAGE__INSTRUCTIONS = eINSTANCE.getBotLanguage_Instructions();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.ButtonImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getButton()
		 * @generated
		 */
    EClass BUTTON = eINSTANCE.getButton();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BUTTON__NAME = eINSTANCE.getButton_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.LoginURLImpl <em>Login URL</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.LoginURLImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getLoginURL()
		 * @generated
		 */
    EClass LOGIN_URL = eINSTANCE.getLoginURL();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LOGIN_URL__NAME = eINSTANCE.getLoginURL_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.LogoutImpl <em>Logout</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.LogoutImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getLogout()
		 * @generated
		 */
    EClass LOGOUT = eINSTANCE.getLogout();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LOGOUT__NAME = eINSTANCE.getLogout_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.UsernameImpl <em>Username</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.UsernameImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getUsername()
		 * @generated
		 */
    EClass USERNAME = eINSTANCE.getUsername();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute USERNAME__NAME = eINSTANCE.getUsername_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.PasswordImpl <em>Password</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.PasswordImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getPassword()
		 * @generated
		 */
    EClass PASSWORD = eINSTANCE.getPassword();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PASSWORD__NAME = eINSTANCE.getPassword_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.NotificationAdressImpl <em>Notification Adress</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.NotificationAdressImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getNotificationAdress()
		 * @generated
		 */
    EClass NOTIFICATION_ADRESS = eINSTANCE.getNotificationAdress();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NOTIFICATION_ADRESS__NAME = eINSTANCE.getNotificationAdress_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.StartImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getStart()
		 * @generated
		 */
    EClass START = eINSTANCE.getStart();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference START__NAME = eINSTANCE.getStart_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.DATEImpl <em>DATE</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.DATEImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getDATE()
		 * @generated
		 */
    EClass DATE = eINSTANCE.getDATE();

    /**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE__DAY = eINSTANCE.getDATE_Day();

    /**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE__MONTH = eINSTANCE.getDATE_Month();

    /**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE__YEAR = eINSTANCE.getDATE_Year();

    /**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE__HOURS = eINSTANCE.getDATE_Hours();

    /**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE__MINUTES = eINSTANCE.getDATE_Minutes();

    /**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE__SECOND = eINSTANCE.getDATE_Second();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.StopImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getStop()
		 * @generated
		 */
    EClass STOP = eINSTANCE.getStop();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference STOP__NAME = eINSTANCE.getStop_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.VarImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getVar()
		 * @generated
		 */
    EClass VAR = eINSTANCE.getVar();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VAR__NAME = eINSTANCE.getVar_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.FunctionImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getFunction()
		 * @generated
		 */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FUNCTION__ACTIONS = eINSTANCE.getFunction_Actions();

    /**
		 * The meta object literal for the '{@link org.xtext.language.language.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.language.language.impl.FormImpl
		 * @see org.xtext.language.language.impl.LanguagePackageImpl#getForm()
		 * @generated
		 */
    EClass FORM = eINSTANCE.getForm();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM__NAME = eINSTANCE.getForm_Name();

  }

} //LanguagePackage

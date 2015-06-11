/**
 */
package org.xtext.language.language.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.language.language.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageFactoryImpl extends EFactoryImpl implements LanguageFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static LanguageFactory init()
  {
		try {
			LanguageFactory theLanguageFactory = (LanguageFactory)EPackage.Registry.INSTANCE.getEFactory(LanguagePackage.eNS_URI);
			if (theLanguageFactory != null) {
				return theLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LanguageFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LanguageFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case LanguagePackage.BOT_LANGUAGE: return createBotLanguage();
			case LanguagePackage.BUTTON: return createButton();
			case LanguagePackage.LOGIN_URL: return createLoginURL();
			case LanguagePackage.LOGOUT: return createLogout();
			case LanguagePackage.USERNAME: return createUsername();
			case LanguagePackage.PASSWORD: return createPassword();
			case LanguagePackage.NOTIFICATION_ADRESS: return createNotificationAdress();
			case LanguagePackage.START: return createStart();
			case LanguagePackage.DATE: return createDATE();
			case LanguagePackage.STOP: return createStop();
			case LanguagePackage.VAR: return createVar();
			case LanguagePackage.FUNCTION: return createFunction();
			case LanguagePackage.FORM: return createForm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BotLanguage createBotLanguage()
  {
		BotLanguageImpl botLanguage = new BotLanguageImpl();
		return botLanguage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Button createButton()
  {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LoginURL createLoginURL()
  {
		LoginURLImpl loginURL = new LoginURLImpl();
		return loginURL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Logout createLogout()
  {
		LogoutImpl logout = new LogoutImpl();
		return logout;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Username createUsername()
  {
		UsernameImpl username = new UsernameImpl();
		return username;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Password createPassword()
  {
		PasswordImpl password = new PasswordImpl();
		return password;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationAdress createNotificationAdress()
  {
		NotificationAdressImpl notificationAdress = new NotificationAdressImpl();
		return notificationAdress;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Start createStart()
  {
		StartImpl start = new StartImpl();
		return start;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DATE createDATE()
  {
		DATEImpl date = new DATEImpl();
		return date;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Stop createStop()
  {
		StopImpl stop = new StopImpl();
		return stop;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Var createVar()
  {
		VarImpl var = new VarImpl();
		return var;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Function createFunction()
  {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Form createForm()
  {
		FormImpl form = new FormImpl();
		return form;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LanguagePackage getLanguagePackage()
  {
		return (LanguagePackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static LanguagePackage getPackage()
  {
		return LanguagePackage.eINSTANCE;
	}

} //LanguageFactoryImpl

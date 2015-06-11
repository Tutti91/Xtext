/**
 */
package org.xtext.language.language.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

import org.xtext.language.language.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.language.language.LanguagePackage
 * @generated
 */
public class LanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static LanguagePackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LanguageAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = LanguagePackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LanguageSwitch<Adapter> modelSwitch =
    new LanguageSwitch<Adapter>() {
			@Override
			public Adapter caseBotLanguage(BotLanguage object) {
				return createBotLanguageAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseLoginURL(LoginURL object) {
				return createLoginURLAdapter();
			}
			@Override
			public Adapter caseLogout(Logout object) {
				return createLogoutAdapter();
			}
			@Override
			public Adapter caseUsername(Username object) {
				return createUsernameAdapter();
			}
			@Override
			public Adapter casePassword(Password object) {
				return createPasswordAdapter();
			}
			@Override
			public Adapter caseNotificationAdress(NotificationAdress object) {
				return createNotificationAdressAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseDATE(DATE object) {
				return createDATEAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseVar(Var object) {
				return createVarAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseXExpression(XExpression object) {
				return createXExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.BotLanguage <em>Bot Language</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.BotLanguage
	 * @generated
	 */
  public Adapter createBotLanguageAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Button
	 * @generated
	 */
  public Adapter createButtonAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.LoginURL <em>Login URL</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.LoginURL
	 * @generated
	 */
  public Adapter createLoginURLAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Logout <em>Logout</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Logout
	 * @generated
	 */
  public Adapter createLogoutAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Username <em>Username</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Username
	 * @generated
	 */
  public Adapter createUsernameAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Password
	 * @generated
	 */
  public Adapter createPasswordAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.NotificationAdress <em>Notification Adress</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.NotificationAdress
	 * @generated
	 */
  public Adapter createNotificationAdressAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Start
	 * @generated
	 */
  public Adapter createStartAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.DATE <em>DATE</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.DATE
	 * @generated
	 */
  public Adapter createDATEAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Stop
	 * @generated
	 */
  public Adapter createStopAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Var
	 * @generated
	 */
  public Adapter createVarAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Function
	 * @generated
	 */
  public Adapter createFunctionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.language.language.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.language.language.Form
	 * @generated
	 */
  public Adapter createFormAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XExpression
	 * @generated
	 */
  public Adapter createXExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //LanguageAdapterFactory

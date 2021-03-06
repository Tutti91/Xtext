/**
 */
package org.xtext.language.language.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

import org.xtext.language.language.BotLanguage;
import org.xtext.language.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bot Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.language.language.impl.BotLanguageImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BotLanguageImpl extends MinimalEObjectImpl.Container implements BotLanguage
{
  /**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
  protected EList<XExpression> instructions;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BotLanguageImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return LanguagePackage.Literals.BOT_LANGUAGE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<XExpression> getInstructions()
  {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<XExpression>(XExpression.class, this, LanguagePackage.BOT_LANGUAGE__INSTRUCTIONS);
		}
		return instructions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case LanguagePackage.BOT_LANGUAGE__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case LanguagePackage.BOT_LANGUAGE__INSTRUCTIONS:
				return getInstructions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case LanguagePackage.BOT_LANGUAGE__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends XExpression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case LanguagePackage.BOT_LANGUAGE__INSTRUCTIONS:
				getInstructions().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case LanguagePackage.BOT_LANGUAGE__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BotLanguageImpl

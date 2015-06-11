/**
 */
package org.xtext.language.language.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.language.language.DATE;
import org.xtext.language.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.language.language.impl.DATEImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.xtext.language.language.impl.DATEImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.xtext.language.language.impl.DATEImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.xtext.language.language.impl.DATEImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link org.xtext.language.language.impl.DATEImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.xtext.language.language.impl.DATEImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DATEImpl extends MinimalEObjectImpl.Container implements DATE
{
  /**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
  protected static final String DAY_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
  protected String day = DAY_EDEFAULT;

  /**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
  protected static final String MONTH_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
  protected String month = MONTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
  protected static final String YEAR_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
  protected String year = YEAR_EDEFAULT;

  /**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
  protected static final String HOURS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
  protected String hours = HOURS_EDEFAULT;

  /**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
  protected static final String MINUTES_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
  protected String minutes = MINUTES_EDEFAULT;

  /**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
  protected static final String SECOND_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
  protected String second = SECOND_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DATEImpl()
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
		return LanguagePackage.Literals.DATE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDay()
  {
		return day;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDay(String newDay)
  {
		String oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.DATE__DAY, oldDay, day));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getMonth()
  {
		return month;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMonth(String newMonth)
  {
		String oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.DATE__MONTH, oldMonth, month));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getYear()
  {
		return year;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setYear(String newYear)
  {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.DATE__YEAR, oldYear, year));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getHours()
  {
		return hours;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHours(String newHours)
  {
		String oldHours = hours;
		hours = newHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.DATE__HOURS, oldHours, hours));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getMinutes()
  {
		return minutes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinutes(String newMinutes)
  {
		String oldMinutes = minutes;
		minutes = newMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.DATE__MINUTES, oldMinutes, minutes));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSecond()
  {
		return second;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSecond(String newSecond)
  {
		String oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.DATE__SECOND, oldSecond, second));
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
			case LanguagePackage.DATE__DAY:
				return getDay();
			case LanguagePackage.DATE__MONTH:
				return getMonth();
			case LanguagePackage.DATE__YEAR:
				return getYear();
			case LanguagePackage.DATE__HOURS:
				return getHours();
			case LanguagePackage.DATE__MINUTES:
				return getMinutes();
			case LanguagePackage.DATE__SECOND:
				return getSecond();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case LanguagePackage.DATE__DAY:
				setDay((String)newValue);
				return;
			case LanguagePackage.DATE__MONTH:
				setMonth((String)newValue);
				return;
			case LanguagePackage.DATE__YEAR:
				setYear((String)newValue);
				return;
			case LanguagePackage.DATE__HOURS:
				setHours((String)newValue);
				return;
			case LanguagePackage.DATE__MINUTES:
				setMinutes((String)newValue);
				return;
			case LanguagePackage.DATE__SECOND:
				setSecond((String)newValue);
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
			case LanguagePackage.DATE__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case LanguagePackage.DATE__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case LanguagePackage.DATE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case LanguagePackage.DATE__HOURS:
				setHours(HOURS_EDEFAULT);
				return;
			case LanguagePackage.DATE__MINUTES:
				setMinutes(MINUTES_EDEFAULT);
				return;
			case LanguagePackage.DATE__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case LanguagePackage.DATE__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case LanguagePackage.DATE__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case LanguagePackage.DATE__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case LanguagePackage.DATE__HOURS:
				return HOURS_EDEFAULT == null ? hours != null : !HOURS_EDEFAULT.equals(hours);
			case LanguagePackage.DATE__MINUTES:
				return MINUTES_EDEFAULT == null ? minutes != null : !MINUTES_EDEFAULT.equals(minutes);
			case LanguagePackage.DATE__SECOND:
				return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (day: ");
		result.append(day);
		result.append(", month: ");
		result.append(month);
		result.append(", year: ");
		result.append(year);
		result.append(", hours: ");
		result.append(hours);
		result.append(", minutes: ");
		result.append(minutes);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} //DATEImpl

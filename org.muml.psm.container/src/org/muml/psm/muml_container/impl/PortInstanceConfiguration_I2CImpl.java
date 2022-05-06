/**
 */
package org.muml.psm.muml_container.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration_I2C;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance Configuration I2C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_I2CImpl#getOwnI2cAddress <em>Own I2c Address</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_I2CImpl#getOtherI2cAddress <em>Other I2c Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortInstanceConfiguration_I2CImpl extends PortInstanceConfigurationImpl implements PortInstanceConfiguration_I2C {
	/**
	 * The default value of the '{@link #getOwnI2cAddress() <em>Own I2c Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnI2cAddress()
	 * @generated
	 * @ordered
	 */
	protected static final int OWN_I2C_ADDRESS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getOwnI2cAddress() <em>Own I2c Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnI2cAddress()
	 * @generated
	 * @ordered
	 */
	protected int ownI2cAddress = OWN_I2C_ADDRESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getOtherI2cAddress() <em>Other I2c Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherI2cAddress()
	 * @generated
	 * @ordered
	 */
	protected static final int OTHER_I2C_ADDRESS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getOtherI2cAddress() <em>Other I2c Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherI2cAddress()
	 * @generated
	 * @ordered
	 */
	protected int otherI2cAddress = OTHER_I2C_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInstanceConfiguration_I2CImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_I2C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOwnI2cAddress() {
		return ownI2cAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnI2cAddress(int newOwnI2cAddress) {
		int oldOwnI2cAddress = ownI2cAddress;
		ownI2cAddress = newOwnI2cAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OWN_I2C_ADDRESS, oldOwnI2cAddress, ownI2cAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOtherI2cAddress() {
		return otherI2cAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherI2cAddress(int newOtherI2cAddress) {
		int oldOtherI2cAddress = otherI2cAddress;
		otherI2cAddress = newOtherI2cAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OTHER_I2C_ADDRESS, oldOtherI2cAddress, otherI2cAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OWN_I2C_ADDRESS:
				return getOwnI2cAddress();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OTHER_I2C_ADDRESS:
				return getOtherI2cAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OWN_I2C_ADDRESS:
				setOwnI2cAddress((Integer)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OTHER_I2C_ADDRESS:
				setOtherI2cAddress((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OWN_I2C_ADDRESS:
				setOwnI2cAddress(OWN_I2C_ADDRESS_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OTHER_I2C_ADDRESS:
				setOtherI2cAddress(OTHER_I2C_ADDRESS_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OWN_I2C_ADDRESS:
				return ownI2cAddress != OWN_I2C_ADDRESS_EDEFAULT;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_I2C__OTHER_I2C_ADDRESS:
				return otherI2cAddress != OTHER_I2C_ADDRESS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ownI2cAddress: ");
		result.append(ownI2cAddress);
		result.append(", otherI2cAddress: ");
		result.append(otherI2cAddress);
		result.append(')');
		return result.toString();
	}

} //PortInstanceConfiguration_I2CImpl

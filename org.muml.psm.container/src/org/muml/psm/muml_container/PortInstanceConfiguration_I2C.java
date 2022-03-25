/**
 */
package org.muml.psm.muml_container;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance Configuration I2C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_I2C#getOwnI2cAddress <em>Own I2c Address</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_I2C#getOtherI2cAddress <em>Other I2c Address</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_I2C()
 * @model
 * @generated
 */
public interface PortInstanceConfiguration_I2C extends PortInstanceConfiguration {

	/**
	 * Returns the value of the '<em><b>Own I2c Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own I2c Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own I2c Address</em>' attribute.
	 * @see #setOwnI2cAddress(int)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_I2C_OwnI2cAddress()
	 * @model
	 * @generated
	 */
	int getOwnI2cAddress();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_I2C#getOwnI2cAddress <em>Own I2c Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Own I2c Address</em>' attribute.
	 * @see #getOwnI2cAddress()
	 * @generated
	 */
	void setOwnI2cAddress(int value);

	/**
	 * Returns the value of the '<em><b>Other I2c Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other I2c Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other I2c Address</em>' attribute.
	 * @see #setOtherI2cAddress(int)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_I2C_OtherI2cAddress()
	 * @model
	 * @generated
	 */
	int getOtherI2cAddress();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_I2C#getOtherI2cAddress <em>Other I2c Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other I2c Address</em>' attribute.
	 * @see #getOtherI2cAddress()
	 * @generated
	 */
	void setOtherI2cAddress(int value);
} // PortInstanceConfiguration_I2C

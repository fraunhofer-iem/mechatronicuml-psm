/**
 */
package org.muml.psm.muml_container;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance Configuration MQTT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getWiFi_ssid <em>Wi Fi ssid</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getWiFi_pass <em>Wi Fi pass</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getMQTT_serverAddress <em>MQTT server Address</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getMQTT_serverPort <em>MQTT server Port</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getPublishingTopic <em>Publishing Topic</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getSubscriptionTopic <em>Subscription Topic</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_MQTT()
 * @model
 * @generated
 */
public interface PortInstanceConfiguration_MQTT extends PortInstanceConfiguration {

	/**
	 * Returns the value of the '<em><b>Wi Fi ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wi Fi ssid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wi Fi ssid</em>' attribute.
	 * @see #setWiFi_ssid(String)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_MQTT_WiFi_ssid()
	 * @model
	 * @generated
	 */
	String getWiFi_ssid();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getWiFi_ssid <em>Wi Fi ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wi Fi ssid</em>' attribute.
	 * @see #getWiFi_ssid()
	 * @generated
	 */
	void setWiFi_ssid(String value);

	/**
	 * Returns the value of the '<em><b>Wi Fi pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wi Fi pass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wi Fi pass</em>' attribute.
	 * @see #setWiFi_pass(String)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_MQTT_WiFi_pass()
	 * @model
	 * @generated
	 */
	String getWiFi_pass();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getWiFi_pass <em>Wi Fi pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wi Fi pass</em>' attribute.
	 * @see #getWiFi_pass()
	 * @generated
	 */
	void setWiFi_pass(String value);

	/**
	 * Returns the value of the '<em><b>MQTT server Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MQTT server Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MQTT server Address</em>' attribute.
	 * @see #setMQTT_serverAddress(String)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_MQTT_MQTT_serverAddress()
	 * @model
	 * @generated
	 */
	String getMQTT_serverAddress();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getMQTT_serverAddress <em>MQTT server Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MQTT server Address</em>' attribute.
	 * @see #getMQTT_serverAddress()
	 * @generated
	 */
	void setMQTT_serverAddress(String value);

	/**
	 * Returns the value of the '<em><b>MQTT server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MQTT server Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MQTT server Port</em>' attribute.
	 * @see #setMQTT_serverPort(int)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_MQTT_MQTT_serverPort()
	 * @model
	 * @generated
	 */
	int getMQTT_serverPort();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getMQTT_serverPort <em>MQTT server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MQTT server Port</em>' attribute.
	 * @see #getMQTT_serverPort()
	 * @generated
	 */
	void setMQTT_serverPort(int value);

	/**
	 * Returns the value of the '<em><b>Publishing Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishing Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Topic</em>' attribute.
	 * @see #setPublishingTopic(String)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_MQTT_PublishingTopic()
	 * @model
	 * @generated
	 */
	String getPublishingTopic();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getPublishingTopic <em>Publishing Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishing Topic</em>' attribute.
	 * @see #getPublishingTopic()
	 * @generated
	 */
	void setPublishingTopic(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Topic</em>' attribute.
	 * @see #setSubscriptionTopic(String)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_MQTT_SubscriptionTopic()
	 * @model
	 * @generated
	 */
	String getSubscriptionTopic();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT#getSubscriptionTopic <em>Subscription Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Topic</em>' attribute.
	 * @see #getSubscriptionTopic()
	 * @generated
	 */
	void setSubscriptionTopic(String value);
} // PortInstanceConfiguration_MQTT

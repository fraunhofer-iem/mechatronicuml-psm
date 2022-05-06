/**
 */
package org.muml.psm.muml_container.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration_MQTT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance Configuration MQTT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_MQTTImpl#getWiFi_ssid <em>Wi Fi ssid</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_MQTTImpl#getWiFi_pass <em>Wi Fi pass</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_MQTTImpl#getMQTT_serverAddress <em>MQTT server Address</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_MQTTImpl#getMQTT_serverPort <em>MQTT server Port</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_MQTTImpl#getPublishingTopic <em>Publishing Topic</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_MQTTImpl#getSubscriptionTopic <em>Subscription Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortInstanceConfiguration_MQTTImpl extends PortInstanceConfigurationImpl implements PortInstanceConfiguration_MQTT {
	/**
	 * The default value of the '{@link #getWiFi_ssid() <em>Wi Fi ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiFi_ssid()
	 * @generated
	 * @ordered
	 */
	protected static final String WI_FI_SSID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWiFi_ssid() <em>Wi Fi ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiFi_ssid()
	 * @generated
	 * @ordered
	 */
	protected String wiFi_ssid = WI_FI_SSID_EDEFAULT;
	/**
	 * The default value of the '{@link #getWiFi_pass() <em>Wi Fi pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiFi_pass()
	 * @generated
	 * @ordered
	 */
	protected static final String WI_FI_PASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWiFi_pass() <em>Wi Fi pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiFi_pass()
	 * @generated
	 * @ordered
	 */
	protected String wiFi_pass = WI_FI_PASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getMQTT_serverAddress() <em>MQTT server Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_serverAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MQTT_SERVER_ADDRESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMQTT_serverAddress() <em>MQTT server Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_serverAddress()
	 * @generated
	 * @ordered
	 */
	protected String mqtT_serverAddress = MQTT_SERVER_ADDRESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getMQTT_serverPort() <em>MQTT server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_serverPort()
	 * @generated
	 * @ordered
	 */
	protected static final int MQTT_SERVER_PORT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMQTT_serverPort() <em>MQTT server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_serverPort()
	 * @generated
	 * @ordered
	 */
	protected int mqtT_serverPort = MQTT_SERVER_PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getPublishingTopic() <em>Publishing Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHING_TOPIC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPublishingTopic() <em>Publishing Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingTopic()
	 * @generated
	 * @ordered
	 */
	protected String publishingTopic = PUBLISHING_TOPIC_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubscriptionTopic() <em>Subscription Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_TOPIC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubscriptionTopic() <em>Subscription Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTopic()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionTopic = SUBSCRIPTION_TOPIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInstanceConfiguration_MQTTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_MQTT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWiFi_ssid() {
		return wiFi_ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWiFi_ssid(String newWiFi_ssid) {
		String oldWiFi_ssid = wiFi_ssid;
		wiFi_ssid = newWiFi_ssid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_SSID, oldWiFi_ssid, wiFi_ssid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWiFi_pass() {
		return wiFi_pass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWiFi_pass(String newWiFi_pass) {
		String oldWiFi_pass = wiFi_pass;
		wiFi_pass = newWiFi_pass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_PASS, oldWiFi_pass, wiFi_pass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMQTT_serverAddress() {
		return mqtT_serverAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMQTT_serverAddress(String newMQTT_serverAddress) {
		String oldMQTT_serverAddress = mqtT_serverAddress;
		mqtT_serverAddress = newMQTT_serverAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_ADDRESS, oldMQTT_serverAddress, mqtT_serverAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMQTT_serverPort() {
		return mqtT_serverPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMQTT_serverPort(int newMQTT_serverPort) {
		int oldMQTT_serverPort = mqtT_serverPort;
		mqtT_serverPort = newMQTT_serverPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_PORT, oldMQTT_serverPort, mqtT_serverPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishingTopic() {
		return publishingTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishingTopic(String newPublishingTopic) {
		String oldPublishingTopic = publishingTopic;
		publishingTopic = newPublishingTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__PUBLISHING_TOPIC, oldPublishingTopic, publishingTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriptionTopic() {
		return subscriptionTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionTopic(String newSubscriptionTopic) {
		String oldSubscriptionTopic = subscriptionTopic;
		subscriptionTopic = newSubscriptionTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__SUBSCRIPTION_TOPIC, oldSubscriptionTopic, subscriptionTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_SSID:
				return getWiFi_ssid();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_PASS:
				return getWiFi_pass();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_ADDRESS:
				return getMQTT_serverAddress();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_PORT:
				return getMQTT_serverPort();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__PUBLISHING_TOPIC:
				return getPublishingTopic();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__SUBSCRIPTION_TOPIC:
				return getSubscriptionTopic();
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_SSID:
				setWiFi_ssid((String)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_PASS:
				setWiFi_pass((String)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_ADDRESS:
				setMQTT_serverAddress((String)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_PORT:
				setMQTT_serverPort((Integer)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__PUBLISHING_TOPIC:
				setPublishingTopic((String)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__SUBSCRIPTION_TOPIC:
				setSubscriptionTopic((String)newValue);
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_SSID:
				setWiFi_ssid(WI_FI_SSID_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_PASS:
				setWiFi_pass(WI_FI_PASS_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_ADDRESS:
				setMQTT_serverAddress(MQTT_SERVER_ADDRESS_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_PORT:
				setMQTT_serverPort(MQTT_SERVER_PORT_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__PUBLISHING_TOPIC:
				setPublishingTopic(PUBLISHING_TOPIC_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__SUBSCRIPTION_TOPIC:
				setSubscriptionTopic(SUBSCRIPTION_TOPIC_EDEFAULT);
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_SSID:
				return WI_FI_SSID_EDEFAULT == null ? wiFi_ssid != null : !WI_FI_SSID_EDEFAULT.equals(wiFi_ssid);
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_PASS:
				return WI_FI_PASS_EDEFAULT == null ? wiFi_pass != null : !WI_FI_PASS_EDEFAULT.equals(wiFi_pass);
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_ADDRESS:
				return MQTT_SERVER_ADDRESS_EDEFAULT == null ? mqtT_serverAddress != null : !MQTT_SERVER_ADDRESS_EDEFAULT.equals(mqtT_serverAddress);
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_PORT:
				return mqtT_serverPort != MQTT_SERVER_PORT_EDEFAULT;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__PUBLISHING_TOPIC:
				return PUBLISHING_TOPIC_EDEFAULT == null ? publishingTopic != null : !PUBLISHING_TOPIC_EDEFAULT.equals(publishingTopic);
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__SUBSCRIPTION_TOPIC:
				return SUBSCRIPTION_TOPIC_EDEFAULT == null ? subscriptionTopic != null : !SUBSCRIPTION_TOPIC_EDEFAULT.equals(subscriptionTopic);
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
		result.append(" (WiFi_ssid: ");
		result.append(wiFi_ssid);
		result.append(", WiFi_pass: ");
		result.append(wiFi_pass);
		result.append(", MQTT_serverAddress: ");
		result.append(mqtT_serverAddress);
		result.append(", MQTT_serverPort: ");
		result.append(mqtT_serverPort);
		result.append(", publishingTopic: ");
		result.append(publishingTopic);
		result.append(", subscriptionTopic: ");
		result.append(subscriptionTopic);
		result.append(')');
		return result.toString();
	}

} //PortInstanceConfiguration_MQTTImpl

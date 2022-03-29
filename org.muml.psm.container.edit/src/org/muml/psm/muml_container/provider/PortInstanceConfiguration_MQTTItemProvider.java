/**
 */
package org.muml.psm.muml_container.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration_MQTT;

/**
 * This is the item provider adapter for a {@link org.muml.psm.muml_container.PortInstanceConfiguration_MQTT} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortInstanceConfiguration_MQTTItemProvider extends PortInstanceConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceConfiguration_MQTTItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addWiFi_ssidPropertyDescriptor(object);
			addWiFi_passPropertyDescriptor(object);
			addMQTT_serverAddressPropertyDescriptor(object);
			addMQTT_serverPortPropertyDescriptor(object);
			addPublishingTopicPropertyDescriptor(object);
			addSubscriptionTopicPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Wi Fi ssid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWiFi_ssidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_MQTT_WiFi_ssid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_MQTT_WiFi_ssid_feature", "_UI_PortInstanceConfiguration_MQTT_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_SSID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wi Fi pass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWiFi_passPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_MQTT_WiFi_pass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_MQTT_WiFi_pass_feature", "_UI_PortInstanceConfiguration_MQTT_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_PASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the MQTT server Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMQTT_serverAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_MQTT_MQTT_serverAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_MQTT_MQTT_serverAddress_feature", "_UI_PortInstanceConfiguration_MQTT_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the MQTT server Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMQTT_serverPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_MQTT_MQTT_serverPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_MQTT_MQTT_serverPort_feature", "_UI_PortInstanceConfiguration_MQTT_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publishing Topic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishingTopicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_MQTT_publishingTopic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_MQTT_publishingTopic_feature", "_UI_PortInstanceConfiguration_MQTT_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_MQTT__PUBLISHING_TOPIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subscription Topic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscriptionTopicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_MQTT_subscriptionTopic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_MQTT_subscriptionTopic_feature", "_UI_PortInstanceConfiguration_MQTT_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_MQTT__SUBSCRIPTION_TOPIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PortInstanceConfiguration_MQTT.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PortInstanceConfiguration_MQTT"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PortInstanceConfiguration_MQTT)object).getWiFi_ssid();
		return label == null || label.length() == 0 ?
			getString("_UI_PortInstanceConfiguration_MQTT_type") :
			getString("_UI_PortInstanceConfiguration_MQTT_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PortInstanceConfiguration_MQTT.class)) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_SSID:
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__WI_FI_PASS:
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_ADDRESS:
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__MQTT_SERVER_PORT:
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__PUBLISHING_TOPIC:
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_MQTT__SUBSCRIPTION_TOPIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}

/**
 */
package de.uni_paderborn.fujaba.muml.psm.presentation;

import de.uni_paderborn.fujaba.muml.actionlanguage.provider.ActionlanguageEditPlugin;

import de.uni_paderborn.fujaba.muml.component.provider.MumlEditPlugin;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.provider.HardwareEditPlugin;

import de.uni_paderborn.fujaba.muml.swplatform.provider.SwplatformEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.storydriven.core.provider.CoreEditPlugin;

/**
 * This is the central singleton for the Psm editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PsmEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PsmEditorPlugin INSTANCE = new PsmEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmEditorPlugin() {
		super
			(new ResourceLocator [] {
				ActionlanguageEditPlugin.INSTANCE,
				CoreEditPlugin.INSTANCE,
				HardwareEditPlugin.INSTANCE,
				MumlEditPlugin.INSTANCE,
				SwplatformEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}

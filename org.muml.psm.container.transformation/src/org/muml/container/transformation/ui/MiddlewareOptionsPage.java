package org.muml.container.transformation.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.muml.container.transformation.job.MiddlewareOption;

/**
 * An Eclipse-wizard page to select the desired middleware configuration options when the container model is generated.
 * The page allows the wizard to retrieve the configuration so it can be handed over to the container transformation.
 * 
 * @author David
 *
 */
public class MiddlewareOptionsPage extends WizardPage {
	
	private final static String pageTitle = "Middleware Configuration Options";
	
	private Button ddsButton, mqttI2cButton;
	
	public MiddlewareOptionsPage(){
		super(pageTitle);
		setTitle(pageTitle);
		setDescription("Select one of the following " + pageTitle);
	}

	@Override
	public void createControl(Composite parent) {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(gridLayout);
		
		ddsButton = new Button(container, SWT.RADIO);
		ddsButton.setText("DDS Middleware Configuration");
		
		mqttI2cButton = new Button(container, SWT.RADIO);
		mqttI2cButton.setText("MQTT and I2C Middleware Configuration");
		mqttI2cButton.setSelection(true);
				
		setControl(container);
	}
	
	/**
	 * Retrieve the selection made in the wizard page.
	 * The wizard page only allows one radio button to be active, so exactly one option is chosen and returned.
	 * 
	 * @return the selected MiddlewareOptions-value
	 */
	public MiddlewareOption getSelectedMiddleware(){
		if (ddsButton.getSelection()){
			return MiddlewareOption.DDS_CONFIG;
		} else { // if (mqttI2cButton.getSelection()){
			return MiddlewareOption.MQTT_I2C_CONFIG;
		}
	}

}

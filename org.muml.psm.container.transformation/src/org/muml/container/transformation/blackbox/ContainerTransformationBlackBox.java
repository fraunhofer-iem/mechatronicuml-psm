package org.muml.container.transformation.blackbox;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.muml.pim.common.naming.MumlQualifiedNameProvider;
import org.muml.pim.common.naming.QualifiedNameProvider;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;


/**
 * QVTo BlackBox class with helper and utility functions for QVTo transformation scripts.
 * Registered as org.muml.container._library.DDSHelperBlackBox for the QVTo extension point org.eclipse.m2m.qvt.oml.javaBlackboxUnits.
 * 
 * To use these functions, import the library into the QVTo script as follows: import org.muml.container._library.DDSHelperBlackBox;
 */
public class ContainerTransformationBlackBox {

	

	public static final QualifiedNameProvider nameProvider = new MumlQualifiedNameProvider();

	public static String getName(EObject obj) {
		String name = nameProvider.getQualifiedName(obj).toString();
		String alphaAndDigits = name.replaceAll("\\W", "");
		return alphaAndDigits;
	}

	/**
	 * This function computes a hash for a SET of EObjects based on their ID
	 * 
	 * @param eobjects
	 * @return
	 */
	public static Short getHash(Collection<Object> objects) {
		ArrayList<Integer> idList = new ArrayList<Integer>();
		for (Object eobject : objects) {
			EObject ob = (EObject) eobject;
			idList.add(EcoreUtil.getURI(ob).hashCode());
		}
		Collections.sort(idList);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		for (Integer id : idList) {
			outputStream.write(id.byteValue());
		}
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] thedigest = md.digest(outputStream.toByteArray());

		ByteBuffer wrapped = ByteBuffer.wrap(thedigest); // big-endian by
															// default
		short shortHashCode = wrapped.getShort(); // 1
		return shortHashCode;

	}
	
	
	/** QVTo blackbox method to get system time for performance measurement
	 * @author upohl
	 * @return long current system time in ms
	 * @param void
	 * */
	public static long getCurrentTime()
	{
		return System.currentTimeMillis();
	}

	public static StructuredResourceInstance getNextHopECU(StructuredResourceInstance startECU,
			StructuredResourceInstance targetECU, HWPlatformInstanceConfiguration rootHWPlatformInstanceConfiguration) {
		return Routing.getNextHopECU(startECU, targetECU, rootHWPlatformInstanceConfiguration);
	}

	public static HWPortInstance getNetworkInterface(StructuredResourceInstance startECU,
			StructuredResourceInstance targetECU, HWPlatformInstanceConfiguration rootHWPlatformInstanceConfiguration) {
		return Routing.getNetworkInterface(startECU, targetECU, rootHWPlatformInstanceConfiguration);
	}
	
	/**
	 * Gives access to the configuration properties that can be stored in the execution context of a QVTo transformation.
	 * Intended use for properties with String-value only!
	 * To be called from a QVTo script in order to access the desired configuration property.,
	 * 
	 * Usage in QVTo as follows: 'propertyName'.getConfigProperty();
	 * 
	 * @author David
	 * 
	 * @param context The execution context holding the properties
	 * @param propertyName the name of the context property to access 
	 * @return the value of the accessed context property as a String
	 */
	@Operation(contextual=true, withExecutionContext=true)
	public String getConfigProperty(IContext context, String propertyName){
		return context.getConfigProperty(propertyName).toString();
	}
	
	/**
	 * Simply prints a message to System.out - can be used for debugging from a QVTo script.
	 * Usage in QVTo: logToConsole("message");
	 * 
	 * @author David
	 * 
	 * @param message the String message to be printed
	 */
	@Operation (kind=Kind.HELPER)
	public void logToConsole(String message) {
		System.out.println(message);
	}
}

package t2m;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.runtime.*;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import utils.Utils;

public class Transformation {

	/**
	 * (*+)las paths deben ser absolutas por ejemplo /home/user/desktop... o la
	 * url de un wsdl
	 * 
	 * @param qvtoPath
	 * @param ginpath
	 * @param outpath
	 * @throws IOException
	 */
	public void startTransformation(String inpath, String outpath) throws IOException {
		// (*+) esta es la ruta de la transformacion
		URI uriTransformation = URI.createURI("platform:/resource/transforms/wsdlToRequest.qvto");
		ExecutionContextImpl context = new ExecutionContextImpl();
		EList<EObject> inObjects = Utils.getFromXMI(inpath);
		TransformationExecutor fExecutor = new TransformationExecutor(uriTransformation);
		// (*+) para debugear la transformacion qvto
		// context.setLog(new WriterLog(new OutputStreamWriter(System.out)));
		// create the input extent with its initial contents
		ModelExtent input = new BasicModelExtent(inObjects);
		// create an empty extent to catch the output
		ModelExtent output = new BasicModelExtent();
		// setup the execution environment details ->
		// configuration properties, logger, monitor object etc.
		// run the transformation assigned to the executor with the given
		ExecutionDiagnostic result = fExecutor.execute(context, input, output);
		// check the result for success
		if (result.getSeverity() == Diagnostic.OK) {
			// the output objects got captured in the output extent
			List<EObject> outObjects = output.getContents();
			// let's persist them using a resource
			ResourceSet resourceSet2 = new ResourceSetImpl();
			resourceSet2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
			Resource outResource = resourceSet2.createResource(URI.createURI("file://" + outpath));
			outResource.getContents().addAll(outObjects);
			outResource.save(Collections.emptyMap());
		} else {
			// turn the result diagnostic into status and send it to error log
			IStatus status = BasicDiagnostic.toIStatus(result);
			System.err.println(status.getMessage());
		}
	}
}

/*
 */
package de.jena.piveau.dcat.util;

import de.jena.piveau.dcat.DcatPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.annotation.provide.ProvideEMFResourceConfigurator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.jena.piveau.dcat.util.DcatResourceImpl
 * @generated
 */
 @Component( name = DcatPackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = DcatPackage.eNAME + "Package", service = DcatPackage.class, cardinality = ReferenceCardinality.MANDATORY), property = { EMFNamespaces.EMF_RESOURCE_CONFIGURATOR_CONTENT_TYPE + "=application/rdf+xml", EMFNamespaces.EMF_RESOURCE_CONFIGURATOR_FILE_EXT + "=rdf", EMFNamespaces.EMF_RESOURCE_CONFIGURATOR_NAME + "=RDFFactory"}
 )
 @ProvideEMFResourceConfigurator( name = DcatPackage.eNAME,
	contentType = { "application/rdf+xml" }, 
	fileExtension = {
	"rdf"
 	},  
	version = "1.0"
)
public class DcatResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcatResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		XMLResource result = new DcatResourceImpl(uri);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		return result;
	}

} //DcatResourceFactoryImpl

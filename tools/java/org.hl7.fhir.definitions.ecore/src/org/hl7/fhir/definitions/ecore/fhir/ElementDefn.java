/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hl7.fhir.definitions.ecore.fhir;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Defn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getMaxCardinality <em>Max Cardinality</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getMinCardinality <em>Min Cardinality</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#isAllowDAR <em>Allow DAR</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#isMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#isMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getTypes <em>Types</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getExampleValue <em>Example Value</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getElements <em>Elements</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn()
 * @model
 * @generated
 */
public interface ElementDefn extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cardinality</em>' attribute.
	 * @see #setMaxCardinality(int)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_MaxCardinality()
	 * @model
	 * @generated
	 */
	int getMaxCardinality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getMaxCardinality <em>Max Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cardinality</em>' attribute.
	 * @see #getMaxCardinality()
	 * @generated
	 */
	void setMaxCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Min Cardinality</b></em>' attribute.
	 * The default value is <code>"-2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cardinality</em>' attribute.
	 * @see #setMinCardinality(int)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_MinCardinality()
	 * @model default="-2"
	 * @generated
	 */
	int getMinCardinality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getMinCardinality <em>Min Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cardinality</em>' attribute.
	 * @see #getMinCardinality()
	 * @generated
	 */
	void setMinCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Allow DAR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow DAR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow DAR</em>' attribute.
	 * @see #setAllowDAR(boolean)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_AllowDAR()
	 * @model
	 * @generated
	 */
	boolean isAllowDAR();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#isAllowDAR <em>Allow DAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow DAR</em>' attribute.
	 * @see #isAllowDAR()
	 * @generated
	 */
	void setAllowDAR(boolean value);

	/**
	 * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Understand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' attribute.
	 * @see #setMustUnderstand(boolean)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_MustUnderstand()
	 * @model
	 * @generated
	 */
	boolean isMustUnderstand();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#isMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' attribute.
	 * @see #isMustUnderstand()
	 * @generated
	 */
	void setMustUnderstand(boolean value);

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' reference.
	 * @see #setInvariant(Invariant)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_Invariant()
	 * @model
	 * @generated
	 */
	Invariant getInvariant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getInvariant <em>Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' reference.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Support</em>' attribute.
	 * @see #setMustSupport(boolean)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_MustSupport()
	 * @model
	 * @generated
	 */
	boolean isMustSupport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#isMustSupport <em>Must Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support</em>' attribute.
	 * @see #isMustSupport()
	 * @generated
	 */
	void setMustSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.definitions.ecore.fhir.TypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_Types()
	 * @model containment="true"
	 *        extendedMetaData="name='type'"
	 * @generated
	 */
	EList<TypeRef> getTypes();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(BindingRef)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_Binding()
	 * @model
	 * @generated
	 */
	BindingRef getBinding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BindingRef value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotations)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_Annotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Annotations getAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotations value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_Name()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.definitions.ecore.fhir.Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_Mappings()
	 * @model containment="true"
	 *        extendedMetaData="name='mapping'"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Example Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Value</em>' attribute.
	 * @see #setExampleValue(String)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_ExampleValue()
	 * @model
	 * @generated
	 */
	String getExampleValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getExampleValue <em>Example Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Value</em>' attribute.
	 * @see #getExampleValue()
	 * @generated
	 */
	void setExampleValue(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_Elements()
	 * @model containment="true"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<ElementDefn> getElements();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(ElementDefn)
	 * @see org.hl7.fhir.definitions.ecore.fhir.FhirPackage#getElementDefn_Content()
	 * @model
	 * @generated
	 */
	ElementDefn getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.definitions.ecore.fhir.ElementDefn#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ElementDefn value);

} // ElementDefn

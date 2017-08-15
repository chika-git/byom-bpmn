/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DocumentRoot#getAbstractActivity <em>Abstract Activity</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Activity</em>' containment reference.
	 * @see #setAbstractActivity(AbstractActivity)
	 * @see model.ModelPackage#getDocumentRoot_AbstractActivity()
	 * @model containment="true" upper="-2"
	 *        extendedMetaData="kind='element' name='abstractActivity'"
	 * @generated
	 */
	AbstractActivity getAbstractActivity();

	/**
	 * Sets the value of the '{@link model.DocumentRoot#getAbstractActivity <em>Abstract Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Activity</em>' containment reference.
	 * @see #getAbstractActivity()
	 * @generated
	 */
	void setAbstractActivity(AbstractActivity value);

} // DocumentRoot

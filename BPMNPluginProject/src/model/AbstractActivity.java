/**
 */
package model;

import org.eclipse.bpmn2.ServiceTask;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.AbstractActivity#getAID <em>AID</em>}</li>
 *   <li>{@link model.AbstractActivity#getAName <em>AName</em>}</li>
 *   <li>{@link model.AbstractActivity#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAbstractActivity()
 * @model
 * @generated
 */
public interface AbstractActivity extends ServiceTask {
	/**
	 * Returns the value of the '<em><b>AID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AID</em>' attribute.
	 * @see #setAID(String)
	 * @see model.ModelPackage#getAbstractActivity_AID()
	 * @model default=""
	 * @generated
	 */
	String getAID();

	/**
	 * Sets the value of the '{@link model.AbstractActivity#getAID <em>AID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AID</em>' attribute.
	 * @see #getAID()
	 * @generated
	 */
	void setAID(String value);

	/**
	 * Returns the value of the '<em><b>AName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AName</em>' attribute.
	 * @see #setAName(String)
	 * @see model.ModelPackage#getAbstractActivity_AName()
	 * @model
	 * @generated
	 */
	String getAName();

	/**
	 * Sets the value of the '{@link model.AbstractActivity#getAName <em>AName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AName</em>' attribute.
	 * @see #getAName()
	 * @generated
	 */
	void setAName(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' map.
	 * @see model.ModelPackage#getAbstractActivity_Context()
	 * @model mapType="model.Context<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getContext();

} // AbstractActivity

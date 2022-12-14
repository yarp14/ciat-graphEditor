/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.IndividualTask#getTaskRoles <em>Task Roles</em>}</li>
 *   <li>{@link ciat.IndividualTask#getTaskObjects <em>Task Objects</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getIndividualTask()
 * @model annotation="gmf.node label='name' tool.name='Individual' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/IndividualInteractionTask.gif'"
 * @generated
 */
public interface IndividualTask extends SimpleTask {
	/**
	 * Returns the value of the '<em><b>Task Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Roles</em>' containment reference.
	 * @see #setTaskRoles(SociogramNode)
	 * @see ciat.CiatPackage#getIndividualTask_TaskRoles()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	SociogramNode getTaskRoles();

	/**
	 * Sets the value of the '{@link ciat.IndividualTask#getTaskRoles <em>Task Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Roles</em>' containment reference.
	 * @see #getTaskRoles()
	 * @generated
	 */
	void setTaskRoles(SociogramNode value);

	/**
	 * Returns the value of the '<em><b>Task Objects</b></em>' containment reference list.
	 * The list contents are of type {@link ciat.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Objects</em>' containment reference list.
	 * @see ciat.CiatPackage#getIndividualTask_TaskObjects()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<ciat.Object> getTaskObjects();

} // IndividualTask

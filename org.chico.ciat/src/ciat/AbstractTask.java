/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.AbstractTask#getProcessNodes <em>Process Nodes</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getAbstractTask()
 * @model annotation="gmf.node label='name' tool.name='Abstract' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/Abstract.gif'"
 * @generated
 */
public interface AbstractTask extends SimpleTask {
	/**
	 * Returns the value of the '<em><b>Process Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link ciat.ProcessNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Nodes</em>' containment reference list.
	 * @see ciat.CiatPackage#getAbstractTask_ProcessNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<ProcessNode> getProcessNodes();

} // AbstractTask

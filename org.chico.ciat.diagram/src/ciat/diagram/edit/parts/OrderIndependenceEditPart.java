/*
 * 
 */
package ciat.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import ciat.diagram.edit.policies.OrderIndependenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class OrderIndependenceEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4013;

	/**
	* @generated
	*/
	public OrderIndependenceEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new OrderIndependenceItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new OrderIndependenceFigure();
	}

	/**
	* @generated
	*/
	public OrderIndependenceFigure getPrimaryShape() {
		return (OrderIndependenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class OrderIndependenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public OrderIndependenceFigure() {
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}

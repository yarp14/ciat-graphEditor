/*
* 
*/
package ciat.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import ciat.diagram.part.CiatVisualIDRegistry;

/**
 * @generated
 */
public class CiatNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7022;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7021;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof CiatNavigatorItem) {
			CiatNavigatorItem item = (CiatNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CiatVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}

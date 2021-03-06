/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.xtext.httprouting.route.Dependency
import org.xtext.httprouting.route.Route

class RouteOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	def _isLeaf(Route r) { true }
	def _isLeaf(Dependency r) { true }
	
}
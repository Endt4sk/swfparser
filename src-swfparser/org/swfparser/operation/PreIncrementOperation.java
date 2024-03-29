/*
 *   PreIncrementOperation.java
 * 	 @Author Oleg Gorobets
 *   Created: 25.08.2007
 *   CVS-ID: $Id: 
 *************************************************************************/

package org.swfparser.operation;

import java.util.Stack;

import org.swfparser.Operation;

public class PreIncrementOperation extends AssignIncrementOperation {

	public PreIncrementOperation(Operation op) {
		super(op);
	}

	public PreIncrementOperation(Stack<Operation> stack) {
		super(stack);
	}
	
	@Override
	protected String getPostfix() {
		return "";
	}

	@Override
	protected String getPrefix() {
		return "++";
	}
	
}

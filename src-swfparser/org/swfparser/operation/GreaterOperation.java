/*
 *   GreaterOperation.java
 * 	 @Author Oleg Gorobets
 *   Created: 26.07.2007
 *   CVS-ID: $Id: 
 *************************************************************************/

package org.swfparser.operation;

import java.util.Stack;

import org.swfparser.Operation;
import org.swfparser.Priority;

public class GreaterOperation extends BinaryBooleanOperation {

	public GreaterOperation(Operation op1, Operation op2) {
		super(op1, op2);
	}

	public GreaterOperation(Stack<Operation> stack) {
		super(stack);
	}

	@Override
	public String getSign() {
		return ">";
	}

	@Override
	public int getPriority() {
		return Priority.BOOLEAN;
	}

	@Override
	public Operation getInvertedOperation() {
		return new LessOrEqualOperation(leftOp,rightOp);
	}
	
}

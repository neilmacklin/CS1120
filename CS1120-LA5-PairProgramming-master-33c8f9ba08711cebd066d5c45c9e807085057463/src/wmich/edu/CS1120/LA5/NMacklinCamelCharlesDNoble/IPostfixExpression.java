package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

public interface IPostfixExpression {
	/**
	* Calculates the result of the expression using a stack and returns it.
	* @return the result obtained for the expression.
	*/
	int calculateResult();
	/**
	* Returns the arithmetic expression in string format.
	* @return the result obtained for the expression.
	*/
	String getPostfixExpression();
	/**
	* Sets the arithmetic expression (in string format).
	* @param expression the new expression. **/
	void setPostfixExpression(String expression);
	
	/**
	* Sets the IStack attribute in this class.
	* @param stack the new stack.
	*/
	void setStack(IStack stack);
}


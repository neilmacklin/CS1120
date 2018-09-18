package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

public class PostfixExpression implements IPostfixExpression {
	//Private fields containing: expression and stack
	private String expression;
	private IStack<String> stack = new Stack<String>(); 
	
	
	//Constructor with 1 parameter: expression 
	/**
	 * @param expression the expression that will be decoded
	 */
	public PostfixExpression(String expression) {
		this.expression = expression;
	}
	
	//Method calculateResult: calculates the result of the expression using a stack and returns it
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IPostfixExpression#calculateResult()
	 */
	public int calculateResult() {
		int nextComma = 0;
		String token = "";
		int op1, op2 = 0;
		boolean last = false;
		
		//while expression’s length > 0
		while(!last) {
			//if expression contains “,”
			if(this.expression.contains(",")) {
				nextComma = this.expression.indexOf(",");
				token = this.expression.substring(0,nextComma);
			} else {
				token = this.expression;
				last = true;
			}

			if(Character.isDigit(token.charAt(0))) {
				this.stack.push(token);
			} else {
				//pop two nodes off the stack and parse their data to Integer
				op2 = Integer.parseInt(this.stack.pop());
				op1 = Integer.parseInt(this.stack.pop());
				Integer result;
				//evaluate operation
				switch(token.charAt(0)) {
					case '+':
						result = op1+op2;
						this.stack.push(result.toString());
						break;
					case '*':
						result = op1*op2;
						this.stack.push(result.toString());
						break;
					case '-':
						result = op1-op2;
						this.stack.push(result.toString());
						break;
					case '/':
						result = op1/op2;
						this.stack.push(result.toString());
						break;
				}
			}
			if(!last)
				this.expression = this.expression.substring(nextComma+1);
		}
		//return the last node on the stack’s data and parse it to Integer
		return Integer.parseInt(this.stack.pop());
	}
	
	//Method getPostfixExpression: Returns the arithmetic expression in string format.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IPostfixExpression#getPostfixExpression()
	 */
	public String getPostfixExpression() {
		//return expression
		return this.expression;
	}
	
	//Method setPostfixExpression: Sets the arithmetic expression (in string format).
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IPostfixExpression#setPostfixExpression(java.lang.String)
	 */
	public void setPostfixExpression(String expression) {
		//set expression using parameter
		this.expression = expression;
	}
	
	//Method setStack: Sets the IStack attribute in this class.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IPostfixExpression#setStack(wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IStack)
	 */
	public void setStack(IStack stack) {
		//set stack using parameter
		this.stack = stack;
	}
}

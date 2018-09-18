package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

public interface IDecoder {
	/**
	* Sets the IPostFixExpression attribute in this class.
	* @param expression the new expression.
	*/
	public void setPostfixExpression(IPostfixExpression expression);
	/**
	* Reads the expression from the input file, stores it as a String,
	* creates a Postfix object and sets the expression attribute for the
	* Postfix object (using the String from the input file), calls the
	* calculateResult() method (using the Postfix object) and prints out
	* the result of the expression (which is returned from the call to the
	* calculateResult method).
	* @param fileName the name of the input file to be read.
	*/
	public void processExpressions(String fileName);
}
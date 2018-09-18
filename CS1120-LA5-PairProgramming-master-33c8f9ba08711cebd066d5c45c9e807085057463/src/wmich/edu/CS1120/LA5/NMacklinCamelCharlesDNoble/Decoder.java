package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

public class Decoder implements IDecoder {
	//Private fields containing: expression
	private IPostfixExpression expression;
	
	//Method setPostfixExpression: sets the PostfixExpression attribute 
	//in this class.
	/* (non-Javadoc)
	 * @param expression - the new expression.
	 * @Override
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IDecoder#setPostfixExpression(wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IPostfixExpression)
	 */
	public void setPostfixExpression(IPostfixExpression expression) {
		this.expression = expression;
	}
	
	/*Method processExpressions: reads the expression from the input file 
	using parameter fileName, stores it as a String creates a 
	PostfixExpression object, calls the calculateResult() method of it 
	and prints out the result of the expression.
	/* (non-Javadoc)
	 * @Override
	 * @param fileName- the name of the input file to be read.
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IDecoder#processExpressions(java.lang.String)
	 */
	public void processExpressions(String fileName) {
		this.expression = new PostfixExpression("");
		int numberOfExpressions = 2;
		System.out.println("// Reconstructed expressions (character, "
				+ "its relative location in the file):");
		try {
			RandomAccessFile inFile = new RandomAccessFile(new File(fileName), "r");
			//make an array of two Strings named expressions
			String[] expressions = { "", "" };
			String[] labels = {"1st", "2nd"};
			//make an array of two ints named results
			int[] results = new int[numberOfExpressions];
			for(int i = 0; i < expressions.length ; i++) {
				System.out.println("// "+labels[i]+" Expression");
				//nextLocation is the inFile’s file pointer
				long nextLocation = inFile.getFilePointer();
				//get the next char by reading a char from inFile
				char nextChar = inFile.readChar();
				for(;;) {
					//print out the nextChar and its location
					System.out.println(nextChar+" "+nextLocation);
					//append nextChar to expression
					expressions[i] += nextChar;
					//get nextLocation by reacding the next int from the inFile
					nextLocation = inFile.readInt();
					//if the nextLocation is a -1 or -1000
					if(nextLocation == -1 || nextLocation == -1000)
						break;
					else {
						//seek to nextLocation
						inFile.seek(nextLocation);
						//read nextChar
						nextChar = inFile.readChar();
					}
				}
				System.out.println("//End of "+labels[i]+" Expression");
				//calculate the result of expression using PostfixExpression class
				//and store it in the results array
				this.expression.setPostfixExpression(expressions[i]);
				results[i] = expression.calculateResult();
			}
			System.out.printf("\nProcessing expressions from %s ...\n", fileName);
			System.out.printf("Number of Expressions: %d\n"
					+ "----------------------------\n", numberOfExpressions);
			//for each element in expressions array
			for(int i = 0; i < expressions.length; i++)
				//print the expression and result
				System.out.printf("Expression %d: %s\nResult: %d\n\n", (i+1), expressions[i], results[i]);
			inFile.close();
		} catch(FileNotFoundException fnfe) {
			System.out.println("ERROR: File Not Found... "+fnfe.getMessage());
		} catch(EOFException eof){
			System.out.println("ERROR: End of File Reached... "+eof.getMessage());
		} catch (IOException ioe) {
			System.out.println("ERROR: Input/Output Exception... "+ioe.getMessage());
		}
	}

}

package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

public interface IStack<E> {
	/**
	* Adds the parameter s to the top of the stack.
	* @param s the string to be added
	*/
	void push(E s);
	/**
	* Removes the top element from the stack
	* @return the top element in the stack
	*/
	E pop();
	/**
	* Returns the top element on the stack without removing it.
	* @return the top element in the stack
	*/
	E peek();
	/**
	* Returns the number of elements in the stack.
	* @return the number of elements in the stack
	*/
	int size();
	/**
	* Returns true if the stack contains no elements; false otherwise.
	* @return true if the stack contains no elements; false otherwise.
	*/
	boolean isEmpty();
}
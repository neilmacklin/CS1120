package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

public class Stack<E> implements IStack<E> {
	//Private Field containing: list;
	private LinkedList<E> list = new LinkedList<E>();
	
	//Method push: adds the parameter to the top of the stack.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IStack#push(java.lang.Object)
	 */
	public void push(E s) {
		//add parameter to list
		this.list.add(s);
	}
	
	//Method pop: removes the top element from the stack and returns it.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IStack#pop()
	 */
	public E pop() {
		return this.list.remove(list.size()-1);
	}
	
	//Method peek: returns the top element on the stack without removing it.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IStack#peek()
	 */
	public E peek() {
		return this.list.getLast();
	}
	
	//Method size: returns the number of elements in the stack.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IStack#size()
	 */
	public int size() {
		return this.list.size();
	}
	
	//Method isEmpty: returns true if the stack contains no elements; false otherwise.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.IStack#isEmpty()
	 */
	public boolean isEmpty() {
		return this.list.isEmpty();

	}
}
package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

public class Node<E> implements INode<E> {
	//Private fields containing: data (generic) and next (reference to node)
	private E data;
	private INode<E> next;
	
	// Constructor with 1 parameter: data.
	/**
	 * @param e
	 */
	Node(E e){
		this.data = e;
	}
	
	//Method getData: returns this node’s data.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.INode#getData()
	 */
	public E getData() {
		return this.data;
	}
	
	//Method setData: sets this node’s data.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.INode#setData(java.lang.Object)
	 */
	public void setData(E e) {
		this.data = e;
	}
	
	//Method getNext: returns the next node in the linked list.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.INode#getNext()
	 */
	public Node<E> getNext() {
		return (Node<E>) this.next;
	}
	
	//Method setNext: sets the next node in the linked list.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.INode#setNext(wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.INode)
	 */
	public void setNext(INode<E> next) {
		this.next = next;
	}


}

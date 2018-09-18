package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

import java.lang.IndexOutOfBoundsException;

public class LinkedList<E> implements ILinkedList<E>{
	//Private fields containing: head 
	private Node<E> head;
	
	//Method add: adds the parameter to the end of the list.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.ILinkedList#add(java.lang.Object)
	 */
	public void add(E e) {
		if(this.isEmpty())
			this.head = new Node<E>(e);
		else {
			//make new Node node equal to head
			Node<E> node = this.head;
			//while node’s next is not null
			while(node.getNext() != null) 
				//set node equal to node’s next
				node = node.getNext();
			//instantiate node’s next with parameter
			node.setNext(new Node<E>(e));
		}
	}
	
	//Method clear: removes all of the elements from the list.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.ILinkedList#clear()
	 */
	public void clear() {
		this.head = null;
	}
	
	//Method getLast: returns element at the end of the list.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.ILinkedList#getLast()
	 */
	public E getLast(){
		//return last element using get function at size-1
		return this.get(this.size()-1);
	}
	
	//Method get: returns the element at the given index.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.ILinkedList#get(int)
	 */
	public E get(int index) throws IndexOutOfBoundsException {
		if(index > this.size()-1)
			throw new IndexOutOfBoundsException();
		//make new Node node equal to head
		Node<E> node = this.head;
		//move to index
		for(int i=0; i<index; i++)
			node = node.getNext();
		return node.getData();
	}
	
	//Method isEmpty: returns true if the list is empty; false otherwise.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.ILinkedList#isEmpty()
	 */
	public boolean isEmpty() {
		if(this.head == null)
			return true;
		return false;
	}
	
	//Method remove: remove the element at the given index.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.ILinkedList#remove(int)
	 */
	public E remove(int index) {
		if(index > this.size()-1)
			throw new IndexOutOfBoundsException();
		//make new Node node equal to head
		Node<E> node = this.head;
		if(index == 0) {
			this.head = this.head.getNext();
			return node.getData();
		}
		else if(index == this.size()-1) {
			for(int i=0; i<index-1; i++)
				node = node.getNext();
			E data = node.getNext().getData();
			node.setNext(null);
			return data;
		} else {
			for(int i=0; i<index-1; i++)
				node = node.getNext();
			E data = node.getNext().getData();
			//set node’s to node’s next’s next
			node.setNext(node.getNext().getNext());
			return data;
		}
	}
	
	//Method size: returns the number of elements in the list.
	/* (non-Javadoc)
	 * @see wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble.ILinkedList#size()
	 */
	public int size() {
		//make new node equal to head
		Node<E> node = this.head;
		int size = 0;
		//while node is not equal to null
		while(node != null) {
			size++;
			node = node.getNext();
		}
		return size;
	}

}

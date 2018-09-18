package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

public interface ILinkedList<E> {
	/** 
	 * 	Adds the element e to the end of the list (appends it).  
		@param e element to be added
	 */ 
	 void add(E e); 
	 
	 /** 
	  * Removes all of the elements from the list 
	  */ 
	 void clear(); 
	 
	 /** 
	Returns the element at the end (index size-1) of the list.  
	@return the element at the end (index size-1) of the list.  
	  */ 
	 E getLast(); 
	 
	 /** 
	Returns the element at the specified index in the list. 
	@param index Index of the element to retrieve. (Indexing starts from 0.)  	 
	@return the element at that index. 
	@throws IndexOutOfBoundsException if the given index is greater than  one less than the number of elements in the list
	  */ 
	 E get(int index) throws IndexOutOfBoundsException; 
	 
	 /** 
	Returns true if the list is empty; false otherwise. 
	@return true if the list is empty, false otherwise. 
	  */ 
	 boolean isEmpty(); 
	 
	 /** 
	*Removes the element at the specified index. 
	*@param index Index of element to be removed. (Indexing starts from 0.)
	@return The contents of the element that was removed. 
	*@throws IndexOutOfBoundsException if the given index is greater than  one less than the number of elements in the list
	  */ 
	 E remove(int index) throws IndexOutOfBoundsException; 
	 
	 /** 
	*Returns the number of elements in this list. 
	*@return the number of elements in this list. 
	  */ 
	 int size();  
}

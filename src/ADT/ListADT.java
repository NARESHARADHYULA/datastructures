  package ADT;
   /**
   * ListADT is an interface for List to be implemented with arrays, linked list etc.
   * @author NARESH 
   * 
   * @param <E> Element Type
   */
  public interface ListADT <E> {
     
  /*
   * Appends the specified element to the end of this list if the element is not null.
   */
  public boolean add(E e);
  
  /*
   * Inserts the specified element at the specified position in this list 
   */
  public void add(int index, E element);
  
  /*
   * Removes all of the elements from this list.
   */
  public void clear();
     
  /*
   * Returns true if this list contains the specified element.
   */
  public boolean contains(E element);
  
  /*
   * Returns the element at the specified position in this list.
   */
  public E get(int index);
  
  /*
   * Returns the index of the first occurrence of the specified element in this list, or -1 if this list doe    not contain the element.
   */
  public int indexOf(E element);
  
  /*
   * Returns true if this list contains no elements. 
   */
  public boolean isEmpty();
     
  /*
   * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
   */
  public int lastIndexOf(E element);
  
  /*
   * Removes the element at the specified position in this list.
   */
  public E remove(int index);
     
  /*
   * Removes the first occurrence of the specified element from this list, if it is present.
   */
  public boolean remove(E element);
  
  /*
   * Replaces the element at the specified position in this list with the specified element.
   */
  public E set(int index, E element);
  
  /*
   * Returns the number of elements in this list. 
   */
  public int size();
     
  }
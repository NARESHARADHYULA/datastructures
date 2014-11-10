package ARRAYLIST;
import ADT.ListADT;
import java.util.*;
public class Arraylist implements ListADT {
	private int size = 0; 
	private static final int initialsize = 10;
	private Object elements[];
	public Arraylist(){
		//System.out.println("i am there ");
		elements = new Object[initialsize];
	}
	public static void main(String [] args){
		Arraylist a= new Arraylist();
		Scanner sc= new Scanner (System.in);
		//System.out.println(a.size());
		//System.out.println(a.size());
		for (int i = 0; i < 8; i++) {
			a.add(sc.next());
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		a.add(4, "hai");
		System.out.println("a.size()"+a.size());
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		a.remove(1);

		System.out.println("a.size()"+a.size());
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		a.add(10);
		System.out.println("a.size()"+a.size());
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
	}

	@Override
	public boolean add(Object e) {	
		// TODO Auto-generated method stub
		if (elements.length-size<=5) {
			increaseSize();
		}
		//System.out.println("size incresed by "+ size);
		elements[size]=e;
		size++;
		return true;
	}

	private void increaseSize() {
		// TODO Auto-generated method stub
		Object [] element1=new Object[size+10];
		for (int i = 0; i < elements.length; i++) {
			element1[i]=elements[i];
		}
		elements=element1;
		System.out.println("array list size increased by "+elements.length);
		element1=null;
	}
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		Object [] element1=new Object[size+10];
		if (elements[index]==null) {
			//		System.out.println("sdhj");
			//	System.out.println("fghfhgf");
			elements[index]=element;
		}
		else{
			//System.out.println("");
			//System.out.println("size"+size);
			for (int i =size-1; i>=index; i--) {
				Object temp;
				//System.out.println(elements[i]);
				temp=elements[i];
				elements[i+1]=temp;
				elements[i]=elements[i+1];
			}
			elements[index]=element;
		}

		size++;
		System.out.println("element at "+index +"is inserted with  "+ element);
		System.out.println("new array size is  "+ size);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		//ArrayList<String> al= new ArrayList<>();
		//al.c
			
	}

	@Override
	public boolean contains(Object element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < elements.length; i++) {
			if(elements[i]==element){
				return true;
			}
		}
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return elements[index];
	}

	@Override
	public int indexOf(Object element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < elements.length; i++) {
			if(elements[i]==element){
				return i;
			}
		}

		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (size==0) {
			return true;
		}
		
		return false;
	}

	@Override
	public int lastIndexOf(Object element) {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		//System.out.println(" size"+ size );
		Object [] element = new Object[size-1]; 
		for (int i =index; i <size; i++) {
			elements[i]=elements[i+1];
		}
		for (int i = 0; i < size-1; i++) {
			element[i]=elements[i];
		}
		//element=elements;
		//System.out.println("elementsize "+element.length );
		elements=element;
		element=null;
		System.out.println("element removed at "+ index +" position ");
		System.out.println("new size of arraylist is  : "+elements.length );
		size=elements.length;
		return elements;
	}

	@Override
	public boolean remove(Object element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < elements.length; i++) {
			if (element==elements[i]) {
				remove(i);
				break;
			}
		}
		return true;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		elements[index]=element;
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size ;
	}

}

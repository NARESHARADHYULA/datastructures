package linkedlistexample;
//import java.util.*;
public class singlelinkedlist {
	public static void main(String [] args){
		list l = new list();
		l.add("nar");
		l.add("naresh");
		l.add("gfgc");
		l.add("jhbfdsjsdfsd");
		l.getHead(l);
		l.lastnode(l);
		l.display(l);
		System.out.println(l.size(l));
		l.add("fool", 0);
		System.out.println("new list ");
		l.display(l);
		System.out.println(l.size(l));
		l.remove("nar");
		l.display(l);
		l.add("nar", 3);
		l.display(l);
		l.remove(2); l.display(l);
		l.remove("naresh");
		l.display(l);
		System.out.println(l.contains("fool"));
		System.out.println(l.get(3));
		System.out.println(l.indexOf("fool"));
		System.out.println(l.isEmpty());
	}

}
class node{
	Object element=null;
	node adr=null;
	public node(){
		element=null;
		adr=null;
		//	System.out.println(" element "+ element+" next "+adr);
	}
}
class list {
	node temp,first,last; int count =0;
	public list(){
		node n = new node();
		first=n;temp=n;
		//System.out.println("new node created "+ n);
	}
	static int flag=0;
	public int indexOf(Object element){
		node temp =first; int c=0; 
		while(temp.adr!=null){
			if (temp.element==element) {
				return c;
			}
			temp=temp.adr;
			c++;
		}
		return -1;
	}
	public Object  get(int index){
		node temp =first; int c=0;
		while(temp.adr!=null){
			if (c==index) {
				return temp.element;
			}
			temp=temp.adr;
			c++;
		}
		return null;
	}
	public boolean isEmpty(){
		if (count==0) {
			return true;
		}
		return false;
	}
	public void add(Object element,int index){
		count++; node prev=null;
		node temp=first; int c=0;
		while (temp.adr!=null) {
			if (c==index) {
				//	System.out.println(c+" c value is ");
				node n = new node();
				if (c==0) {
					n.adr=first;
					n.element=element;
					first=n;
				}
				else {
					n.element=element;
					node x=temp;
					n.adr=x;
					prev.adr=n;
				}
				break;
			}
			//System.out.println(temp.element);
			prev=temp;
			temp=temp.adr;
			c++;

		}
	}
	public boolean contains(Object element){
		node temp=first;
		while (temp.adr!=null) {
			if (temp.element==element) {
				return true;
			}
			temp=temp.adr;
		}
		return false;
	}
	public void add(Object element){
		node n = new node();
		//System.out.println("nwe node" +n);
		//System.out.println("temp ids "+temp);
		temp.adr=n;
		temp.element=element;
		if(flag==0){
			//System.out.println("entered ");
			first=temp;
			//System.out.println(first.element);
			flag=1;
		}
		last=temp;
		temp=n;
		//System.out.println("temp"+temp);
		//System.out.println("first"+first);
		count++;
	}
	public void getHead(list l){
		System.out.println(l.first.element);
	}
	public void lastnode(list l){
		System.out.println(l.last.element);
	}
	public void display(list l){
		node temp=first;
		while (temp.adr!=null) {
			System.out.println(temp.element+" "+temp.adr);
			temp=temp.adr;

		}
	}
	public int size(list l){

		return count;
	}
	public void clear(){
		System.out.println("clearing linked list");
		first.adr=null;
		count=0;
	}
	public void remove(int index){
		node prev=null;
		node temp=first; int c=0;
		while (temp.adr!=null) {
			if (c==index) {
				System.out.println(c+" c value is ");
				if (c==0) {
					first=first.adr;
				}
				else {
					prev.adr=temp.adr;
				}
				break;
			}
			//System.out.println(temp.element);
			prev=temp;
			temp=temp.adr;
			c++;

		}
		count--;
	}
	public void remove(Object element){
		node prev=null;
		temp=first; 
		while (temp.adr!=null) {

			if (temp.element==element) {
				prev.adr=temp.adr;
			}
			prev=temp;
			temp=temp.adr;
		}
		count--;
	}
	public node search(Object element){
		node prev=null;
		temp=first; int c=0;
		while (temp.adr!=null) {

			if (temp.element==element) {
				return prev; 
			}
			prev=temp;
			temp=temp.adr;
			c++;
		}
		return null;
	}
}
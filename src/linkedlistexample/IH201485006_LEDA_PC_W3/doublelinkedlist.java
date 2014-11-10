package linkedlistexample;
public class doublelinkedlist {
	public static void main(String [] args){
		dlist l= new dlist();
		l.add(12);
		l.add(18);
		l.add(19);
		l.display(); 
		System.out.println(" ");
		dlist l1= new dlist();
		l1.add(14);
		l1.add(15);
		l1.add(16);
		l1.display();
		System.out.println("concat list is ");
		dlist l2= new dlist();
		l.concatorder(l,l1);
		l.display(); 
	}

}

class node1{
	int element=0;
	node1 next=null;node1 prev=null;
	public node1(){
		element=0;
		next=null;
		prev=null;
		//	System.out.println(" element "+ element+" next "+adr);
	}
}
class dlist {
	node1 temp,first,last; int count =0;
	public dlist(){
		node1 n = new node1();
		first=n;temp=n;
		//System.out.println("new node created "+ n);
	}
	public void concatorder(dlist l1 ,dlist l2){
		int c1=0; int flag=0;
		for (int j = 0; j <l2.count; j++) {
			if (flag==1) {
				break;
			}
			for (int i = 0; i < l1.count; i++) {
			//	System.out.println("kjcvnjkvndfdf");
				node1 n2= l2.get(j);node1 n1= l1.get(i);
				if (n2.next==null|| n1.next==null) { flag=1; break; }
				System.out.println("n2."+ n2.element);System.out.println("n1."+ n1.element);
				if (n1.element > n2.element) {
					System.out.println("i am innn");
					//l1.addat(i,n2.element); 
					System.out.println(n2.next.element);
					//if (n2.next!=null) {
						l2.first=n2.next;
					//}
					
					System.out.println(first.element);
					n1.prev.next=n2; n2.prev=n1.prev;
					n1.prev=n2;n2.next=n1; c1++;
					
				
				}
			}
		}
		/*if (c1==0) {
			node1 n1= l1.get(count); node1 n2= l2.get(0);
			n1.next=n2; n2.prev=n1;
		}*/
		//node1 temp=first;
		/*while(temp.next!=null){
			System.out.println(temp.element+" "+ temp.next);
			temp=temp.next;
		}*/
	}
	int flag=0;
	public void add(int element){
		node1 n = new node1();
		temp.element=element;
		temp.next=n;
		n.prev=temp;
		if (flag==0) {
			first=temp;
			//			System.out.println(temp.prev+" "+ temp.element+" "+temp.next);
			flag=1;
		}
		//  System.out.println(temp.prev+" "+ temp.element+" "+temp.next);
		temp=n;

		//System.out.println(temp.prev+" "+ temp.element+" "+temp.next);
		count++;

	}
	public  void display(){
		node1 temp=first;
		while(temp.next!=null){
			System.out.println(temp.element+" "+ temp.next);
			temp=temp.next;
		}
		//System.out.println(temp.element);
	}
	public node1 get(int a){
		int c=0; node1 temp=first;
		while(temp.next!=null){
			if (c==a) {
				return temp;
			}
			temp=temp.next;
			c++;
		}
		//	System.out.println("hai           nv,hnvhj");
		return null;
	}
	public void moveAfter(int a , int b , int c){
		//System.out.println("i am in");
		node1 r1 = get(a); 
		//System.out.println(r1);
		node1 r2 = get(b); node1 p = get(c); node1 t=p.next;
		r1.prev.next=r2.next; 	p.next=r1;
		r1.prev=p; r2.next.prev=r1.prev;
		t.prev=r2;  r2.next=t;
		//System.out.println(r1);
	}
	public void addat(int i ,int element){
		if (i==0&&flag!=1) {
			flag=1;
			node1 n= new node1();
			temp.next=n;temp.element=element;n.prev=temp;
			first=temp; temp=n;
		}
		else if(i==0&&flag==1){
			node1 n= new node1();
			n.element=element;
			n.next=first;
			first.prev=n;
			node1 v=first;
			first=n;n=v;
		}
		else {
			int c=0;node1 temp=first; node1 l=null;
			while(temp.next!=null){
				if (c==i) {
					node1 n= new node1();
					n.element=element;
					n.next=temp;
					n.prev=l;
					l.next=n;
					temp.prev=n;
					break;
				}
				l=temp;
				temp=temp.next;
				c++;
			}
		}
		count++;
	}
}

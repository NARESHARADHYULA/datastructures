package linkedlistexample;


import java.util.*;

public class merge {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String[] str=s1.split(",");
		DoublyLinkedList dl1=new DoublyLinkedList();
		for(int i=0;i<str.length;i+=2)
		{
			dl1.insertatEnd(Integer.parseInt(str[i]+""));
		}
		String s2=in.next();
		str=s2.split(",");
		DoublyLinkedList dl2=new DoublyLinkedList();
		for(int i=0;i<str.length;i+=2)
		{
			dl2.insertatEnd(Integer.parseInt(str[i]));
		}
		dl1.merge(dl2);
	}
}

class Dnode
{
	int value;
	Dnode prev;
	Dnode next;
	public Dnode()
	{
		prev=null;
		value=0;
		next=null;
	}
}

class DoublyLinkedList
{
	Dnode head;
	Dnode flhead;
	int size;
	public DoublyLinkedList()
	{
		createfreelist();
		head=null;
		size=0;
	}
	private void createfreelist()
	{
		flhead=new Dnode();
		flhead.next=flhead.prev=flhead;
		Dnode temp=flhead;
		for(int i=1;i<2;i++)
		{
			Dnode n=new Dnode();
			temp.next=n;
			flhead.prev=n;
			n.prev=temp;
			n.next=flhead;
		}
	}
	public void splice(Dnode a,Dnode b,Dnode c)
	{
		Dnode n1,n2,n3;
		n1=a.prev;
		n2=b.next;
		n1.next=n2;
		n2.prev=n1;
		n3=c.next;
		b.next=n3;
		a.prev=c;
		c.next=a;
		n3.prev=b;
	}
	public void moveAfter(int a,int t)
	{
		Dnode temp=find(a);
		Dnode temp1=find(t);
		splice(temp,temp,temp1);
	}
	public void insertatEnd(int e)
	{
		createfreelist();
		Dnode d=flhead.next;
		flhead.next=flhead.next.next;
		flhead.next.prev=flhead;
		d.value=e;
		if(head==null)
		{
			head=d;
			head.prev=head.next=null;
			d.next=d.prev=head;
		}
		else
		{
			splice(d,d,head.prev);
		}
		size++;
	}
	public Dnode find(int e) 
	{
		Dnode temp = head.next;
		head.value = e;
		while(temp.value != e) {
			temp = temp.next;
		}
		return temp;
	}
	public void display()
	{
		Dnode temp=head.next;
		while(temp!=head)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	public void merge(DoublyLinkedList d2)
	{
		Dnode temp1=head.next;
		Dnode temp2=d2.head.next;
		for(int i=0;i<size;i++)
		{
			if(temp1.value < temp2.value)
			{
				splice(temp2,temp2,temp1);
			}
			else
				splice(temp2,temp2,temp1.prev);
			temp1=temp1.next;
			temp2=temp2.next;
		}
		display();
	}
}

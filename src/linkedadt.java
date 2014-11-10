public class linkedadt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new List();
		l.add(21);
		l.add(5);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
}


class Node
{
	Object value;
	Node next;
	public Node(Object v)
	{
		value=v;
		next=null;
	}
	/*public Node(Object v,Node n)
	{
		value=v;
		next=n;
	}*/
}


class List 
{
	private Node first;
	private int size;
	public List()
	{
		first=new Node(null);
		size=0;
	}

	public boolean add(Object e) {
		// TODO Auto-generated method stub
		Node n1=new Node(e);
		Node n2=first;
		if(size==0)
		{
			first=n1;
		}
		else
		{
			while(n2.next!=null)
				n2=n2.next;
			n2.next=n1;
		}
		size++;
		return true;
	}

	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		Node n1=new Node(element);
		Node n2=first;
		for(int i=0;i<index && n2.next!=null;i++)
		{
			n2=n2.next;
		}
		n1.next=n2.next;
		n2.next=n1;
		size++;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object element) {
		// TODO Auto-generated method stub
		Node n=first;
		while(n.next!=null)
		{
			if(n.value==element)
				return true;
			n=n.next;
		}
		return false;
	}

	public Object get(int index) {
		// TODO Auto-generated method stub
		if(index<0 || index>=size)
			return null;
		else
		{
			if(index==0)
				return first.value;
			Node n=first.next;
			for(int i=1;i<index;i++)
			{
				n=n.next;
			}
			return n.value;
		}
	}

	public int indexOf(Object element) {
		// TODO Auto-generated method stub
		int index=0;
		Node n=first;
		while(n.next!=null)
		{
			if(n==element)
				return index;
			index++;
			n=n.next;
		}
		return -1;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(first==null)
			return true;
		return false;
	}

	public int lastIndexOf(Object element) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object remove(int index) {
		// TODO Auto-generated method stub
		
		if(index<0 || index>=size)
			return null;
		else
		{
			size--;
			Node n=first.next;
			if(index==0)
				first=first.next;
			else
			{
				for(int i=1;i<index;i++)
				{
					n=n.next;
				}
				n=n.next;
			}
			return n.value;
		}
	}

	public boolean remove(Object element) {
		// TODO Auto-generated method stub
		Node n=first.next;
		if(first==element)
		{
			size--;
			first=first.next;
			return true;
		}
		else
		{
			for(int i=1;n.next!=null;i++)
			{
				if(n==element)
				{
					size--;
					n=n.next;
					return true;
				}
				n=n.next;
			}
			return false;
		}
	}

	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		Node n=first;
		if(index<0 || index>=size)
			return null;
		else
		{
			for(int i=0;i<index;i++)
			{
				n=n.next;
			}
			n.value=element;
			return n;
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
}

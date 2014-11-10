
public class prob_1 
{
		    public static void main(String args[] ) throws Exception {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		    list1 n=new list1();
			list1 t=new list1();
			//boolean f=n.isEmpty();
			n.add(2);
			n.add(4);
			n.add(5);
			n.add(8);
			n.add(12);
			n.add(15);
			//n.add(41);
			//n.add(52);
			t.add(1);
			t.add(3);
			t.add(7);
			t.add(9);
			t.add(11);
			t.add(19);
			//t.add(37);
			//t.add(48);
			if(n.start.value<t.start.value)
			{}
			else
			{
			  list1 r=n;  	
			  n=t;
			  t=r;
			}
			n.merge(t);
			//System.out.println("size is"+s);
			//n.splice(n.getNode(12),n.getNode(56),n.getNode(11));
			n.displayfromfirst();
			System.out.println("\n\n");
		    //n.displayfromend();
			//System.out.println("index is"+ind);
			//System.out.println(f);
			//t.createfreelist();
			//t.displayfromfirst();
		  }
		}
		class Node1
		{
		  Node1 next;
		  Node1 previous;
		  int value;
		  public Node1(int value)
		   {
			  this.value=value;
			  next=null;
			  previous=null;
		   }
		}
		class list1 
		{
		  public Node1 start;
		  private Node1 dum;    
		  private Node1 end;
		  private int size;
		  private Node1 temp;
		  public list1()
		  {
			  start=new Node1(0);
		      dum=start;
			  end=new Node1(0);
			  temp=start;
			  size=0;
		  }
		  public void merge(list1 t)
		  {
			 int alt=1;
			 //System.out.println(this.start.value);
			 //System.out.println(t.start.value);
			 Node1 temp2=this.start;
			 list1 p;
			 list1 q;
		     p=this;
		     q=t;
			 start=p.start;
			 temp=p.start.next;
			 p.start.next=temp;
			 p.start.previous=null;
			 Node1 temp1=temp.next;
			 temp.next=q.start;
			 //System.out.println("val"+q.start.value);
			 q.start.previous=temp;
			 temp=temp.next;
			 temp2=q.start.next;
			 //System.out.println("val"+temp.value);
			// System.out.println(start.value +" "+ start.next.value);
			 while(temp2.next!=null)
			 {
				 //System.out.println("hi"+temp2.value);
				 //System.out.println("hihi"+temp.value);
				 //System.out.println("hihidfdfd"+temp1);
			   	if(alt==0)
			   		{
			   		 //System.out.println("jnj");
			   		  temp.next=temp2;
			   		  temp=temp.next;
			   		  temp2=temp2.next;
			   		}
			   	else
			   	{
			   		if(temp1!=null)
			   		  {
			   		    temp.next=temp1;
			   	 	    temp=temp.next;
			   	 	    temp1=temp1.next;
			   		  }
			   	}
			   	alt++;
   			    alt=alt%2;
			 }
		  }
		  public void add(int value)
		  {
			Node1 n1=new Node1(value);
			temp=start;
			if(size==0)
			{
			  start=n1;
			  end=n1;
			}
			else
			{
			  while(temp.next!=null)	
			  {
				temp=temp.next;
			  }
			  temp.next=n1;
			  n1.previous=temp;
			  n1.next=null;
			  end=n1;
			}
			size++;
		  }
		  public void displayfromfirst()
		  {
			 temp=start;
			while(temp!=null)
			{
			  System.out.println(temp.value);	
			  temp=temp.next;	  
			}
		  }
}


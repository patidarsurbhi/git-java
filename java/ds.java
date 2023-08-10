import java.io.*;
class Node
{
	private Object data;
	private Node next;
	Node(Object data)
	{
		this.data=data;
		next=null;
	}
	public boolean equals(Object val)
	{
		return this.data.equals(val);
	public void setData(Object data)
	{
		this.data=data;
	}
		public void setNext(Node Next)
		{
			this.next=next;
		}
		public Object getData()
		{
			return data;
		}
		public Node getNext()
		{
			return next;
		}
		Node t=start;
		while(t!=tail)
		{
			System.out.print(t.getData()+"->");
		}
		Node t=statrt;
		while(t!=tail)
		{
			System.out.print(t.getData());
		}
		public static void search(Object data)
		{
			Node t=start;
			while(t!=tail)
			{
				if(t.getData().equals(data))
				{
					System.out.print(t.getData());
				}
				t=t.getNext();
			}
			if(t.getData()==data)
				System.out.print(t.getNext());
		}
}
class Test
{
	public static void main(String [] args)
	{
		Linklist l=new linklist();
		l.addAtfirst(new Emp(100));
		l.addAtfirst(new Emp(200));
		l.addAtfirst(new Emp(300));
		l.addAtfirst(new Emp(400));
		l.print();
		System.out.println();
		l.search(new Emp(300));
	}
}

 class Emp
 {
 	int id;
 	Emp(int id)
 	{
 		this ,id=id;
 	}
 	public string tostring()
 	{
 		return id+"";
 	}
 	 public boolean equals(object val)
 	 {
 	 	if(val instanceof Emp)
 	 	{
 	 		Emp e=(Emp)val;
 	 		return this.id==e.id;

 	 	}
 	 	 return false;
 	 }
 }
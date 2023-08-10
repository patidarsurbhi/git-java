
//get method
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		  ArrayList al=new ArrayList();
	    al.add(10);
		al.add(20);
		al.add(null);
		al.add(40);
		System.out.println(al);
	   System.out.println("element"+al.get(2));


	}
}*/

//remove method

/*import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		  ArrayList al=new ArrayList();
	    al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//System.out.println(al);
		//remove element=e
	   System.out.println("element"+al.remove(2));
	   System.out.println(al);



	}
}*/

//set method
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		  ArrayList al=new ArrayList();
	    al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
	   System.out.println("element"+al.set(2,3));
	   System.out.println(al);
	}
}*/
//Arrayall remove
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		  ArrayList al=new ArrayList();
	    al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.removeAll(al);
	   System.out.println(al);
	}
}*/
//sublist
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		  ArrayList al=new ArrayList();
	    al.add(10);
		al.add(20);
		al.add("hello");
		al.add(40);
		al.add("hello");
		al.add(40);
		System.out.println(al);
		//al.removeAll(al);
	   System.out.println(al.subList(0,2));
	}
}*/

//public boolean equals(java.lang.object)  method
/*import java.lang.*;
class Test
{
	public static void main(String[] args)
	{
      boolean res;
     Boolean b1 = true;
      Boolean b2 = true; 
       res = b1.equals(b2);

      String str = "b1:" +b1+ " and b2:" +b2+ " are equal is " + res;
      System.out.println( str );
    }
}*/
//linklist
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList ();
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		//System.out.println(l.removeFirst());
		//System.out.println(l.peekFirst());
		//System.out.println(l.peekLast());
		//System.out.println(l.pollLast());
		//System.out.println(l.pop());
		//System.out.println(l.poll());
		//System.out.println(l.peek());
		System.out.println(l);
	}
}*/

//vector

/*import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(2);	
		v.add(5);
		v.add(4);
		v.add(9);
		System.out.println(v);
		//System.out.println(v.get(1));
		System.out.println(v.remove(2));
		System.out.println(v);
    }	

}*/

//stack
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Stack s= new Stack();
		//s.add(10);
		//s.add(20);
		//s.add(30);
		System.out.println(s);
		System.out.println(s.empty());
	    System.out.println(s);
	}
}*/

//enumeration
/*import java.util.*;
class Test
{
    public static void main(String[] args)
    {
          Enumeration Days;
          Vector week=new Vector();
          week.add("sunday");
           week.add("mon");
            week.add("tue");
            week.add("wed");
            week.add("thru");
             week.add("fri");
              week.add("sat");
              Days=week.elements();
              while(Days.hasMoreElements())
              {
              	System.out.println(Days.nextElement());
              }
        }
    }*/

    //list iterator
//remove method
   /*import java.util.*;
   class Test
{
   	public static void main(String[] args)
   	{
   		ArrayList al= new ArrayList();
   		for(int i=0;i<10;i++)
   			al.add(i);
   		Iterator itr = al.iterator();
   		while(itr.hasNext())
   		{
   			int i = (int)itr.next();
   		    System.out.println(i);
   			if(i%2!=0)
   			itr.remove();
   		}		
   	
   	          System.out.println(al);
   	      
   	}
   
 }*/

 //listiterator
 //add method
 /*import java.util.*;
 class Test
 {
 	public static void main(String[] args) 
 	{
 		ArrayList al= new ArrayList();
 		for(int i=0;i<5;i++)
 			al.add(i);
 		System.out.println(al);
 	}
 }*/

//remove method
 /*import java.util.*;
 class Test
 {
 	public static void main(String[] args) 
 	{
 		ArrayList al= new ArrayList();
 		for(int i=0;i<5;i++)
 			al.add(i);
 		System.out.println(al);
 		ListIterator Itr= al.listIterator();
 		while(Itr.hasNext())
 		{
 			int i=(int)Itr.next();
 		      System.out.println(i);
 		        if(i%2==0)
 		        	i.r
 		   {
 			   
 			    Itr.set(i);
 			   // Itr.add(i);

 			}
 		}
 		System.out.println(al);
 	}
 }*/

 /*import java .util.*;
 class Test
{

 	public static void main(String[] args)
 	 {
 	 	
 		HashSet s=new HashSet();
 		s.add("a");
 		s.add("b");
 		s.add("c");
 		s.add("h");
 		s.add("a");
 		s.add(null);
 		System.out.println(s);
 		
 	}
 }*/


 //sorted set

 /*import java.util.*;
 class Test
 {
 	public static void main(String[] args) 
 	{
 		SortedSet s= new TreeSet();
 		s.add(10);
 		s.add(20);
 		s.add(30);
 		s.add(40);
 		s.add(50);
 		s.add(60);
 		//int g=s.first(1);
 		System.out.println(s);
 		System.out.println(s.first());
 		System.out.println(s.last());
 		System.out.println(s.headSet(30));
 		System.out.println(s.tailSet(20));
 		System.out.println(s.subSet(10,50));
 	}
 }*/
 
 //treeset
 /*import java.util.*;
 class Test
 {
 	public static void main(String[] args) 
 	{
 		TreeSet t= new TreeSet();
 		t.add("A");
 		t.add("B");
 		t.add("C");
 		t.add("D");
 		t.add("A");
 		//t.add(10);
 		//t.add(null);
 		System.out.println(t);
 	}
 }*/

 /*class Std implements Comparable
 {
 	String name;
 	Std (String n)
 	{
 		name = n;
 	}
   public int compareTo(Object ob)
   {
   	Std s= (Std)ob;
   	return this.name.compareTo(s.name);
   }
   public String toString()
   {
   	return name;
   }
 }*/
 
//acending ya decending   integer
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		TreeSet t=new TreeSet(new custSorting());
		t.add(3);
		t.add(2);
		t.add(4);
		t.add(5);
		//t.add(5);  //return 1 ke liye
		System.out.println(t);

	}
}
class custSorting implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)(obj1);
		Integer i2=(Integer)(obj2);
		//return i1.compareTo(i2);   //ascending
       // return -i1.compareTo(i2);   //decending
		//return i2.compareTo(i1);     //decending
		//return -i2.compareTo(i1);        //ascending
		//return 0;   //only one value add ho
		//return 1;  //insertion order andduplicate value allow
		return -1;   //
  	}
}*/

//String method
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		TreeSet t=new TreeSet(new custSorting());
		t.add("surbhi");
		t.add("sheetal");
		t.add("ish");
		t.add("mangla");
		//t.add(5);  //return 1 ke liye
		System.out.println(t);

	}
}
class custSorting implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String i1=(String)(obj1);
		String i2=(String)(obj2);
		//return i1.compareTo(i2);   //ascending
       // return -i1.compareTo(i2);   //decending
		//return i2.compareTo(i1);     //decending
		//return -i2.compareTo(i1);        //ascending
		//return 0;   //only one value add ho
		//return 1;  //insertion order andduplicate value allow
		return -1;   //
	
  	}
}*/

import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		TreeSet t=new TreeSet(new custSorting());
		t.add("a");
		t.add("bb");
		t.add("ccc");
		t.add("ddd");
		System.out.println(t);

	}
}
class custSorting implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)(obj1);
		String s2=(String)(obj2);
		int i1= s1.length();
		int i2=s2.length();
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return 1;
		else 
			return 0;
	}	
}
















































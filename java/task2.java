//1.
/*import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		ArrayList <String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
	}
}*/


//3.
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
		al.remove(1);
		System.out.println(al);
	

	}
}*/

//2.

import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al.set(1,3));
		System.out.println(al);
	

	}
}
//4.
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(25);
		al.add(40);
		TreeSet t=new TreeSet(al);
		System.out.println(t);
	
	

	}
}*/

//11.
/*import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();

		System.out.println(al.isEmpty());
	}
}*/



//10

/*import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(30);
		ArrayList t=new ArrayList(al);
		t.add(40);
		t.add(50);
		System.out.println(t);
	
	}
}*/

// 8
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		 ArrayList al=new ArrayList();
		 al.add(10);
		 al.add(30);
		 al.add(20);
		 ArrayList t=new ArrayList();
		 t.add(10);
		 t.add(30);
		 t.add(20);
		 boolean s=al.equals(t);
		 System.out.println(s);
	}
}*/



//9

//import java.util.*;
/*class Test
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5};
		 int temp=0;
		 for(int i=0;i<5;i++)
		 {
		  temp=arr[3];
		  arr[3]=arr[4];
		  arr[4]=temp;
		 }
		  for(int i=0;i<5;i++)
		  {
		  System.out.println(arr[i]);
		 }	
     }

}*/
//6
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		ArrayList al=new ArrayList(20);
		al.add(12);
		al.add(20);
		al.add(30);
		System.out.println(al);
	}
}*/

//7.

class Test
{
	public static void main(String[] args) 
	{
		  int arr[]={1,2,3,4,5};
		   int s=0,l=4,c;
		   while(s<l)
		   {
		   	 c=arr[s];
		   	 arr[s]=arr[l];
		   	 arr[l]=c;
		   	 s++;
		   	 l--;
		   }

		   for(int i=0;i<arr.length;i++)

		   System.out.println(arr[i]);
	}
}

//5
import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		ArrayList al=new ArrayList();
		al.add("survhi");
		al.add("sheet");
		al.add(10);
		al.add(null);
		al.add(10.4f);
		System.out.println(al);

	}
}





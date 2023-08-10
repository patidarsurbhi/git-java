/*enum weeks
{
	mon,tue,wed,thu,fri,sat,sun    //semicolon optional h
}
class Test
{
	public static void main(String[] args)
	{
	   System.out.println(weeks.mon);
	}
}*/


//store karna
/*enum weeks
{
	mon,tue,wed,thu,fri,sat,sun   
}
class Test
{
	public static void main(String[] args)
	{
		weeks b=weeks.mon;
	   System.out.println(b);
	}
}*/


/*enum weeks
{
	mon,tue,wed,thu,fri,sat,sun; // aab semicolon optional nhi hbecause iske bad method h
	public String toString()
	{
		return "hello";
	}  
}
class Test
{
	public static void main(String[] args)
	{
		weeks b=weeks.mon;
	   System.out.println(b);
	}
}*/

//enum ka object

/*enum weeks
{
	mon,tue,wed,thu,fri,sat,sun; 
	
}
class Test
{
	public static void main(String[] args)
	{
		weeks b[]=weeks.values();
		for(int i=0;i<b.length;i++)
	   System.out.println(b[i].ordinal());
	  System.out.println(b[i]);

	}
}*/


//constructor
/*enum weeks
{
	mon("Monday"),tue("Tuesday"),wed("wednwsday"); 
	String def;
	weeks(String def)
	{
		this.def=def;
	}
	
}
class Test
{
	public static void main(String[] args)
	{
		weeks b[]=weeks.values();
		for(int i=0;i<b.length;i++)
	   System.out.println(b[i].def);

	}
}*/
//switch case string pass nhi kr sakte
/*enum weeks
{
	mon,tue,wed,thu,fri,sat,sun;
}
class Test
{
	public static void main(String[] args)
	{
       weeks b=weeks.mon;
       switch(1)
       {
       	case 1:
       	     System.out.println("this  is day monday");
       	     break;
       	case 2:
       	     System.out.println("this is day tuesday");
       	     break;
       	case "hi:
       	      System.out.println("this is hello hi");
       	      break;
       	 default:
       	      System.out.println("plz try again");
       }
	}
}*/



//ordinary

/*import java.lang.*;
 import java.util.*;
  
// enum showing Student details
enum Student {
   Rohit, Geeks,Author;
}
  
 class GFG {
  
   public static void main(String args[]) {
  
      System.out.println("Student Name:");
       
      for(Student m : Student.values()) {
          
         System.out.print(m+" : "+m.ordinal()+" ");
      }                   
   }
}*/















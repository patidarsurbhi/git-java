 /*class MyClass
{
   static void myMethod()
	{
		System.out.println("surbhi");
	}
	public static void main(String[] args)
	{
		myMethod();
		myMethod();
		myMethod();
	}
}*/
 // predefine method
 /*class MyClass
  {
    public static void main(String[] args)
     {
       int x = 9;
       int y = 15;

    System.out.println(Math.max(x, y));
    System.out.println(Math.min(x, y));
    System.out.println(Math.sqrt(x));
    System.out.println(Math.abs(x - y));
   }
}*/



//user define method

/* class MyClass
  {
     static int myMethod(int x, int y)
      {
         return x + y;
      }

        public static void main(String[] args)
      {
         System.out.println(myMethod(10, 6));
      }
}*/


/*class Test {
    public static void main(String[] args)
        throws ClassNotFoundException
    {
        // get the Class instance using forName method
        Class c1 = Class.forName("java.lang.String");
 
        System.out.print("Class represented by c1: "
                         + c1.toString());
    }
}*/


 /*class Test {
    public static void main(String[] args)
        throws ClassNotFoundException
    {
       
        Class c1 = Class.forName("java.lang.Integer");
 
        System.out.print(" "
                         + c1);
    }
}*/

/*{
	public String toString()
	{
		return"nhi pata";
	}
}

class Test
{
	public static void main(String[] args)throws Exception
	{
	    Sample s=new Sample();
	     System.out.println(s);
	     //System.out.println(args[0]);                  //java.lang.ArrayIndexoutofBoundException
	      System.out.println(s.getClass().getName());
	      System.out.println(s.getClass());
    }
}*/

/*class Sample
{
	static{
		System.out.println("nai pata");
	}
}

class Test
{
	public static void main(String[] args) throws Exception 
	{	   
		Class c=Class.forName("Sample");
	   Object ob = c.newInstance();
	  System.out.println(ob);
	 }
}*/

class Test
{
	public static void main(String[] args)throws Exception
	{
		Class c= Class.forName(args[0]);
		Rbi ob = (Rbi)c.newInstance();
		ob.getInfo();
	}
}
interface Rbi
{
	public void getInfo();
}
class Sbi implements Rbi
{
	static{
		System.out.println("sbi static");
	}
	public void getInfo()
	{
		System.out.println("sbi info");
	}
}
class lena implements Rbi
{
	static{
		System.out.println("lena static");
	}
	public void getInfo()
	{
		System.out.println("lena info");
	}
}

class dena implements Rbi
{
	static{
		System.out.println("dena static");
	}
	public void getInfo()
	{
		System.out.println("dena info");
	}
}



























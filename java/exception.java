
/*class Test 
{
	 public static void main(String[] args)
	{
	  System.out.println("hello1");
	  System.out.println("hello2");
	  System.out.println("hello3");
	  try
	  {
	  	 System.out.println(10/0);
	  }
	  catch(Exception e)
	  {
	  System.out.println("by zero");
	  }
	  System.out.println("hello4");
	  System.out.println("hello5");
	  System.out.println("hello6");
	}
}*/


/*class Test
{
	 public static void main(String[] args)
	 {
	 	System.out.println("hello1");
	 	Class.forName("Test");
	 	System.out.println("hello2");
	 }
}*/

/*class Test
{
	 public static void main(String[] args)
	 {
	 	System.out.println("hello1");
	 	try
	 	{
	 	   Class.forName("Test");	
	 	}
	 	catch(Exception e)
	 	{
           e.printStackTrace();
	 	}
	 	//Class.forName("Test");
	 	System.out.println("hello2");
	 }
}*/



/*class Test
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("start main");
		
		fun();
		System.out.println("end main");
	}
	public static void fun()throws Exception
	{
		System.out.println("statrt fun");
		show();
		System.out.println("end fun");	
	}
	public static void show()throws Exception
	{
		System.out.println("start show");
		Class.forName("Test");
		System.out.println("end show");
	}
}*/

 /*class Test
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("start main");
		
		fun();
		System.out.println("end main");
	}
	public static void fun()throws Exception
	{
		System.out.println("statrt fun");
		show();
		System.out.println("end fun");	
	}
	public static void show()throws Exception
	{
		System.out.println("start show");
		Class.forName("Test1");
		System.out.println("end show");
	}
}*/
 /*class Test
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("start main");
		try
		{
		fun();
	    }
        catch(Exception e)
        {

        }
	   
		System.out.println("end main");
	}
	public static void fun()throws Exception
	{
		System.out.println("statrt fun");
		show();
		System.out.println("end fun");	
	}
	public static void show()throws Exception
	{
		System.out.println("start show");
		Class.forName("Test1");
	   
		System.out.println("end show");
	}
}*/

/*class Test
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("start main");
		
		fun();
	   
		System.out.println("end main");
	}
	public static void fun()throws Exception
	{
		System.out.println("statrt fun");
		show();
		System.out.println("end fun");	
	}
	public static void show()throws Exception
	{
		System.out.println("start show");
		try
		{
		Class.forName("Test1");
	     }
	     catch(Exception e)
	     {

	     }
		System.out.println("end show");
	}
}*/



/*class Test 
{
	public static void main(String [] args)
	{
		try
		{
		   int[]myNumbers={1,2,3};
		   System.out.println(myNumbers[10]);
	    }
	  catch(Exception e)
	  {
	  	System.out.println("Something went wrong");
	  }
   }
}*/



class Test
{
	public static void main(String[] args)
	{
		 System.out.println("start Main");
		 try
		 {
		 	int a = Integer.parseInt(args[0]);
		 	System.out.println(a/10);
		 	//System.out.println(10/0);
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
		 	System.out.println("pass value from end");
		 }
		 catch(NumberFormatException e)
		 {
		 	System.out.println("0-9 digit hi pass karna h");
		 }
		 catch(ArithmeticException e)
		 {
		 	System.out.println("0 se divide nhi karna hai");
		 }
		 catch(Exception e)
		 {
		 	System.out.println("pass value from end");
		 }
	}
}


/*class Test
{
	public static void main(String[] args)
	{
		System.out.println("start Main");
		try
		{
			int a=Integer.parseInt(args[0]);
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong...");
		}
		System.out.println("end MAIN");
	}
}*/










/*class MyThread extends Thread
{
	public void run()
	{
	   for(int i=0;i<5;i++)
	   {
	   System.out.println("My thread: "+i);
	   }
	}
}

class Test
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
	   for(int i=0;i<5;i++)
	  {
	    System.out.println("Main:"+i);
	   }
	}
}*/

/*class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"Main :"+i);
		}
	}
}
class Test
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
       for(int i=0;i<5;i++)
       {
       	System.out.println("Main :"+i);
       }
	}
}*/

/*class MyThread extends Thread
{
	public void run()
	//{
		//for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"sheet :");
		}
	//}
}*/
/*class m extends Thread
{
	public void run()
	  //{
		//for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"surbhi :" );
		}
	//}
}*/ 

/*class m extends Thread
{
	public void start()
	{
	    super.start();
     }
}
class Test
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		MyThread m=new MyThread();
		t.start();
		m.start();
       /*for(int i=0;i<5;i++)
       {
       	System.out.println(Thread.currentThread().getName()+"Main :"+i);
       }
	}
}*/

//thread class

/*{
     public void run()
     {
     	try
     	{
     		System.out.println(Thread.currentThread().getName()+"Main :");
     	}
     	 catch(Exception e)
     	 {
     	 	System.out.println("Exception is caught");
     	 }
     }
}
 
public class Test
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
         {
          MyThread t=new MyThread();
         t.start();
        
         }
       
    }
}*/

/*class MultithreadingDemo implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("Thraed"+ Thread.currentThread().getId()+"is running");
              
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
	}
}

class Multithread
{
	public static void main(String[]args)
    {
    	for(int i=0;i<5;i++)
    	{
 
           Thread t=new Thread(new MultithreadingDemo()) ;
            t.start();
        }
    }   
}*/

// runnable class
/*class MyThread implements Runnable
{
	public void run()
	{

	}
}

   class Test
   {
   	public static void main(String[] args)
     	{
     		new Thread()
     		{
     			public void run()
     		{    		
     			System.out.println(Thread.currentThread().getName()+":");
     		}

   	    }.start();
   	    System.out.println(Thread.currentThread().getName()+" :");
   }
 }*/

//sleep methode
 /*class MyThread extends Thread
 {
 	public void run()
 	{
 		for(int i=0;i<5;i++)
 		{
 			System.out.println(Thread.currentThread().getName()+":");
 			try
 			{
 				Thread.sleep(2000);
 			}
 			catch(Exception e)
 			{
 				System.out.println("sone do..");
 			}
     		
 		}
 	}
 }
  /*class m extends Thread
 {
 	public void run()
 	{
 		for(int i=0;i<5;i++)
 		{
 			System.out.println(Thread.currentThread().getName()+":");
 			try
 			{
 				Thread.sleep(1000);
 			}
 			catch(Exception e)
 			{
 				System.out.println("sone do..");
 			}
     		
 		}
 	}
 }*/



 /*class Test
 {
 	public static void main(String[] args)
 	{
 	
 		 MyThread t=new MyThread();
 		// MyThread m=new MyThread();
         t.start();
        // m.start();
         for(int i=0;i<5;i++)
 		{
 			t.intruppted();

 			System.out.println(Thread.currentThread().getName()+":");
 			try
 			{
 				Thread.sleep(1000);
 			}
 			catch(Exception e)
 			{
 				System.out.println("sone do..");
 			}
     		
 		}
 	}

 	
 }*/

 //yield methode
 /*public class javaYieldExp extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
			System.out.println(Thread.currentThread().getName()+"surbhi");
	}
	public static void main(String[] args)
	{
		javaYieldExp t = new javaYieldExp();
		javaYieldExp t1 = new javaYieldExp();
		t.start();
		t1.start();
		for(int i=0;i<3;i++)
		{
		    t.yield();
		    //t1.yield();
		    System.out.println(Thread.currentThread().getName()+"surbhi");
		}
	}
}*/
//dead lock
 /*class MyThread extends Thread
 {
 	public void run()
 	{
 		for(int i=0;i<5;i++)
 		{
 			System.out.println(Thread.currentThread().getName()+":");
 			try
 			{
 				Thread.sleep(2000);
 			}
 			catch(Exception e)
 			{
 				System.out.println("sone do..");
 			}
     		
 		}
 	}
}

class Test
 {
 	public static void main(String[] args) throws Exception
 	{
 
 		Thread.currentThread().join();	
     		
 		}
 	}*/

 	/*class MyThread extends Thread
 	{    
 		static Thread t;
 		public void run()
 		{
 			for(int i=0;i<5;i++)
 			{
 				System.out.println(Thread.currentThread().getName()+"-MyThread:"+i);
 				try
 				{
 					t.join();
 				}
 				catch(Exception e)
 				{
 					System.out.println("sone do..");
 				}
 			}
 		}
 	}

 	class Test
 	{
 		public static void main(String[] args)throws Exception
 		{
 			MyThread t = new MyThread();
 			t.start();
 			MyThread.t = Thread.currentThread();
 			t.join();
 			for(int i=0;i<5;i++)
 			{
 				System.out.println(Thread.currentThread().getName()+"-MyThread:"+i);
 			}
 		}
 	}*/

//synchronized
 	/*class Task
 	{
 		   synchronized public static   void  doTask(String name)
 		{
 			for(int i=0;i<5;i++)
 				System.out.println("hello: "+name);

 		}
 	}


 	class MyThread extends Thread
 	{
 		Task t;
 		String name;
 		MyThread(Task t,String name)
 		{
 			this.t = t;
 			this.name=name;
 		}
 		public void run()
 		{
 			t.doTask(name);
 		}
 	}


 	class Test
 	{
 		public static void main(String[] args)throws Exception
 		{
 			Task task = new Task();
 			Task task1= new Task(); 

 			MyThread t=new MyThread( task1,"abc");
 			t.start();
 			MyThread t1 = new MyThread( task,"xyz aaa");
 			t1.start();
 		}
 	}*/

 	
 	/*class Table
 	{
 		static synchronized void printTable(int n)
 		{
 			for(int i=1;i<=5;i++)
 			{
 				System.out.println(n*i);
 				try
 				{
 					Thread.sleep(100);
 				}
 				catch(Exception e)
 				{
 					System.out.println(e);
 				}
 			}
 		}
 	}

class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this .t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
  class Test
 {
	public static void main(String args[])
	{
		Table obj = new Table();
	   MyThread1 t1 = new MyThread1(obj);
	   MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start(); 
	}*/
//runnable interface

/*class Test{
	  public static void main(String[] args)
	  {
	  	new Thread (new Runnable()
	  	{
	  		public void run()
	  		{
	  			for(int i=1;i<=5;i++)
	  			{
	  				System.out.println("child:"+i);
	  			}
	  		}
	  	}).start();
	  	for(int i=0;i<=5;i++)
	  	{
	  		System.out.println("main:"+i);
	  	}
	  }
}*/

/*class Test{
	  public static void main(String[] args)
	  {
	  	Thread.currentThread().setPriority(1);

	  	new Thread (new Runnable()
	  	{
	  		public void run()
	  		{
	  			System.out.println("child:"+Thread.currentThread().getPriority());
	  			for(int i=1;i<=3;i++)
	  			{
	  				System.out.println("child:"+i);
	  			}
	  		}
	  	}).start();
	  	System.out.println("child:"+Thread.currentThread().getPriority());
	  	for(int i=0;i<=3;i++)
	  	{
	  		System.out.println("main:"+i);
	  	}
	  }
}*/

//string buffer

/*class Test
{
	public static void main(String[] args)
	{
		StringBuffer s="hello";      // cannot be converted string
		System.out.println(s);
	}
}*/
/*class Test
{
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("hello");    //hello java
		s.append("java");
		s.append("java");
		System.out.println(s);
	}
}*/
//string builder

/*class Test
{
	public static void main(String[] args)
	{
		StringBuilder s=new StringBuilder("hello");    //hwllo hi
		s.append("hi");
		s.append("h");
		System.out.println(s);
	}
}*/

/*class Test
{
	public static void main(String[] args)
	{
		String s="hello";
		String s1=s.concat("hi");
		System.out.println(s);
		System.out.println(s1);
	}
}*/

//generics class8


/*import java.util.*;
class Test
  {
	public static void main(String[] args) throws Exception
	{
		Contain<String> c = new Contain<String>();
		c.set("hi");
		String a = (String)c.get();
		System.out.println(a);
	}
}
class Contain<T>
{
	T value;
	public void set(T val)
	{
		value = val;
	}
	public T get()
	{
		return value;
	}
}*/



/*import java.util.*;
class Test
  {
	public static void main(String[] args) throws Exception
	{
		Contain<Byte> c = new Contain<Byte>();
		c.set((byte)12);
		byte a = c.get();
		System.out.println(a);
	}
}
class Contain<T extends Number>
{
	T value;
	public void set(T val)
	{
		value = val;
	}
	public T get()
	{
		return value;
	}
}*/




/*import java.util.*;  
class Test{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();    
 list.add("bbb"); 
 list.add("cccc"); 
  //list.add(32);//compile time error  
  
//String s=list.get(1);//type casting is not required
System.out.println("element is: "+s);  
  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}*/

/*import java.util.*;
class Test
{
	public static void main (String[] args)throws Exception
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
	    
	    al.add("ccc1");
	    al.add("ddd2");
	    al.add("eee3");
	    al.add("fff4");
	    al.add("aaa5");
	    sendToKmsir(al);
	}
	public static void sendToKmsir(ArrayList al)
	{
		for(int i=0;i<=al.size()-1;i++)
		{
			String name = (String)al.get(i);
			System.out.println(name);
		}
	}
} */ 


/*import java.util.*;
class Test
  {
	public static void main(String[] args) throws Exception
	{
		Contain<String> c = new Contain<String>();
		c.set("hi");
		String a = c.get();
		System.out.println(a);
	}
}
class Contain
{
	C value;
	public void set(C val)
	{
		value = val;
	}
	public C get()
	{
		return value;
	}
}*/










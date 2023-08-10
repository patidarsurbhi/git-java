/*import java.io.*;
class F2UnionF1
{
	 public Boolean belongsTo(String s,String file)throws Exception
	 {
	 	FileReader rd = new FileReader(file);
	 	BufferedReader br = new BufferedReader(rd);
	 	String str;
	 	while ((str=br.readLine())!=null)
	 	{
	 		if(s.hashCode()==str.hashCode())
	 		{
	 			return true;
	 		}
	 	}
	 	        return false;
	 }


	 public static void main(String[] args)throws Exception
	{
	 	F2UnionF1 t = new F2UnionF1();
	 	File f = new File("output.txt");
	 	if(!f.exists())
	 	f.createNewFile();
	 PrintStream ps = new PrintStream(f);
	 FileReader fr = new FileReader("f2.txt");
	 BufferedReader br= new BufferedReader(fr);
	 String s=null;
	 while ((s=br.readLine())!=null)
	   {
	 	   if(t.belongsTo(s,"f1.txt"))
	 	      {
	 		    ps.println(s);
	 	       }
        }
	           ps.close();
	}
}*/



/*import java.io.*;
import java.util.*;
class Test
{
	   public static void main(String [] args)throws Exception
    {
	   	ToDoList t=new ToDoList();
	   	t.add("java","ToDoList create karna hai");
	   	t.add("ds","stack ka program bnanana hai");
	   	t.show();

   }
}
 class ToDoList
{
 	public void add(String head,String task)throws Exception
 	{
 		Task t = new Task(head,task);
 		ArrayList al = readFile();

 		 if(al == null)
 		{
 		 	al = new ArrayList();
 		}

 		 al.add(t);
 		 writeFile(al);
 	}

 	public void show()throws Exception
 	{
 		ArrayList al = readFile();
 		System.out.print(al);	
 	}
 	public void writeFile(ArrayList al)throws Exception
 	{
 		FileOutputStream fos = new FileOutputStream("ToDoList.obj");
 		ObjectOutputStream os = new ObjectOutputStream(fos);
 		os.writeObject(al);
 		os.close();
 	}
 		public ArrayList readFile()throws Exception
 	   {
 		  try
 		   {
 		       FileInputStream fis = new FileInputStream("ToDoList.obj");
 		        
 		        ObjectInputStream is = new ObjectInputStream(fis);
 		        ArrayList al = (ArrayList)is.readObject();
 		        return al;
 	        }
 	           catch (Exception e)
 	           { 
 		          return null;
 	           }
 	    }     
    }

  class Task implements Serializable
  {
  	String heading ,task,status;
  	Task(String heading,String task)
  	{
  		this.heading = heading;
  		this.task = task;
  		this.status = "Not Done";
  	}
  	public String toString()
  	{
  		return "{Heading: "+heading+", Subject:"+task+"}";
  	}
  	public void setheading(String heading)
  	{
  		this.heading = heading;
  	}
  	public void settask(String Task)
  	{
  		this.task = task;
  	}
  	public void setstatus(String status)
  	{
  		this.status = status;
  	}
  	public String getHeading()
  	{
  		return heading;
  	}
  	public String getTask()
  	{
  		return task;
  	}
  	public String getStatus()
  	{
  		return status;
  	}
}*/

import java.io.*;
import java.util.*;
class Test
{
	   public static void main(String [] args)throws Exception
    {
	   	ToDoList t=new ToDoList();
	   	t.add("java","ToDoList create karna hai");
	   	t.add("ds","stack ka program bnanana hai");
	   	t.show();

   }
}
 class ToDoList
{
 	public void add(String head,String task)throws Exception
 	{
 		Task t = new Task(head,task);
 		ArrayList al = readFile();

 		 if(al == null)
 		{
 		 	al = new ArrayList();
 		}

 		 al.add(t);
 		 writeFile(al);
 	}

 	public void show()throws Exception
 	{
 		ArrayList al = readFile(); 
 		 Scanner scan = new Scanner(System.in);
 		 for(int i=0;i<al.size();i++)
 		{
 			Task t=(Task)al.get(i);
 			System.out.print(i+1+" : "+t.getHeading());
 			System.out.print(", "+t.getTask());
 			System.out.println(", "+t.getStatus());
 		}
 		System.out.println("===========================")	;
 		System.out.println("1.Delete Task");
 		System.out.println("2.Update Task");
 		System.out.println("3.Update Status Task");
 		int ch = scan.nextInt();
 		if(ch==1)
 			deleteTask();
 		else if(ch==2)
 			updateTask();
 		else if(ch==3)
 			updateStatus();
 	}

 	public void updateTask()throws Exception
 	{
	Scanner scan = new Scanner(System.in);
 	  	System.out.println("Enter id");
 	  	int id = scan.nextInt ();	  	
 	  	ArrayList al = readFile();
 	  	Task t=(Task)al.get(id-1);
 	  	t.setTask("UPDATE TASK");
 	  	writeFile(al);
 	  	show();

 	}
 	public void updateStatus()throws Exception
 	{
 	
 	}
 	  public void deleteTask()throws Exception
 	  {
 	  	Scanner scan = new Scanner(System.in);
 	  	System.out.println("Enter Task Id");
 	  	int id = scan.nextInt();
 	  	ArrayList al = readFile();
 	  	al.remove(id);
 	  	writeFile(al);
 	  	show();
 	  }

 	public void writeFile(ArrayList al)throws Exception
 	{
 		FileOutputStream fos = new FileOutputStream("ToDoList.obj");
 		ObjectOutputStream os = new ObjectOutputStream(fos);
 		os.writeObject(al);
 		os.close();
 	}
 		public ArrayList readFile()throws Exception
 	   {
 		  try
 		   {
 		       FileInputStream fis = new FileInputStream("ToDoList.obj");
 		        
 		        ObjectInputStream is = new ObjectInputStream(fis);
 		        ArrayList al = (ArrayList)is.readObject();
 		        return al;
 	        }
 	           catch (Exception e)
 	           { 
 		          return null;
 	           }
 	    }     
    }

  class Task implements Serializable
  {
  	String heading ,task,status;
  	Task(String heading,String task)
  	{
  		this.heading = heading;
  		this.task = task;
  		this.status = "Not Done";
  	}
  	public String toString()
  	{
  		return "{Heading: "+heading+", Subject:"+task+"}";
  	}
  	public void setheading(String heading)
  	{
  		this.heading = heading;
  	}
  	public void settask(String Task)
  	{
  		this.task = task;
  	}
  	public void setstatus(String status)
  	{
  		this.status = status;
  	}
  	public String getHeading()
  	{
  		return heading;
  	}
  	public String getTask()
  	{
  		return task;
  	}
  	public String getStatus()
  	{
  		return status;
  	}
}








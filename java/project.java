import java.io.*;
import java.util.*;
class Test
{
	public static void main(String[] args)throws Exception
	{
		ToDoList t = new ToDoList();
		t.add("java","ToDoList create karna hai");
		t.add("ds","statck ka program bnana hai");
		t.show();
	}
}


class ToDoList
{
	public void add(String head,String task)throws Exception
	{
		  Task t = new Task(head.task);
		  ArrayList al = readFile();

		  if(al == null)
		  {
		  	al = new ArrayList();
		  }
		  al.add(t);
		  WriteFile(al);
	}

	public void show()throws Exception
	{
		ArrayList al =readFile();
		System.out.println(al);
	}
	public void WriteFile(ArrayList al)throws Exception
	{
		FileOutputStream fos = new FileOutputStream("todolist.obj");
		ObjectOutPutStream os = new ObjectOutPutStream(fos);
		os.Writeobject(al);
		os.close();

    }

    public ArrayList readFile()throws Exception
    {
    	try
    	{
    		FileInputSteam  = new FileInputStram("tododlist.obj");
    		ObjectInputStram is = new ObjectInputStram
    	}
    	catch(Exception e)
    	{
    		return null;
    	}
    }
}


class Task implements Serializable{
	String heading,task,status;
	Task(String heading,String task)
	{
		this.heading =heading;
		this.task = task;
		this.status = "Not Done"
	}

	public String toString()
	{
		return "{Heading: "+heading+",Subject:"+task+"}";
	}
	
	public void setHeading(String heading)
	{
		this.heading = heading;
	}
	public void setTask(String task)
	{
		this.task = task;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public String getHeading()
	{
		  return heading;
	}
	public String getask()
	{
		  return task;
	}
	public String getStatus()
	{
		  return status;
	}

}
class Countainer
{
   Object values[];
   int size;
   Countainer()
   {
   values=new Object[5];
   size =-1;
   }
	public void add(Object val)
	{
		if(size+1<values.length)
		{
			values[++size]=val;
		}
		else
		{
			 System.out.println("Countainer is full");
		}
	}
	  public Object get(int index)
	  {
	  	if(index>=values.length||index<0)
	  	{
	  		return null;
	  	}
	  	 return values[index];
	  }
	  public String tostring()
	  {
	  	String s="";
	  	for(int i=0;i<values.length;i++)
	  	{
	  		s+=","+values[i];
	  	}
	  	 return"[" +s.substring(2)+"]";
	  }
	  public class Test
	  {
	  	public static void main(String[] args)
	  	{
	  		Countainer c=new Countainer();
	  		for(int i=0;i<5;i++)
	  			c.add(10+i);
	  	}
	  }
	 
}

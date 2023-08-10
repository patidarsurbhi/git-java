class Test
{
	class Inner
	{
	public void m()
	   {
	     System.out.println("hello inner m()");
	   }
	}
	public static void main(String[] args)
	{
	  Test t=new Test();
	  Inner i = t.new inner();
	  i.m();
	}
}
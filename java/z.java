class parent
{
	public void main(int a)
	{
		system.out.println("fun p" +a);
	}
	class Test extends p
	{
		public void fun(int b)
		{
			System.out.println("Test fun" +b );
		}
	}
	public  void main(String [] args)
	{
		Test t=new Test();
		t.fun(10);
	}
}
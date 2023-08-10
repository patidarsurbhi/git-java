class Test
{
	class Inner
	{
        public void m()
        {
        	System.out.prinntln("helo inner m()");
        }
	}
	public static void main(String [] args)
	{
        Test t = new Test();
        t.fun();
	}
	public void fun()
	{
		//Inner m=new Inner();
		new Innwe().m();
		//m.fun();
	}
}
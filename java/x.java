class Test
{
	public static void main(String [] args)
	{
	  int n=123;
	  System.out.println(pow(2,3));
	}




	static int Count(int n)
	{
	   int c=0;
	   while(n!=0)
	   {
	     c++;
	     n=n/10;
	   }
	   return c;
	}
	static int pow(int n,int p)
	{
		int i,f=1;
		for(i=1;i<=p;i++)
		{
			f=f*n;
		}
		return f;
	}
	static armstrong(int n)
	
}
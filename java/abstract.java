/*class Test
{
	public static void main(String arg[] )
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
		   for(j=1;j<=i;j++)
		   {
			System.out.print(i);
		   }
		   System.out.print("\n");
		}
	}
}*/
class Test
{
	public static void main(String args[])
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-1;j++)
			{
				 if(i==j||j==0)
				System.out.print("*");
			    else
			    System.out.print(" ")
			}
			    System.out.println("");
		}

	}
}
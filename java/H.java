
class H
{
	public static void main(String args[])
	{
	  int i,j,n=9;
	  {
	    for(i=0;i<n;i++)
	    {
	       for(j=0;j<n;j++)
	       {
	         if(j==n/2||i==0&&j>=n/2||j==n-1&&i==n/2||i==j&&j>=n/2)

	         System.out.print("*");
	         else
	         System.out.print(" ");
	       }
             System.out.println();
         }
	  }
	}
}
/*class I
{
	public static void main(String args[])
	{
	  int i,j,n=5;
	  {
	    for(i=0;i<n;i++)
	    {
	       for(j=0;j<n;j++)
	       {
	         if(i==0||j==n/2||i==n-1)
	         System.out.print("*");
	         else
	         System.out.print(" ");
	       }
             System.out.println();
         }
	  }
	}
}*/
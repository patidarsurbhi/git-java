/*class Fact
{
	 public static void main(String[] args)
	 {
	   int n=5;
	   System.out.println(fact(5));
	 }


   static int fact(int n)
  {
	   int f=1,i;
	   for(i=1;i<=n;i++)
	 {
	    f=f*i;
	  }
	   return f;
    }
}*/


class Strong
{
	public static void main(String [] args)
	{
        int n=1000,i;
        for(i=1;i<=n;i++)
        if(Strong(i))
        	System.out.println(i);
       //else
        	//System.out.println("is not strong");
	}

	static int fact(int n)
	{
		int f=1,i;
		for(i=1;i<=n;i++)
		{
			f=f*i;	
		}
		  return f;
	}

	static boolean Strong(int n)
	{
		int temp=n,digit,s=0;
		while(temp!=0)
		{
			digit=temp%10;
			s=s+fact(digit);
			temp=temp/10;
		}
		return s==n;
	}
}




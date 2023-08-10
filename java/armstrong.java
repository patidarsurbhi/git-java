   class arm
   {
   	public static void main(String[] args)
   	{
   		int n=153;
   		
   		System.out.println (armstrong(n));
   	}
   
   	static int countdigit(int n)
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
   	  int f=1,i;
   	  for(i=1;i<=p;i++)
   	  {
   	  	f=f*n;
   	  }
   	  return f;
   }
  static boolean  armstrong(int n)
   {
   	  int t=n,s=0,c,r;
   	 c=countdigit(n);
   	 while(n!=0)
   	 {
   	 	r=n/10;
   	 	s=s+pow(r,c);
   	 	n=n/10;
   	 }
   	 if(s==t)
   	 	return false;
   	   else
   	   	return true;
   	}

}   
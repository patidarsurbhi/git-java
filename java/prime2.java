class Text
{
	public static void main(String[] args)
	{
		int n=7;
		if(isprime(n))
		System.out.println(n is prime);
        else
        System.out.println(n is not prime);
	}

  static boolean isprime(int n)
  {
  	int i=2;
  	while(i<=n/2)
  	if(n%i++==0)
  	return false;
    return true;
  }
}
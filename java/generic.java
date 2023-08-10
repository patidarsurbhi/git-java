class Text
{
  public static void main(String[] args)
  {
    int n=1234,sum;
    while(true)
      {
        	sum=sumdigit(n);
        	if(sum<10)
        {
        	 System.out.println(sum);
        	 break;
        }
        else
        {
        	n=sum;
        }
      }
  }
}


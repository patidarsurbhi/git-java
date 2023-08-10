import java .util.Scanner;
class Test
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter your Year");
	   int year=sc.nextInt();
	   	  if(year%400==0&&year%4==0)
	  {
	     System.out.println("is leap Year"+year);
	  }
	  else if(year%100==0)
	  {
	  System.out.println("is not leap year"+year);
	  }
	  else
	  {
	  	System.out.println("is not leap year");
	  }

	}
}
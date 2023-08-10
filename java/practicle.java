/*import java.util.Scanner;
class Test
{
	 public static void main(String[] args) {
	 	Scanner s= new Scanner(System.in);
	 	System.out.println("Enter the number");
	 	int days =s.nextInt();
	 	int week,month,year;

	 	year= days/365;
	 	days=days%365;

	 	month= days/30;
	 	days=days%30;


	 	week= days/7;
	 	days=days%7;


	 	System.out.println("year:"+year);
	 	System.out.println("month:"+month);
	 	System.out.println("week:"+week);
	 	System.out.println("days:"+days);
	 }


}*/
/*import java.util.Scanner;
class Test
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int days=sc.nextInt();
		int week,month,year;

		year=days/365;
		days=days%365;

		month = days/30;
		days=days%30;

		week = days/7;
		days = days%7;

		System.out.println("year:"+year);
		System.out.println("month:"+month);
		System.out.println("week:"+week);
		System.out.println("days:"+days);
	}
}*/
/*import java.io.*;
class MarksOutOfBounds extends Exception{
	public void showError()

	{
		System.out.println("invalid marks");
	}
}
class ErrorTest

{

     public static void main(String as[]) throws Exception

  {


      InputStreamReader isr=new InputStreamReader(System.in);

      BufferedReader br=new BufferedReader(isr);

    int m=0;

   try

   {

    System.out.println("Enter Marks:");

    m=Integer.parseInt(br.readLine());


     if(m>200)throw new MarksOutOfBounds();

     System.out.println("Your Marks:"+m);
 
   }

catch(MarksOutOfBounds e)

   {

       e.showError();

      }

   }

}*/


/*import java.util.Scanner;
class Test
{
	  public static void main(String[] args) {

	  	Scanner sc= new Scanner(System.in);
	  	System.out.println("Enter the number");
	  	int days=sc.nextInt();
	  	int week,year,month;

	  	year= days/365;
	  	days=days%365;

	  	month=days/30;
	  	days=days%30;

	  	week=days/7;
	  	days=days%7;

	  	System.out.println("year:"+year);
	  	System.out.println("month:"+month);
	  	System.out.println("week:"+week);
	  	System.out.println("days:"+days);


	  	
	  }
}*/

/*import java.io.*;
class  MarksOutOfBounds extends Exception
{
	public void showError()
	{
		System.out.println("invaild Marks");
	}
}

class Test
{
	public static void main(String[] args) {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter marks");
		int m=0;
		try
		{
			System.out.println("Enter marks");
			m=Integer.parseInt(br.readLine());
			 m=Integer.parseInt(br.readLine());
			if(m>200)throw new MarksOutOfBounds();
			System.out.println("yours marks:"+m);
		}
		catch(MarksOutOfBounds e)
		{
			e.showError();

		}
	}
}*/


/*class Test
{
	public static void main(String[] args)
	{
		
	
	       int i=1,n=7;
	          int s;
	            for(i=1;i<=n;i++)
	     {
	 	      s=i*n;
         }
         System.out.println(s);
    }
}*/

/*import java.util.Scanner;
class Test
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}*/
import java.io.*;

class MarksOutOfBounds extends Exception{
	public void showError()
	{
		System.out.println("Invalid Marks");
	}
}

class Test
{
	public static void main(String[] args) {
		
	
	 InputStreamReader isr= new InputStreamReader(System.in);
	 BufferedReader br= new BufferedReader(isr);
	int m=0;
	try
	{
		System.out.println("Enter Marks");
		//m=Integer.parseInt(br.readLine());
		 m=Integer.parseInt(br.readLine());
		if(m>300)throw new MarksOutOfBounds();
			System.out.println(m);

	}
	catch(MarksOutOfBounds e)
	{
		e.showError();
	}
}
}
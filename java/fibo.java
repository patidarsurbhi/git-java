class fibo
{
	public static void main(String [] args)
	{
		int i,n=5,a=0,b=1;
		int c=a+b;
		  while(c<=n)
		{
           System.out.println(c);
           c=a+b;
           a=b;
           b=c;
		}
	}
}


/*import java.util.Scanner;

public static void main(String[] args)
{
	int count,num1=0,num2=1;
	System.out.println("..............");
	Scanner sc= new Scanner(System.in);
	count=Scanner.nextInt();

}*/

/*import java.io.*;

class MarksOutOfBounds extends Exception

{

      public void showError()

   {

     System.out.println("Invalid Marks");

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


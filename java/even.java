import java.util.Scanner;
class text
{
   public static void main(String[] args)
   {
      System.out.println("enetr no");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int i;
     for( i=1;i<n;i++)
     {
     if(iseven(i))
     System.out.println(i);
     }
   }
    
   static boolean  iseven(int n)
   {
      int i=2;
       if(n%i==0)
       return true;
       return false;
   }
}
class p
{
	  public void m1()
	  {
	    System.out.println("p m1");
	  }
	  public void m2()
	  {
	    System .out.println("p m2");
	  }
}


    public class Test extends p
    {

     public void m2()
     {
       System.out.println("Test m2");
     }
      public void m3()
      {
        System.out.println("Test m3");
      }
       public static void main(String []args)
       {
         Test obj = new Test ();
         obj.m1();
         obj.m2();
         obj.m3();
       
       }
    }

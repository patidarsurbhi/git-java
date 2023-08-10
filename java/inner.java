/*class Test
{
	class Inner{
		public void m()
		{
			System.out.println("hello inner m()");
		}


	 /*public static void main(String[] args)
	  {
         Test t=new Test();
         Inner i =t. new Inner();
         i.m();
	  }*/

	  /*public static void main(String[] args)
	  {
	  	Test t=new Test();
	  	t.fun();
	  }
	  public void fun()
	  {
	  	new Inner ().m();
	  }
}*/

/*class Test
{
      public static void main(String [] args)
      {
          System.out.println("hello");
      }
      public void fun()
      {
      	Outer t=new Outer();
      	Outer.Inner i = t.new Inner();
      	i.m();
      }
}

class Outer
{
	class Inner{
		public void m()
		{
			System.out.println("hello");
		}
	}
}*/

/*class Test
{
	public static void main(String[] args)
	{
		outer t = new outer();
		t.fun();
	}
}
   class Outer
   {
	public void fun()
	{
		class Inner
		    {
			public void m()
			    {
				System.out.println("m");
			     }
		      }

		  Inner i   = new Inner();
		   i.m();
	    }
    }*/

        /*class Test
        {
        	public static void main(String[] args)
        	{
        		outer t=new outer();
        		t.fun();
        	}
        }

          class outer
    {

      int i=40;
       public void fun()
       {

     // int i=30;
		class Inner
		{
			int i=20;
				public void m()
				{
					int i=10;
					System.out.println("hello inner m()"+i);
					System.out.println("hello inner m()"+this.i);
			        System.out.println("hello inner m()"+outer.this.i);
				}
		}

			Inner i=new Inner();
			i.m();		
	}
}*/

 class Test
        {
        	public static void main(String[] args)
        	{
        		outer t=new outer();
        		t.fun();
        	}
        }

          class outer
    {

      int i=40;
       public void fun()
       {

      int i=30;
		class Inner
		{
			//int i=20;
				public void m()
				{
					//int i=10;
					System.out.println("hello inner m()"+i);
					//System.out.println("hello inner m()"+this.i);
			        //System.out.println("hello inner m()"+outer.this.i);
				}
		}

			Inner t=new Inner();
			t.m();		
	}
}











/* interface Inter
 {
 	public void fun();
 	public void m();
 }
 class Test 
 {
 	public static void main(String[] args)
 	{
 		Inter i = new Inter()
 		{
 			public void fun()
 			{
 				System.out.println("hello fun");
 			}
 			public void m()
 			{
 				System.out.println("hello m");
 			}
 		};
 		i.fun();
 		i.m();
 	}
 }*/

/*abstract class Inter
{
	public abstract void fun();
}
class Test
{
	public static void main(String[] args)
	{
		Inter i=new Inter()
		{
			public void fun()
			{
				System.out.println("hello");
			}
		};
          i.fun();
	}
}*/

/*interface mahesh
{
	public void noodies();
}*/
 

/*class Test
{
	public static void main(String[] args)
	{
		mahesh p1 = new mahesh()
		{
			public void noodies()
			{
				System.out.println("spicy");
			}
		};
		p1.noodies();
		mahesh p2 = new mahesh()
		{
			public void noodies()
			{
				System.out.println("normal");
			}
		};
		p2.noodies();
		mahesh p3 = new mahesh()
		{
			public void noodies()
			{
				System.out.println("normal");
			}
		};
		p2.noodies();
	}
}*/


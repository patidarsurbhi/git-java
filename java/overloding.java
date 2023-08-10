/*class overloding
{
     
	 static void sum(long a,long b)
	 {
	    System.out.println("char Character");
	 }
	     static void main (String a,int b)
	     {
	        System.out.println("string ,int");
	     }
	      static void sum(byte a,int b)
	     {
	        System.out.println("byte,int");
	     }
	     public static void main(String[] args)
	     {
	       sum(10,20);
	     }
	 }*/

	   /*class Jcp302
	   {
	   	void m1(Object o)
	   	{
	   		System.out.print("OBJECT");
	   	}
	   	void m1(A ob)
	   	{
	   		System.out.println("A");
	   	}
	   	void m1(C ob)
	   	{
	   		System.out.println("C");
	   	}
	   	void m1(D ob)
	   	{
	   		System.out.println("D");
	   	}
	   	    public static void main(String[] args)
	   	    {
	   	    	new Jcp302().m1(null);
	   	    	System.out.println("Hello World!\t");
	   	    }
	   }
	     class A
	     {

	      };

	      class B extends A{               //3

	     };
         Class C extends B
         {

         };
         class D extends B{

         };*/




         /*class Jcp312
         {
         	public static void main(String[] args)
         	{
         		Jcp312.m1(null);
         	}
         	  public static void m2()
         	  {
         	  	System.out.print("Static");          //4
         	  }
         	  public static void m1(Jcp312 o)
         	  {
         	  	o.m2();
         	  	o.m3();
         	  }
         	  public void m3()
         	  {
         	  	System.out.println("NonStstic");
         	  }
         	}*/


         /*class Jcp313
         {
         	public static void main(String[] args)
         	{
         		new Jcp313().m1();
         	}
         	public void m1()               //5
         	{
         		null.m2();

         	}
         	public static void m2()
         	{
         		System.out.println("Hai");
         	}
         }*/



         /*class Jcp5
         {
         	public static void main(String[] args)
         	{
         		System.out.println("Hello World");    //6
         	}
         	 void X(int y){

         	 }
         	 int X(int y)
         	 {

         	 }
         }*/



         /*class Sample{
         	static void m1(byte b)
         	{
         		 System.out.println("byte");
         	}
         	static void m1(float b)
         	{
         		System.out.println("float");       //10
         	}
         	static void m1(double b)
         	{
         		System.out.println("double");
         	}
         	public static void main(String [] args)
         	{
         		byte b=10;
         		int a=20;
         		long l=1;
         		m1(b);
         		m1(10);
         		m1(1.0);
         	}
         }*/


         /*class Sample{
         	static void m1(byte b)
         	{
         		 System.out.println("byte");
         	}
         	static void m1(char b)
         	{
         		System.out.println("char");       //11
         	}
         	
         	public static void main(String [] args)
         	{
         		byte b=10;
         		m1(b);
         		m1((byte)10);
         		m1(1);
         		m1('a');
         	}
         }*/



         /*class Sample{
         	static void m1(byte b)
         	{
         		 System.out.println("byte");
         	}
         	static void m1(Long b)
         	{
         		System.out.println("Long");       //13
         	}
         	
         	public static void main(String [] args)
         	{
         		byte b=10;
         		m1(b);
         		m1((byte)10);
         		m1(100);
         	}
         }*/



          /*class Sample{
         	static void m1(Byte b)
         	{
         		 System.out.println("byte");
         	}
         	static void m1(int b)
         	{
         		System.out.println("int");       //14
         	}
         	
         	public static void main(String [] args)
         	{
         		byte b=10;
         		m1(b);
         		m1((byte)10);
         		m1(100);
         	}
         }*/


      /*class Sample{
         	static void m1(int a,double b)
         	{
         		 System.out.println("int ,double");
         	}
         	static void m1(long a,long b)
         	{
         		System.out.println("long long");       //15
         	}
         	
         	public static void main(String [] args)
         	{
         	     m1(10,20);
         	}
         }*/



         
         /*class Sample{
         	static void m1(int a,double b)
         	{
         		 System.out.println("int ,double");
         	}
         	static void m1(long a,long b)
         	{
         		System.out.println("long long");       //16
         	}
         	  static void m1(Integer a,Integer b)
         	  {
         	  	System.out.println("Integer,Integer");
         	  }
         	
         	public static void main(String [] args)
         	{
         	     m1(10,20);
         	}
         }*/



         
         /*class Sample{
         	static void m1(int...a,double f)
         	{
         		 System.out.println("int... ,double");
         	}
         	static void m1(int a,double b)
         	{
         		System.out.println("long ,double");       //17
         	}
         	  static void m1(Integer a,Integer b)
         	  {
         	  	System.out.println("long,long");
         	  }
         	
         	public static void main(String [] args)
         	{
         	     m1(10,20);
         	}
         }*/



/*class Sample{
         	static void m1(int a ,float b)
         	{
         		 System.out.println("int ,float");
         	}
         	static void m1(int a,double b)
         	{
         		System.out.println("int double");       //19
         	}
         	  static void m1(Integer a,Integer b)
         	  {
         	  	System.out.println("long,long");
         	  }
         	
         	public static void main(String [] args)
         	{
         	     m1(10,20);
         	     m1(10,20l);
         	}
         }*/


/*class Sample{
         	static void m1(Number n)
         	{
         		 System.out.println("Number");
         	}
         	static void m1(byte b)
         	{
         		System.out.println("byte");       //19
         	}
         	  
         	
         	public static void main(String [] args)
         	{
         	     m1('a');
         	     m1(10);
         	     m1(20L);
         	}
         }*/

         
         

/*class Sample{
         	static void m1(Object b)
         	{
         		 System.out.println("Object");
         	}
         	static void m1(Number n)
         	{
         		System.out.println("Number");       //20
         	}
         	  static void m1(byte b)
         	  {
         	   System.out.print("byte");
         	   }
         	public static void main(String [] args)
         	{
         	     m1('a');
         	     m1(10);
         	     m1("");
         	}
         }*/

         
  //Q.21      
/*class Sample{
         	static void m1(Object b)
         	{
         		 System.out.println("Object");
         	}
         	static void m1(String n)
         	{
         		System.out.println("String");       //21//string string int
         	}
         	  static void m1(char b)
         	  {
         	   System.out.print("char");
         	   }
         	   
         	public static void main(String [] args)
         	{
         	     m1("");
         	     m1(null);
         	     m1('a');
         	}
         }*/



  // Q.22
   /* class Sample{
         	static void m1(Object b)
         	{
         		 System.out.println("Object");
         	}
         	static void m1(String n)
         	{
         		System.out.println("String");       //22
         	}
         	  static void m1(int b)
         	  {
         	   System.out.print("int");
         	   } 
         	   static void m1(Intger a)
         	   {
         	   	System.out.print("Integer");
         	   }
         	public static void main(String [] args)
         	{
         	     m1("");
         	     m1(null);
         	     m1('a');
         	     m1(10);
         	}
         }*/
     
         
//Q.23
         /*class Sample
         {
         	static void m1(byte b)
         	{
         		System.out.println("byte");
         	}
         	static void main(Long a)
         	{
         		System.out.print("Long");
         	}
         	public static void main(String [] args)
         	{
         		m1(10);
         	}
         }*/
         
         
          
     // Q.24
        /* class Sample
         {
         	static void m1(String [] args)
         	{
         		System.out.print("int,Integer b");
         	}
         	  static void m1(Integer a,int b)
         	  {
         	  	System.out.print("int,Integer");
         	  }
         	  public static void main(String [] args)
         	  {
         	  m1(1,2);
         }
        }*/

        //Q.25
        /*class Sample
         {
         	static void m1(int a,Ineger b)
         	{
         		System.out.print("int,Integer b");
         	}
         	  static void m1(Integer a,int b)
         	  {
         	  	System.out.print("int,Integer");
         	  }
         	  public static void main(String [] args)
         	  {
         	  m1(1,new Integer(10));
         }
        }*/


       // Q.26

        /*class Sample
         {
         	static void m1(int a,long...l)
         	{
         		System.out.print("int,long");
         	}
         	  static void m1(int a,Object o)
         	  {
         	  	System.out.print("int,Object");
         	  }
         	  static void m1(Object ref)
         	  {
         	  	System.out.print("Object");
         	  }
         	  Static void m1(int...a)
         	  {
         	  	System.out.print("...");
         	  }
         	  public static void main(String [] args)
         	  {
         	  m1(1,1L);
         	  m1(1,null);
         	  m1(null);
         }
        }*/


    //Q.27
       /* class Sample
        {
        	static void main(int...a)
        	{
        		System.out.print("int...");
        	}
        	  static void m1(int a,int...b)
        	  {
        	  	System.out.print("int,int...b");
        	  }
        	    static void m1(Integer i)
        	    {
        	    	System.out.print("Integer");
        	    }
        	      static void m1(Object ref)
        	      {
        	      	System.out.print("Object");
        	      }
        	      public static void main(String [] args)
        	      {
        	      	m1(10);
        	      }
        }*/
   // Q.28
       /* class Sample
        {
        	static void main(int...a)
        	{
        		System.out.println("int...");
        	}
        	  static void m1(int a,int...b)
        	  {
        	  	System.out.println("int,int...b");
        	  }
        	    static void m1(Integer i)
        	    {
        	    	System.out.println("Integer");
        	    }
        	      static void m1(Object ref)
        	      {
        	      	System.out.println("Object");
        	      }
        	      public static void main(String [] args)
        	      {
        	      	m1(10);
        	      	m1(10,20);
        	      	m1(1,2,3);
        	      }
        }*/

//   Q.29

        /*class Test
        {
        	static void fun(int...ar)
        	{
        		System.out.println("int...");
        	}
        	public static void main(String...args)
        	{
        		int a[]={10,20};
        		fun(10,20);
        		fun(a);
        	}
        }*/
        //Q.30
        /*class Test
        {
        	
        	static void fun(int...ar)
        	{
        		System.out.println("int...");
        	}
        	static void fun(int[] ar)
        	{
        		System.out.println("int[]");
        	}
        	public static void main(String...args)
        	{
        		int a[]={10,20};
        		fun(10,20);
        		fun(a);
        	}
        }*/


         // Q.31
        /* class Test
        {
        	static void m1(int...a)
        	{
        		System.out.println("int...");
        	}
        	static void m1(byte b)
        	{
        		 System.out.println("byte");
        	}
        	static void m1(Integer i)
        	{
        		System.out.println("interger");
        	}
        	  static void m1(Object ref)
        	  {
        	  	System.out.println("Object");
        	  }
        	   /*static void m1(long ref)
        	   {
        	   	System.out.println("long");
        	   }*/
        	  /* public static void main(String[] args)
        	   {
        	   //	byte b=10;
        	   	int i=10;
        	   	//int a[]=null;
        	   //	m1(b);
        	     	m1(i);
        	  // m1(a);        	  



        	  }
        }*/
    

     // Q.34

    /*class Sample
    {

    		static void m1 (int...a)
           {
    		   System.out.println("int...");
    	    }
    	        static void m1(Integer i)
                {
    	            System.out.println("integer");
    	         }
    	            static void m1(Object ref)
    	             {
    	            	System.out.println("Object");
                    	}
                        	static void m1(long ref)
                                 	{
    		                          System.out.println("long");
    	                            }
    	  public static void main(String[] args)
    	  {
    	  	byte b=1;
    	  	m1(b);
    	  	m1((Byte)b);
    	  	m1(10);
    	  	m1((Integer)10);
    	  	m1(1,2);
    	  }
        }*/
    

//Q.35
       /* class Sample
    {

    		static void m1 (int...a)
           {
    		   System.out.println("int...");
    	    }
    	        static void m1(Integer i)
                {
    	            System.out.println("integer");
    	         }
    	            static void m1(Object ref)
    	             {
    	            	System.out.println("Object");
                    	}
                    	public static void main(String [] args)
                    	{
                    		m1(10l);
                    		m1((Integer)10);
                    		m1(10);
                    	}
        }*/
//Q.36
/* class Sample
    {

    		static void m1 (int...a)
           {
    		   System.out.println("int...");
    	    }
    	     static void m1(int a ,Object ref)
    	             {
    	            	System.out.println("Object");
                    	}

                    	public static void main(String [] args){


                    		byte b=10;
                    		m1(b,10);
                    		m1(10,20,30);
                    	}
     }   */
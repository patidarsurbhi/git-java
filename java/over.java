/*class p
{
    void int fun(int a)
    {
     System.out.println("fun p" +a);
     return a;
    }
 }
  class Test extends p
 {
      public static fun(int b)
     {
        System.out.println("Test fun" +b);
        return b;
       
      }
  
        public static void main(String [] args)
     {
        Test t=new Test ();
         t.fun(10);
         	
        
     }
}*/

/*class MyClass
{
	void show(float x)
	{
		System.out.println("surbhi");
	}
	void show(long x)
	{
		System.out.println("aaaa1");
	}

	public static void main(String[] args)
	{
		MyClass s=new MyClass();
		s.show((byte)2);
	}
}*/




class Student{
  private String name;
  public Student(String n){
    name = n;
  }
  public Student(){
    name = "unknown";
  }
  public void printName(){
    System.out.println(name);
  }
}
class Cu1{
  public static void main(String[] args){
    Student a = new Student("Yugal joshi");
    Student b = new Student();
    a.printName();
    b.printName();
  }
}






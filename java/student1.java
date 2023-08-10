class Student
{
   String name;
   int rollno;
   Student (String name,int rollno)
   {
      this.name=name;
      this.rollno=rollno;
   }

}
class User
{
    String name;
    User(String name)
    {
    	this.name=name;
    }
}
class Demo
{
	public static void main(String[] args)
	{

		Student s=new Student("hello",100);
		User u= new User("hello");
		System.out.println(s);
		System.out.println(u);
	}
}
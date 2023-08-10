public class Employee
{
	int empId;
	String empName;
	String city;
}

   Employee(int empId,String empName,String city)
   {
     this.empId=empId;
     this.empName=empName;
     this.city=city;
   }
     public static void main(String[] args)
     {
     Emplyee emp=new Employee(100,"surbhi","indore");
     Employee emp1=new Employee(101,"sheet","ujjain");
     System.out.println(emp);
     System.out.println(emp1);
     }
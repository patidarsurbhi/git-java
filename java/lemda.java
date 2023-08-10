/*interface Inter1{


	public void m1();

}
class Demo implements Inter1{
	public void m1(){
		System.out.println("m1 implements without Lamda expression");

	}
}

 class Test{
	public static void main(String[] args)
	{
		Demo d= new Demo();
		d.m1();
	}
}*/

/*interface Inter1{
	public void m1();

}

class  Test
{
	public static void main(String[] args) {
		Inter1 in = () ->System.out.println("m1 implementation using lemda expression");
		in.m1();
	}
}*/



/*interface Inter1{
	abstract void add(int a,int b);
	abstract void add(int a,int b);
}
class Test
{ 
	public static void main(String[] args) {
	Inter1 in=(a,b)->System.out.println("sum is:"+(a+b));
	in.add(20,30);
	in.add(10,30);
}
}*/


interface Inter1 {
 
    abstract int square(int a);
}
 
class  Test{
 
    public static void main(String[] args) {
         
        Inter1 in = n->n*n;
         
        System.out.println("Square of 9 is : "+in.square(9));
        System.out.println("Square of 7 is : "+in.square(7));
    }
}


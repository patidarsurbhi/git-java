/*class Test
{
	public static void main(String args[])
	{
	int a[] []=new int[5][7];
	System.out.println(a.length);
	System.out.println(a);
	System.out.println(a[0]);
	System.out.println(a[1]);
	}
}*/
/*class Test
{
	public static void main(String args [])
	{
	int a[] [] []=new[5] [7] [9];
	System.out.println(a);
    }
}*/
/*class Test
{
	public static void main(String args [])
	{
		Test a[];
		a=new Test[5];           //output
		System.out.println(a[0]);
		System.out.println(a);
	}
}*/
/*class Test{

	public static void main(String args [])
	{
		Test a[];
		a=new Test[5][1];          //error
		a[0]=new Test[];
		System.out.println(a);
	}
}*/



  /*class Test{
	public static void main(String args [])
	{
		Test a[];
		a=new Test[5][];          
		a[0]=new Test[5];                 //error
		System.out.println(a[0]);
	}
}*/



class Test{
	public static void main(String args [])
	{
		Test a[][]=new Test[2][0];           //output 
		System.out.println(a[0]);
	}
}
/*class Test{
	public static void main(String args [])
	{
		Test a[][]=new Test[2][];           //null
		System.out.println(a[0]);
	}
}*/



/*class Test{
	public static void main(String args [])
	{
		Test a[][]=new Test[2][];           //null
		System.out.println(a[0]);
	}
}*/

/*class Test{
	public static void main(String args [])
	{
		Test a[][]=new Test[][2];           //error
		System.out.println(a[0]);
	}
}*/

/*class SuperClass
{
	SuperClass()
	{
	  System.out.println("Supwe class constructor");
	}
}
  class SubClass extends SuperClass
  {
    SubClass()
    {
      super();
      System.out.println("Sub class constructor");
    }
  }
    class Test
    {
      public static void main(String [] atgs)
      {
       SubClass s=new SubClass();
      }
   }*/
	 
 
    /*class singleton
    {
    	public static singleton val=null;
    	private singleton()
    	{

    	}
    	public static singleton getobj()
    	{
    		  if(val==null)
    		  	val=new singleton();
    		     return val;
    	}
    }
    		  class Test
    		{
    		  	public static void main(String [] args)
    		  	{
    		  		singleton x=singleton.getobj();
    		  		singleton x1=singleton.getobj();
    		  		System.out.println(singleton.getobj());
    		  		System.out.println(singleton.getobj());
	            }
            }*/

/*class  Test
{
	public  void main(String [] args)throws Exception
	{
		File f=new File("abcd.txt");
		 //f.mkdir();               //folder create
		  f.createNewFile();        //file create
		{
	     System.out.println("file created");
	    }  
	}
}*/
/*import java.io.*;
 class Test
 {
 	public static void main(String [] args)throws Exception
 	{
 		FileWriter fw=new FileWriter("abcd.txt");
 		fw.write("hello");
 		//fw.newline();
 		fw.write("100");
 		fw.write('a');
 		fw.writestatic("surbhi");
 		fw.close();
 	}
 }*/
 


/*import java.io.*;
 class Test
 {
 	public static void main(String [] args)throws Exception
 	{
 		FileReader fr=new FileReader("abcd.txt");
 		int a=fr.read();
 		System.out.println(a);
 		System.out.println((char)a);
 		System.out.println((char)a);
 		System.out.println((char)a);
 		System.out.println((char)a);
 	}
 }*/


 /* import java.io.*;
 class Test
 {
 	public static void main(String [] args)throws Exception
 	{
 		FileReader fr=new FileReader("super.java");
 	    int a=fr.read();
 		System.out.println(a);
 	    System.out.println(a);
 	    System.out.println(a);
 	    System.out.println(a);
 	}
 }*/

/*import java.io.*;
 class Test
 {
 	public static void main(String [] args)throws Exception
 	{
 		FileWriter fw=new FileWriter("abcd.txt");
 		BufferedWriter bw=new BufferedWriter(fw);
 		bw.write("hello");
 		//bw.newline();
 		bw.close();
 	}
 }*/

 import java.io.*;
 class Test
 {
 	public static void main(String [] args)throws Exception
 	{
 		print Stream p=new print Stream("abcd.txt");
 		p.println(100);
 		p.println(102);
 		p.close();
 	}
 }










 <script>
	
	function validate()
	{    
		var temp=true;
		var name=document.getElementById("name");
		var nameError = document.getElementById("nameError");
		if(name.value=="")
		{
			nameError.innerText = "Name is re";
			return false;
		}
		else if(name.value.length<3)
		{
			nameError.innerText = "in Name is fi ";
			return false;
		}
		else(name.value.length=="")
		{
			nameError.innerText = "Name is re";
			return true;
		}
	}
</script>











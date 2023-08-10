/*import arithmetic.*;
public class MyMath
{
	   public int add (int x,int y)
	   {
	      return x+y;
	   }
	   public int sub(int x,int y)
	   {
	     return x-y;
	   }
	   public int mul(int x,int y)
	   {
	      return x*y;
	   }
	     public double div(int x,int y);
	     {
	       return (double)x/y;
	     }
	       public int mod(int x,int y)
	       {
	         return x%y;
	       }
}


  //import arithmetic.*;
  class Test
  {
    public static void main(String args[])
    {
      MyMath m=new MtMath();
      System.out.println(m.add(8,5));
      System.out.println(m.sub(8,5));
       System.out.println(m.mul(8,5));
        System.out.println(m.div(8,5));
         System.out.println(m.mod(8,5));

    }
  }*/



  /*import java.util.Scanner;
  class Find
  {
  	  int length,width,height;
  	  public void area()
  	  {
  	  	System.out.println("Area of Rectangle "+length*width);
  	  }
  	   public void volume()
  	   {
  	   	System.out.println("Volume of Cuboid "+length*width*height);
  	   }
  	   public void input()
  	   {
  	   	Scanner scan=new Scanner(System.in);
  	   	System.out.print("Enter Length");
  	   	length =scan.nextInt();
  	   	System.out.print("Enter Width");
  	   	width=scan.nextInt();
  	   	System.out.print("Enter Height");
  	   	height=scan.nextInt();
  	   }
  }
   class FindOut extends Find{
   	public static void main(String arg[])
   	{
   		FindOut f=new FindOut();
   		f.input();
   		f.area();
   		f.volume();
   	}
 }*/



 /*import java.util.*;
 class AreaOfCircle
 {
 	private float radius=0.0f;
 	private float area = 0.0f;
 	private float perimeter = 0.0f;
 	public void readRadius()
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter radius");
 		radius = sc.nextFloat();

 	 }
 	 public float getArea()
 	 {
 	 	area = (float)Math.PI*radius*radius;
 	 	return area;
 	 }
 
 	  public float getPerimeter()
 	  {
 	  	perimeter = 2*(float)Math.PI * radius;
 	  	return perimeter;
 	  }
 }
  class circle
 {
 	public static void main(String [] args)
 	{
 		AreaOfCircle area = new AreaOfCircle();
 		area.readRadius();
 		System.out.println("Area of circle:" +area.getArea());
 		System.out.println("Perimeter of circle:" + area.getPerimeter());
 	} 
 }*/


 /*import java.applet.*;
 import java.awt.*;
 import java.awt.event.*;
 public class largestnumber extends Applet implements ActionListener
 {
 	TextField t1,t2,t3,t4;
 	    Button b1;
 	 public void inti()
 	 {
 	 	  setLayout(null);

 	 	  t1=new TextField(15);
 	 	t1.setBounds(100,25,50,20);
 	 	  t2=new TextField(15);
 	    t2.setBounds(100,50,50,20);
 	      t3=new TextField(15);
 	 	t3.setBounds(100,75,50,20);
 	 	  t4=new TextField("Ans");
 	    t4.setBounds(175,65,50,20);
 	       b1=new Button("Find");
 	    b1.setBounds(175,65,50,30);
 	    add(t1);
 	    add(t2);
 	    add(t3);
 	    add(t4);
 	    add(b1);
 	    b1.addActionListener(this);
 	 }
 	 public void
 	 actionPerformed(ActionEvent e)
 	 {
 	 	int i,j,k;
 	 	i=Intger.parseInt(t1.getText());
 	 	j=Intger.parseInt(t2.getText());
 	    j=Intger.parseInt(t3.getText());
 	  if(i<j)
 	  {
 	  	if(j<k)
 	  	t4.setText(""+k);
 	  else
 	  	  t4.setText(""+j);
 	  }
 	  else
 	  	t4.Text(""+i);
 	 }

 }*/

/* import java.io.*;
 public class FileMerge
 {
 	public static void main(String [] args)throws IndexOutOfBoundsException
 	{
  PrintWriter pw =new PrintWritwr()
 	}
 }*/

/*import java.io.*;
public class FileMerge{
   public static void main(String[] args)
   {
   	PrintWriter pw = new PrintWriter("file3.txt");
   	BufferReader br = new BufferReadernew (new FileReader("files.txt"));
   	String line = br.readLine();
   	while(line != null)
   	{
   		pw.println(line);
   		line = br.readLine();
   	}

   	   br = new BufferReader(new FileReader("file2.txt"));

   	   line = br.readLine();
   	   while(line  = null)
   	   {
   	   	pw.println(line);
   	   	line = br.readLine();
   	   }

   	   pw.flush();
   	   br.close();
   	   pw.close();

   	   System.out.println("Merged file1.txt and file2.txt into file3.txt");
   }
}*/

 /*class Test
 {
 	 public static void main(String[] args)
 	 {
 	 	int a=20,b=20,c=30,t;
 	 	t=a+b+c/3;
 	 	System.out.println(t);

 	 }
 }*/

import java.util.Scanner;
import java.io.*;
class Test
{
    public static void main(String[] args)
    {
        String fname;
        Scanner scan = new Scanner(System.in);
        
        // enter filename along with its extension
        System.out.print("Enter the Name of File: ");
        fname = scan.nextLine();
        
        String line = null;
        try
        {
            FileReader fileReader = new FileReader(fname);
            
            // always wrap the FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            

            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
    }
}


















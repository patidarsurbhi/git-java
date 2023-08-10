
//serialization

/*import java.io.*;
class Test
{
	   public static void main(String [] args)throws Exception
	   {
	   	Emp e=new Emp();
	   	FileOutputStream fos = new FileOutputStream("op.obj");
	   	ObjectOutputStream oos = new ObjectOutputStream(fos);
	   	oos.writeObject(e);

	   }
}
 class Emp implements Serializable
 {
 	   int id=100;
 	   String name ="bablu";
 }*/

/*import java.io.*;
class Test
{
	   public static void main(String [] args)throws Exception
	   {
	   	//Emp e=new Emp();
	   	FileInputStream fis = new FileInputStream("op.obj");
	   	ObjectInputStream ois = new ObjectInputStream(fis);

	     Emp e=(Emp)ois.readObject();	    
	     System.out.println(e.name);
	     System.out.println(e.id);
	   }

}
 class Emp implements Serializable
 {
 	   int id=100;
 	   String name ="bablu";
 }*/

/*import java.io.*;
class Test
{
	  public static void main(String [] args)throws Exception
	   {
	   	 Emp e=new Emp();
	   	FileOutputStream fos = new FileOutputStream("op.obj");
	   	ObjectOutputStream oos = new ObjectOutputStream(fos);
	   	oos.writeObject(e);
	
	  /* FileInputStream fis = new FileInputStream("op.obj");
	   	ObjectInputStream ois = new ObjectInputStream(fis);

	     Emp e=(Emp)ois.readObject(); */ 
	    /* System.out.println(e.name);
	     System.out.println(e.id);
	     System.out.println(e.d.name);
	      System.out.println(e.d.l.name);
	      
	     
	   }

}
 class Emp implements Serializable
 {
 	   transient int id=100;
 	   String name ="bablu";
 	   Dog d=new Dog();
 }

 class Dog implements Serializable
 {
 	 String name="tomy";
 	 Lion l=new Lion();

 }
 class Lion implements Serializable
 {
 	String name="tudu";
 }*/

 
class F2UnionF1
{
	 public Boolean belongs(String s,String file)throws Exception
	 {
	 	FileReader rd = new FileReader(file);
	 	BufferedReader br = new BufferedReader(rd);
	 	String str;
	 	while((str=br.readLine())!=null)
	 	{
	 		 if(s.hashcode()==str.hashcode())
	 		 {
	 		 	return true;
	 		 }
	 	}
	 	return false;
	 }

	 public static void main(String[] args)throws Exception
	 {
	   F2UnionF1 t = new F2UnionF1();
	   File f = new File("output.txt");
	   if(!f.exists())
	   	f.creatnewFile();
	   rintfStream ps = new printStream(f);
	   FileReader fr = new FileReader ("f2.txt");
	   Bufferedreader br = new Bufferedreader(fr);
	   String s = null;
	   while((s=br.readLine())!=null)
	   {
	   	if(t.belongsTo(s,"f1.txt"))
	   
	   		ps.println(s);
	   	}
	   }
	   ps.close();

	 }
}
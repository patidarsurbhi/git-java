import java.lang.reflect.*;
import java.util.*;
class Test

{
	public static void main(String[] args) {
		
		/*Class c=ArrayList.class;
		Constructor [] c1=c.getConstructors();
		int count=0;
		for(Constructor con:c1)
		{
			count++;
			System.out.println(con+"-> "+con.getParameterCount());
		}
		System.out.println("total->"+count);*/

		/*Class m=ArrayList.class;
		Method [] m1=m.getDeclaredMethods();
		//int count=0;
		for(Method con :m1)
		{
			count++;
			System.out.println(con+"->"+con.getParameterCount());
		}
		System.out.println("total->"+count);*/

		/*Class f=ArrayList.class;
		Field [] f1=f. getDeclaredFields();
		int count=0;
		for(Field con:f1)
		{
			count++;
			System.out.println(con.getName());
		}
		System.out.println("total->"+count);*/

		Class i = ArrayList.class;
		Class [] i1=i.getDeclaredClasses();
		int count=0;
		for(Class con:i1)
		{
			count++;
			System.out.println(con.getName());
		}
		System.out.println("total->"+count);



	}
}
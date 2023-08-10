/*import java.util.*;
class Test
{
	  public static void main(String[] args) {
	  	HashMap t= new HashMap();
	  	t.put(100,"aaa");
	  	t.put(101,"bbb");
	  	t.put(102,"ccc");
	  	t.put(103,"ddd");
	  	System.out.println(s);
	  	
	  }
piiiiiii
}*/

/*import java.util.Queue;
import java.util.LinkedList;
class Test
{
	 public static void main(String[] args) {
	 	Queue<Integer> Number = new LinkedList<>();
	 	Number.offer(1);
	 	Number.offer(2);
	 	Number.offer(3);
	 	Number.offer(4);
	 	System.out.println(Number);
	 	int removeNumber = Number.poll();
	 	System.out.println(removeNumber);
	 }
}*/

import java.util.*;
import java.util.LinkedList;
class Test
{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q);
		//System.out.println("ELEMENT REMOVE FROM THE QUEUE"+q.remove());
		//System.out.println(q);
		//System.out.println("HEAD OF THE QUEUE"   +q.element());
		//System.out.println(q);
		System.out.println("poll():RETURN HEAD OF THE QUEUE" +q.poll());
		//System.out.println(q);
		System.out.println("PEEK():HEAD OF THE QUEUE:"+q.peek());
		System.out.println(q);
	}
}














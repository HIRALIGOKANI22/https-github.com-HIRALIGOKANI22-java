//Queue
import java.util.*;
class P11
{
	public static void main(String args[])
	{
		Queue q1 = new LinkedList();
		q1.add("One");
		q1.add("Two");
		q1.add(3);
		q1.add(4);
		
		System.out.println(q1);
		
		// remove element when not specify any value to remove first element otherwise remove specific element
		
		q1.remove("Two");
		System.out.println(q1);
		
	}
}

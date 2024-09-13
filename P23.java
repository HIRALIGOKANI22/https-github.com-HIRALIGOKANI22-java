//Example of list
import java.util.*;
class P23
{
	public static void main(String args[])
	{
		List<String> l1 = new ArrayList<>();
		l1.add("One");
		l1.add("Two");
		l1.add("Three");

		System.out.println("List Collection:"+l1);
	
		// list item using loop
		for(String s1 : l1)
		{
			System.out.println("List Item:"+s1);
		}
	}
}

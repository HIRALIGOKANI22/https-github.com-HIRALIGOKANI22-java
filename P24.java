//Example of integr list 
import java.util.*;
class P24
{
	public static void main(String args[])
	{
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);

		System.out.println("List Collection:"+l1);
	
		// list item using loop
		for(Integer i1 : l1)
		{
			System.out.println("List Item:"+i1);
		}
	}
}

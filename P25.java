//Example of sorting list 
import java.util.*;
class P25
{
	public static void main(String args[])
	{
		List<Integer> l1 = new ArrayList<>();
		l1.add(13);
		l1.add(22);
		l1.add(3);

		System.out.println("Original List:"+l1);
		Collections.sort(l1);

		// list item using loop
		for(int i1 : l1)
		{
			System.out.println("List Item:"+i1);
		}
	}
}

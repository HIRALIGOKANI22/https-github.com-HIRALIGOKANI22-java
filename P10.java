//Vector
import java.util.*;
class P10
{
	public static void main(String args[])
	{
		Vector v1 = new Vector();
		v1.add("One");
		v1.add("Two");
		v1.add(3);
		v1.add(4);
		
		// Acess individual element using index 
		System.out.println("First Element:"+v1.get(0));
		System.out.println(v1);

		// using loop
		for(int i=0;i<v1.size();i++)
		{
			System.out.println("Vector Element:"+v1.get(i));
		}
		
		// remove element
		v1.remove("Two");
		System.out.println(v1);
		v1.add(2,"Seven");
		System.out.println(v1);
	}
}

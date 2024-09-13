//while loop with Jumping statemnt
class P8
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		int no = Integer.parseInt(System.console().readLine());
		int i=1;
		while(i<=no)
		{
			if(i%2 == 0)
			{
				//break;
				i++;
				continue;

			}
			System.out.println("Value is:"+i++);
		}		
		System.out.println("Break / continue After Loop:");
	}
}

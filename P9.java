//do while loop with Jumping statemnt
class P9
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		int no = Integer.parseInt(System.console().readLine());
		int i=1;
		do
		{
			if(i%2 == 0)
			{
				//break;
				i++;
				continue;
			}
			System.out.println("Value is:"+i++);
		}while(i<=no);		
		System.out.println("Break / continue After Loop:");
	}
}

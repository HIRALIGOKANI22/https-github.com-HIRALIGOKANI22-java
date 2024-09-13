//for loop with Jumping statemnt
class P7
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		int no = Integer.parseInt(System.console().readLine());
		for(int i=1;i<=no;i++)
		{
			if(i%2 == 0)
			{
				//break;
				continue;
			}
			System.out.println("Value is:"+i);
		}		
		System.out.println("Break / continue After Loop:");
	}
}

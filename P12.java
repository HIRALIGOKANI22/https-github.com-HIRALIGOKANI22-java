//Looping statemnt - while
class P12
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		int no = Integer.parseInt(System.console().readLine());
		
		int i=1;
		while(i<=no)
		{
			System.out.println("Value is:"+i);
			i++;
		}		
	}
}

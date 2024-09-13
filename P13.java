//Looping statemnt - do while
class P13
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		int no = Integer.parseInt(System.console().readLine());
		
		int i=1;
		do
		{
			System.out.println("Value is:"+i);
			i++;
		}while(i<=no);	
	}
}

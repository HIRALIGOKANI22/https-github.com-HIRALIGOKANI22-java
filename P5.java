// check no is odd or even 
class P5
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		int no = Integer.parseInt(System.console().readLine());
		if(no %2 == 0)
		{
			System.out.printf("\n%d Number is Even",no);
		}
		else
		{
			System.out.printf("\n%d Number is Odd",no);
		}
	}
}

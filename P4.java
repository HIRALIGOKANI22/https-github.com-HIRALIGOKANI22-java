class P4
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		int no = Integer.parseInt(System.console().readLine());
		if(no > 0)
		{
			System.out.printf("\n%d Number is Positive",no);
		}
		else if(no < 0)
		{
			System.out.printf("\n%d Number is Negative",no);
		}
		else
		{
			System.out.printf("\n%d Number is Zero",no);
		}
	}
}

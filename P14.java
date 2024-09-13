//find factorial using class and object
class P14
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		int no = Integer.parseInt(System.console().readLine());
		
		factpro f1 = new factpro();
		f1.factorial(no);
	}
}
class factpro{
	public static void factorial(int no)
	{
		int i,fact=1;
		for(i=1;i<=no;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial is:"+fact);
	}
}

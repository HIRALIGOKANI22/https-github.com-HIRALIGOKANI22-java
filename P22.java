//Static method and nesting of method
class P22
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		a1.output();
	}
}
class Abc
{
	int a;
	static int b;
	Abc()
	{
		a=10;
		b=20;
	}
	void output()
	{
		System.out.println("Non-static method here...");
		System.out.println("Value of A is:"+a);
		System.out.println("Value of B is:"+b);

		disp();
	}
	static void disp()
	{
		System.out.println("Static method here...");
		System.out.println("Value of B is:"+b);
	}
}

// Method overloading 
class P17
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		a1.disp();
		a1.disp("hiral");
	}
}
class Abc
{
	public void disp()
	{
		System.out.println("Hello");
	}
	public void disp(String nm)
	{
		System.out.println("Hello: "+nm);
	}
}

//input through one object display using another object
class P20
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		Abc a2 = new Abc();

		a1.input();
		a2.output();
	}
}
class Abc
{
	static int no;
	void input()
	{
		no++;
	}
	void output()
	{
		System.out.println("No is:"+no);
	}
}

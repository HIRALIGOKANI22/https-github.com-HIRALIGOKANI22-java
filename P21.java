//count how many object created
class P21
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		Abc a2 = new Abc();
		a2.output();
	}
}
class Abc
{
	static int no;
	Abc()
	{
		no++;
	}
	void output()
	{
		System.out.println(no);
	}
}

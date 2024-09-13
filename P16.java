// Constructor
class P16
{
	public static void main(String args[])
	{
		Abc a1 = new Abc();
		Abc a2 = new Abc("Hiral");
	}
}
class Abc
{
	// non - prametrize or default constuctor
	public Abc()
	{
		System.out.println("Class Abc Constuctor...");
	}

	//prametrize constuctor
	public Abc(String nm)
	{
		System.out.println("Class Abc Constuctor..." + nm);
	}
}

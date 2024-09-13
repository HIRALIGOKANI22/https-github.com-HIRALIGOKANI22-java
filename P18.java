// simple intrest using Constructor
class P18
{
	public static void main(String args[])
	{
		Intrest i1 = new Intrest();
		i1.calculate();
	}
}
class Intrest
{
	double p,r,n,si;
	
	// default constructor
	Intrest()
	{
		p = 5000;
		r = 10;
		n = 5;
	}

	// Parameterize constructor
	Intrest(double p1,double r1,double n1)
	{
		p = p1;
		r = r1;
		n = n1;
	}
	void calculate()
	{
		si = p*r*n/100;
		System.out.println("Simple Intrest is:"+si);
	}
}

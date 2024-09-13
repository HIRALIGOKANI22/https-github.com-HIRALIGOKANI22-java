//Sum Using Method Overload
class P19
{
	public static void main(String args[])
	{
		int a=10,b=20;
		double c=30.33,d=22.34;

		Total t1 = new Total();
		t1.sum(a,b);
		t1.sum(c,d);
		t1.sum(a,c);
		t1.sum(b,d);
	}
}
class Total
{
	void sum(int a,int b)
	{
		int c = a + b;
		System.out.println("Total is:"+c);
	}
	void sum(double a,double b)
	{
		double c = a + b;
		System.out.println("Total is:"+c);
	}
	void sum(double a,int b)
	{
		double c = a + b;
		System.out.println("Total is:"+c);
	}
	void sum(int a,double b)
	{
		double c = a + b;
		System.out.println("Total is:"+c);
	}
}

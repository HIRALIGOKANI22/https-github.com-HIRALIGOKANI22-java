//input using cla and check no is prime or not
class P15
{
	public static void main(String args[])
	{
		int flag=0,i,j;
		int no[]=new int[args.length];
		
		for(i=0;i<args.length;i++)
		{
			no[i] = Integer.parseInt(args[i]);
			for(j=2;j<no[i]/2;j++)
			{
				if(no[i]%j == 0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("Not Prime...");		
			}
			else
			{
				System.out.println("Prime...");		
			}
		}
	}
}

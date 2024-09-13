// input using Buffer Reader
import java.io.*;
class P2
{
	public static void main(String args[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.print("Enter Your Name:");
			String nm = br.readLine();
			System.out.println("Welcome:"+nm);
		}	
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}
}

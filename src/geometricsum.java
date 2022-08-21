public class geometricsum
{
	public static void main(String args[])
	{
		int n=4;
	double s=sum(n);
		System.out.println(s);
	}
	public static double sum(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return 1/Math.pow(2, n)+sum(n-1);	
	}
}

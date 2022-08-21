
public class poweron {
	public static void main(String args[])
	{
		int n=3,x=4;
		int z=power(n,x);
		System.out.println(z);
	}
	public static int power(int n,int x)
	{
		if(x==1)
		{
			return n;
		}
		return n*power(n,x-1);
	}

}

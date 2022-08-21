public class factorial {

	public static void main(String args[]) {
		int n=1;
		int t=fact(n);
		System.out.println(t);
	}
	public static int fact(int n)
	{
		if(n==1)
		{
			return n;
		}
		return n*fact(n-1);
	}

}

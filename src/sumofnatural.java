
public class sumofnatural {

	public static void main(String[] args) {
		int n=10;
		int s=sum(n);
		System.out.println(s);
	}
	public static int sum(int n)
	{
		if(n==0)
		{
			return n;
		}
		return n+sum(n-1);
	}
}

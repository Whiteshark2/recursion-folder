public class Countzero {
	public static void main(String[] args)
	{
		int n=100203;
		int t=count(n);
		System.out.println(t);
	}
	public static int count(int n)
	{
		if(n<10)
		{
	return 0;
		}
		if(n%10==0)
		{
			return count(n/10)+1;
		}
		else 
		return count(n/10);
	}

}

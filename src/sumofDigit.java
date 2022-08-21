
public class sumofDigit {

	public static void main(String[] args) {
		int n=3554;
		int t=sum(n);
		System.out.println(t);
	}
	public static int sum(int n)
	{
		if(n==0)
		{
			return n;
		}
		return sum(n/10)+n%10;
	}

}

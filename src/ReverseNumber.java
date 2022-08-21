
public class ReverseNumber {

	public static void main(String[] args) {
		int n =897;
		int ans = Reverse(n);
		System.out.println(ans);

	}
	public static int Reverse(int n)
	{
		int rev=0;
		if(n==0) {
			return n;
		}
		return rev*10+Reverse(n/10);
}
}

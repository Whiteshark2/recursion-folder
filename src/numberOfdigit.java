
public class numberOfdigit {

	public static void main(String[] args) {
		int n=0;
		int x=count(n);
		System.out.println(x);
	}
	public static int count(int n)
	{
	if(n==0)
	{
		return 0;
	}
	int small=count(n/10)+1;
	return small;
	}

}

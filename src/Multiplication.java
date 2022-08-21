
public class Multiplication {

	public static void main(String[] args) {
		int n=3,m=6;
		int t=multi(n,m);
		System.out.println(t);
	}
	public static int multi(int n,int m)
	{
		if(m==0)
		{
			return 0;
		}
		return multi(n,m-1)+n;
	}

}

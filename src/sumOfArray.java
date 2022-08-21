
public class sumOfArray {

	public static void main(String[] args) {
		int a[]= {2};
		int t=a.length;
		int d=sum(a,t);
		System.out.println(d);
	}
	public static int sum(int a[],int x)
	{
		if(x==0)
		{
			return 0;
		}
		return a[x-1]+sum(a,x-1);
}
}

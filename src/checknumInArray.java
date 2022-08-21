
public class checknumInArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,2,8,0,6,4};
		int x=6;
		int k=a.length;
		int t1=check1(a,x,k);
		System.out.println(t1);
		//int t=check(a,x,0);
		//System.out.println(t);
	}
	/*public static int check(int a[],int x,int start)
	{
		if(start==a.length)
		{
			return -1;
		}
		if(a[start]==x)
		{
			return start;
		}
		return check(a,x,start+1);
	}*/
	public static int check1(int a[],int x,int end)
	{
		if(end-1==0)
		{
			return -1;
		}
		if(a[end-1]==x)
		{
			return end-1;
		}
		return check1(a,x,end-1);
	}

}

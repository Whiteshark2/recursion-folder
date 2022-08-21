
public class lastIndexofnum {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,7,9,1,7,2,9,7,9};
		int c=a.length;
		int k=2;
		int b=find(a,k,c);
		System.out.println(b);
	}
	public static int find(int a[],int x,int end)
{
		if(end==0)
		{
			return -1;
		}
		if(a[end-1]==x)
		{
			return end-1;
		}
		return find(a,x,end-1);
}
}
	
public class subtraction {
public static void main(String args[])
{
	int n=34,m=16;
	int t=sub(n,m);
	System.out.println(t);
}
public static int sub(int n,int m)
{
	if(m==0)
	{
		return n;
	}
	return sub(n,m-1)-1;
}
}

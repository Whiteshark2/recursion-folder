
public class Addition {

	public static void main(String[] args) {
int n=34,m=45;
int t=sum(n,m);
System.out.println(t);
	}
	public static int sum(int n,int m)
	{
		if(m==0)
		{
			return n;
		}
		return sum(n,m-1)+1;
	}

}


public class Checksorted {
public static void main(String args[])
{
	int a[]= {4,4,6,8};
	boolean k=check2(a,0);
	System.out.println(k);
	//boolean c=check(a);
	//boolean d=check1(a);
	//System.out.println(d);
	//System.out.println(c);
}
/*public static boolean check(int a[])
{
	if(a.length<=1)
	{
		return true;
	}
	int small[]=new int[a.length-1];
	for(int i=1;i<a.length;i++)
	{
		small[i-1]=a[i];
	}
	boolean ans=check(small);
	if(!ans)
	{
		return false;
	}
	if(a[0]<a[1])
	{
		return true;
	}
	else 
		return false;
} */
/*public static boolean check1(int a[])
{
	if(a.length<=1)
	{
		return true;
	}
	if(a[0]>a[1])
	{
		return false;
	}
	int small[]=new int[a.length-1];
	for(int i=1;i<a.length;i++)
	{
		small[i-1]=a[i];
	}
	return check1(small);
}*/
public static boolean check2(int a[],int start)
{
	if(start>=a.length-1)
	{
		return true;
	}
	if(a[start]>a[start+1])
	{
		return false;
	}
	return check2(a,start+1);
}
}
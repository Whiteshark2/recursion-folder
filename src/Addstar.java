
public class Addstar {

	public static void main(String[] args) {
		String s="aaaa";
		String ans=Add(s);
		System.out.println(ans);

	}
	public static String Add(String s)
	{
		if(s.length()<=1)
		{
			return s;
		}
		String ans="";
		if(s.charAt(0)==s.charAt(1))
		{
			ans=s.charAt(0)+"*";
		}
		else
		{
			ans=ans+s.charAt(0);
		}
		return ans+Add(s.substring(1));
	}

}

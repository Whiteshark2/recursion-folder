public class ReplacePi {
	public static void main(String[] args) {
		String s="ipxpixpi";
		String t=Replace(s);
		System.out.println(t);
	}
	public static String Replace(String s)
	{
		if(s.length()==1)
		{
			return s;
		}
		String ans="";
		if(s.charAt(0)=='p' && s.length()>1 && s.charAt(1)=='i' )
		{
			ans=ans+"3.14";
			return ans+Replace(s.substring(2,s.length()));
		}
			ans=ans+s.charAt(0);
		return ans+s.charAt(1)+Replace(s.substring(1,s.length()));
	}
}
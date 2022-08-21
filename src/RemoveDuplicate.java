
public class RemoveDuplicate {
	public static void main(String[] args) {
		String s ="aaabbcccqqq44ddsera";
		String ans = RemoveDup(s);
		System.out.println(ans);
	

	}
	public static String RemoveDup(String s)
	{
		if(s.length()<=1)
		{
			return s;
		}
		if(s.charAt(0)==s.charAt(1))
		{
			return RemoveDup(s.substring(1));
		}
		else
		{
			return s.charAt(0)+RemoveDup(s.substring(1));
		}
	}
}
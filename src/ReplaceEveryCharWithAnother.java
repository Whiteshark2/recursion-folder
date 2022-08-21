public class ReplaceEveryCharWithAnother {

	public static void main(String[] args) {
		String s ="abcd  cbaaaba";
		char a = 'a',x='x';
		String ans = Remove(s,a,x);
		System.out.println(ans);

	}
	public static String Remove(String s,char a,char x)
	{
		if(s.length()==0)
		{
			return s;
		}
		String ans ="";
		if(s.charAt(0)==a) {
			ans = ans+'x';
		}
		else
		{
			ans = ans+s.charAt(0);
	}
		return ans+Remove(s.substring(1),a,x);
	}
}

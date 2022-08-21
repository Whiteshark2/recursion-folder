
public class RemoveX {

	public static void main(String[] args) {
		String s="xefxfxffss";
		System.out.println(remove(s));

	}
	public static String remove(String s)
	{
		if(s.length()==0)
		{
			return s;
		}
		String ans="";
		if(s.charAt(0)!='x')
		{
			ans=ans+s.charAt(0);
		}
		return ans+remove(s.substring(1));
		
	}
	

}

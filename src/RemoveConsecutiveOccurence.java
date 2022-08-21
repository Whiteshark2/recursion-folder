public class RemoveConsecutiveOccurence {
	public static void main(String[] args)
	{
		String s="aaaaabbbbcdddddaaaeriehriereirur";
		
		System.out.println(remove(s));
	}
	public static String remove(String s)
	{
		
		if(s.length()==1)
		{
			return s;
		}
		String ans="";
		if(s.charAt(0)!=s.charAt(1))
		{
			ans=ans+s.charAt(0);
		}
		return ans+remove(s.substring(1));
	}

}

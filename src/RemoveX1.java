public class RemoveX1 
{
	public static void main(String args[])
	{
		String s="xbxe";
		String t=Remove(s);
		System.out.println(t);
	}
	public static String Remove(String s)
	{
		if(s.length()==0)
		{
			return s;
		}
		if(s.charAt(0)=='x')
		{
			return Remove(s.substring(1));
		}
		return s.charAt(0)+Remove(s.substring(1));
	}
}
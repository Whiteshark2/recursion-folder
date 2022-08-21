
public class Subsequence {

	public static void main(String[] args) {
		String s="abcd";
		String ans[]=sequence(s);
		for(int i =0;i<ans.length;i++)
		{
			System.out.println(ans[i]+" ");
		}
	}
	public static String[] sequence(String s)
	{
		if(s.length()==0)
		{
			String ans[]= {""};
			return ans;
		}
		String smallans[]=sequence(s.substring(1));
		String ans[]=new String[2*smallans.length];
		
		for(int i =0;i<smallans.length;i++)
		{
			ans[i+smallans.length]=s.charAt(0)+smallans[i];
		}
		for(int i =0;i<smallans.length;i++)
		{
			ans[i]=smallans[i];
		}
		
				
		
		return ans;
		}
		
	}
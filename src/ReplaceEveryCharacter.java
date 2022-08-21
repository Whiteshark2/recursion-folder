public class ReplaceEveryCharacter {
public static void main(String[] args) {
	String s="abcabc";
	char c1='a';
	char c2='z';
	System.out.println(replace(s,c1,c2));
	}
public static String replace(String s,char c1,char c2)
{
	if(s.length()==0)
	{
		return s;
	}
	String ans="";
	if(s.charAt(0)==c1)
	{
		ans=ans+c2;
	}
	else if(s.charAt(0)!=c1)
	{
		ans=ans+s.charAt(0);
	}
	return ans+replace(s.substring(1),c1,c2);
	
}

}

/*Q4 Reverse the given String */

class ReverseStringQ4
{
	static String reverse(String s)
	{
		int i;
		String s1="";
		for(i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		return s1;
	}
	
	public static void main(String[] args)
	{
		String str= new String("Reverse String");
		System.out.println("Given String: "+str);
		System.out.println("Reverse of Given String: "+reverse(str));
	}
}
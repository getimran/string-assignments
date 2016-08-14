/*Q6 Left Trim */

class LeftTrimQ6
{
	static String lTrim(String s)
	{
		int i=0;
		while(i<s.length() && s.charAt(i)==' ')
		{
			i++;
		}
		
		return s.substring(i);
	}
	
	public static void main(String[] args)
	{
		String str="       Hello What's up!       .";
		System.out.println("Given String:"+str);
		System.out.println("Left trimmed:"+lTrim(str));
	}
}
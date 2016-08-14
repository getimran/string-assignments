/*Q7 Right Trim */

class RightTrimQ7
{
	static String rTrim(String s)
	{
		int i=s.length()-1;
		while(i>=0 && s.charAt(i)==' ')
		{
			i--;
		}
		
		return s.substring(0,i+1);
	}
	
	public static void main(String[] args)
	{
		String str="       Hello What's up       ";
		System.out.println("Given String:"+str);
		System.out.println("Right trimmed:"+rTrim(str));
	}
}
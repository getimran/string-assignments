/*Q8 All Trim- Equivalent to trim method */

class AllTrimQ8
{
	static String allTrim(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<s.length() && s.charAt(i)==' ')
		{
			i++;
		}
		while(j>=0 && s.charAt(j)==' ')
		{
			j--;
		}
		
		return s.substring(i,j+1);
	}
	
	public static void main(String[] args)
	{
		String str="       Hello What's up       ";
		System.out.println("Given String:"+str);
		System.out.println("All trimmed:"+allTrim(str));
	}
}
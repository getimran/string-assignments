/*Q3 Character Count excluding Spaces */

class CharCountQ3
{
	static int charCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		
		return (s.length()-count);
	}
	
	public static void main(String[] args)
	{
		String str= new String("Count number of characters excluding spaces");
		int c= charCount(str);
		System.out.println("Given String: "+str);
		System.out.println("Number of space: "+c);
	}
}
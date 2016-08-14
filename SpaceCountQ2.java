/*Q2 Space Count */

class SpaceCountQ2
{
	static int spaceCount(String s)
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
		
		return count;
	}
	
	public static void main(String[] args)
	{
		String str= new String("Program to count number of spaces in a string.");
		int c= spaceCount(str);
		System.out.println("Given String: "+str);
		System.out.println("Number of space: "+c);
	}
}
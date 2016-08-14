/*Q1 Word Count */

class WordCountQ1
{
	static int wordCount(String s)
	{
		int count=0;
		String splited[]= s.split(" ");
		for(int i=0;i<splited.length;i++)
		{
			System.out.println(splited[i]);
			count++;
		}
		/*for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}*/
		
		return count;
	}
	
	public static void main(String[] args)
	{
		String str= new String("Program to       count    number of words     in a      string.");
		int c= wordCount(str);
		System.out.println("Given String: "+str);
		System.out.println("Number of Words: "+c);
	}
}
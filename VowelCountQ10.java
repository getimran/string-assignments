/*Q10 count vowels */

class VowelCountQ10
{
	static int vowelCount(String s)
	{
		int i,count=0;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		String str="vowels count";
		System.out.println("Given String: "+str);
		System.out.println("Number of vowels: "+vowelCount(str));
	}
}
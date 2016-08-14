/*Q33 Count number of digits in a String */

class CountDigitQ33
{
	static int countDigitInString(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9')
			{
				count++;
			}
		}
			return count;
	}
	
	public static void main(String[] args)
	{
		String str[]={"Coun7 D1g17 1n 7h1s p4o9ram", "Count Digit in this program"};
		for(int i=0;i<str.length;i++)
		{
			System.out.println("Given String"+(i+1)+": "+str[i]);
			System.out.println("Number of digits in String"+(i+1)+": "+countDigitInString(str[i]));
		}
	}
}
			

/*Q32 Find digit in a String */

class FindDigitQ32
{
	static boolean findDigitInString(String s)
	{
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9')
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		String str[]={"Find Digit in this program", "Find Digit 6 in this program"};
		for(int i=0;i<str.length;i++)
		{
			System.out.println("Given String"+(i+1)+": "+str[i]);
			if(findDigitInString(str[i]))
				System.out.println("Digit found in the given String!");
			else
				System.out.println("Digit isn't found in the given String!");
		}
	}
}
			

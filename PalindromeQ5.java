/*Q5 Check if the string is palindrome or not. example: madam, radar, wow, dad etc */

class PalindromeQ5
{
	static boolean palindrome(String s)
	{
		int i;
		String s1="";
		for(i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
			return true;
		else
			return false;
	}
			
	public static void main(String[] args)
	{
		String str1= new String("work");
		System.out.println("Given String 1: "+str1);
		if(palindrome(str1))
			System.out.println("Given String is Palindrome!");
		else
			System.out.println("Given String is not a Palindrome!");
			
		String str2=new String("radar");
		System.out.println("Given String 1: "+str2);
		if(palindrome(str2))
			System.out.println("Given String is Palindrome!");
		else
			System.out.println("Given String is not a Palindrome!");
	}
}
/*Q11 Length- number of characters in a string without length() method */

class LengthQ11
{
	static int length(String s)
	{
		s+= '\0';
		int c=0;
		for(int i=0;s.charAt(i)!='\0';i++)
		{
			c++;
		}
		return c;
	}
	
	public static void main(String[] args)
	{
		String str="find below number of characters in a string";
		System.out.println("Given String: "+str);
		System.out.println("Length without length() method: "+length(str));
		System.out.println("Length with length() method: "+str.length());
	}
}
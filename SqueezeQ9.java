/*Q9 Squeeze- remove all the spaces and convert all whole string as a single word */

class SqueezeQ9
{
	static String squeeze(String s)
	{
		int i;
		String result="";
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				result+=s.charAt(i);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		String str="Squeeze- Remove All Spaces between the words";
		System.out.println("Given String: "+str);
		System.out.println("Squeezed String: "+squeeze(str));
	}
}
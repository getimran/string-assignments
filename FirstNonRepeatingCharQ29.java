/*Q29 First non-repeating character */

class FirstNonRepeatingCharQ29
{
	static void firstNonRepeatingChar(String s)
	{
		String temp="";
		int i,j,k;
		
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int proceed=1,flag=0;
			for(k=0;k<temp.length();k++)
			{
				if(c==temp.charAt(k))
				{
					proceed=0;
					break;
				}
			}
			if(proceed==1)
			{
				for(j=i+1;j<s.length();j++)
				{
					if(c==s.charAt(j))
					{
						flag=1;
						temp+=c;
						break;
					}
				}
					if(flag==0)
					{
						System.out.println("First Non-Repeating Character: "+c);
						break;
					}
				
			}
		}
	}
	
	public static void main(String[] args)
	{
		String str="nniitiiienn";
		System.out.println("Given String: "+str);
		firstNonRepeatingChar(str);
	}
}
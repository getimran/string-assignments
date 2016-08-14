/*Q13 frequency count */

class FrequencyCountQ13
{
	static void frequencyCount(String s)
	{
		String temp="";
		int i,j,k;
		System.out.println("character"+"      "+"Frequency");
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int flag=0,count=0;
			for(k=0;k<temp.length();k++)
			{
				if(c==temp.charAt(k))
				{
					flag=1;
				}
			}
			if(flag!=1)
			{
				for(j=0;j<s.length();j++)
				{
					if(c==s.charAt(j))
					{
						count++;
					}
				}
				temp+=c;
				System.out.println(c+"              "+count);
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		String str="nniittttiiiinn";
		System.out.println("Given String: "+str);
		frequencyCount(str);
	}
}
			
		
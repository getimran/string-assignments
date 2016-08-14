/*Q15 Single Occurrence */

class SingleOccurrenceQ15
{
	static String singleOccurrence(String s)
	{
		String result=" ";
		int i,j,flag;
		for(i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			flag=0;
			int lastindex= result.length()-1;
				if(c==result.charAt(lastindex))
				{
					flag=1;
				}
			
			if(flag!=1)
			result+=c;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		String str="nniittttiiiinnn";
		System.out.println("Given String: "+str);
		System.out.println("Single Occurrence: "+singleOccurrence(str));
	}
}
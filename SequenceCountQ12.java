/* Q12 sequence count */

class SequenceCountQ12
{
	static void sequenceCount(String s)
	{
		String a=" ";
		System.out.println("character"+"      "+"SequenceFrequency");
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			int index= a.length()-1;
			//System.out.println(index);
			char aLetters=a.charAt(index);
			if(aLetters!=c)
			{
				if(i!=s.length()-1)
				{
					int count=1;
					int j=i+1;
					while(c==s.charAt(j))
					{
						count++;
						if(j<s.length()-1)
						j++;
						else 
						break;
					}
					System.out.println(c+"              "+count);
					a+=c;
				}
				else
					System.out.println(c+"              "+1);
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		String str="niitttiiiinnnnn";
		System.out.println("Given String: "+str);
		sequenceCount(str);
	}
}
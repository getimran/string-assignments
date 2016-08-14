/*Q26 Word Frequency Count */

class WordFrequencyCountQ26
{
	static void wordFrequencyCount(String s)
	{
		String splited[]= s.split(" ");
		String temp[]=new String[splited.length];
		int l=0;
		System.out.println("Word            Frequency");
		for(int i=0;i<splited.length;i++)
		{
			int count=0;
			for(int j=0;j<splited.length;j++)
			{
				if(splited[i].equals(splited[j]))
				{
					count++;
				}
			}
			int flag=0;
			for(int k=0;k<temp.length;k++)
			{
				if(splited[i].equals(temp[k]))
				{
					flag=1;
					break;
				}
			}	
			if(flag==0)
			{
				System.out.println(splited[i]+"------------->"+count);
				temp[l++]= splited[i];
			}
				
		}
	}
	
	public static void main(String[] args)
	{
		String str= new String("This program program counts the the the the number of of of occurrence of each each word in in in in in a a given String");
		System.out.println("Given String: "+str);
		wordFrequencyCount(str);
	}
}
			
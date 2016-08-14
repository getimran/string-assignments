/*Q17 Sort Words */

class SortWordsQ17
{
	static String sortWords(String s)
	{
		String temp;
		String splited[]= s.split(" ");
		for(int i=0;i<splited.length;i++)
		{
			for(int j=0;j<splited.length;j++)
			{
				if(splited[i].compareTo(splited[j])<0)
				{
					temp=splited[i];
					splited[i]=splited[j];
					splited[j]=temp;
				}
			}
		}
		
		String result="";
		for(int i=0;i<splited.length;i++)
		{
			result+=splited[i]+" ";
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		String str="program to sort a given string";
		System.out.println("Given String: "+str);
		System.out.print("Sorted Words: "+sortWords(str));
	}
}
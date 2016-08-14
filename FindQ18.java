/*Q18 program to find second string in first */

class FindQ18
{
	static boolean find(String s1, String s2)
	{
		int flag=0;
		String splited[]= s1.split(" ");
		for(int i=0;i<splited.length;i++)
		{
			flag=0;
			if(splited[i].equals(s2))
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
		String str1="program to find string2 in string1";
		String str2="find";
		String str3="ok";
		System.out.println("Given String1: "+str1);
		System.out.println("Given String2: "+str2);
		System.out.println("Given String3: "+str3);
		System.out.println();
		boolean result= find(str1,str2);
		System.out.println("Is String2 in String1?: "+result);
		result= find(str1,str3);
		System.out.println("Is String3 in String1?: "+result);
	}
}
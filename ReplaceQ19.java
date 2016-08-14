/*Q19 program to find second string in first and replace that string with third string */

class ReplaceQ19
{
	static String replace(String s1, String s2,String s3)
	{
		String splited[]= s1.split(" ");
		for(int i=0;i<splited.length;i++)
		{
			if(splited[i].equals(s2))
			{
				splited[i]=s3;
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
		String str1="yes sad you made me sad";
		String str2="sad";
		String str3="happy";
		System.out.println("Given String1: "+str1);
		System.out.println("Given String2: "+str2);
		System.out.println("Given String3: "+str3);
		System.out.println();
		System.out.println("String after replacing String2 with String3 in String1: "+replace(str1,str2,str3));
	}
}
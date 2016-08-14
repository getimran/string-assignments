/*Q25 Compare two strings- similar to compareTo() method */

class CompareQ25
{
	static int compare(String s1,String s2)
	{
		byte b1[]= s1.getBytes();
		byte b2[]= s2.getBytes();
		
		int j=0,result=0;
		for(int i=0;i<b1.length;i++)
		{
			result=b1[i]-b2[j];
			if(result!=0)
				break;
			else
			j++;
		}
		
		return result;
	}

	public static void main(String[] s)
	{
		String s1="ducat";
		String s2="ducat";
		String s3="duert";
		int result= compare(s1,s2);
		System.out.println(result);
		result= compare(s3,s1);
		System.out.println(result);
		
	}
}
	
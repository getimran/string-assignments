/*Q20 Check if two strings are equal or not- similar to equals() method */

class EqualsQ20
{
	static boolean equals(String s1,String s2)
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
		
		if(result==0)
			return true;
		else 
			return false;
	}

	public static void main(String[] s)
	{
		String s1="Strings are immutable";
		String s2="Strings are immutable";
		String s3="StringBuffers are mutable";
		System.out.println("Given String1: "+s1);
		System.out.println("Given String2: "+s2);
		System.out.println("Given String3: "+s3);
		System.out.println();
		boolean result= equals(s1,s2);
		System.out.println("Is String1 is equal to String2?: "+result);
		result= equals(s2,s3);
		System.out.println("Is String2 is equal to String3?: "+result);
		result= equals(s3,s1);
		System.out.println("Is String3 is equal to String1?: "+result);
	}
}
	
/*Q30 Reverse Each word */

class ReverseEachWordQ30
{
	
	static void reverseEachWord(String s)
	{
		String splited[]= s.split(" ");
		String reverse="";
		System.out.print("Reverse each word Result: ");
		for(int i=0;i<splited.length;i++)
		{
			String temp=splited[i];
			for(int j=temp.length()-1;j>=0;j--)
			{
				reverse+=temp.charAt(j);
				
			}
				reverse+=" ";
			
		}
		
		System.out.print(reverse);
	
	}
	
	public static void main(String[] args)
	{
		String str="Reverse Each Word";
		System.out.println("Given String: "+str);
		reverseEachWord(str);
	}
}
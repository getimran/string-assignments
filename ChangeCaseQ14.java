/*Q14 Change Case */

class ChangeCaseQ14
{
	static String changeCase(String s)
	{
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<97)
				b[i]+=32;
			else
				b[i]-=32;
		}
		
		String result= new String(b);
		return result;
	}
	
	public static void main(String[] args)
	{
		String str="IndIA";
		System.out.println("Given String: "+str);
		System.out.println("Changed Case: "+changeCase(str));
	}
}
				
/* Q23 triangle 3 */

class Triangle3Q23
{
	static void triangle3(String s)
	{
		int i,j;
		String space="";
		for(i=0;i<s.length();i++)
		{
			int temp=i;
					while(temp!=0)
					{
						System.out.print(" ");
						temp--;
					}
			for(j=0;j<s.length();j++)
			{
				
				if(i==j || i<j)
				{
						System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		triangle3("ducat");
	}
}
/* Q21 triangle 1 */

class Triangle1Q21
{
	static void triangle1(String s)
	{
		int i,j;
		for(i=0;i<s.length();i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		triangle1("ducat");
	}
}
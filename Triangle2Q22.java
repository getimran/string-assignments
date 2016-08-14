/* Q22 triangle 2 */

class Triangle2Q22
{
	static void triangle2(String s)
	{
		int i,j;
		for(i=s.length()-1;i>=0;i--)
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
		triangle2("ducat");
	}
}
/*Q27 Find the value of expression 10+20+20+20 passed as a string */

class ExpressionQ27
{
	static int expression(String s)
	{
		int sum=0;
		String splited[]= s.split("\\+");
		
		for(int i=0;i<splited.length;i++)
		{
			int toInt= Integer.parseInt(splited[i]);
			sum+=toInt;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		String str="10+20+20+20";
		System.out.println("Passed expression as String: "+str);
		System.out.println("Value of the given expression: "+expression(str));
	}
}
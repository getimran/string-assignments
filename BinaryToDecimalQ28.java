/*Q28 String Binary to Decimal */

class BinaryToDecimalQ28
{
	static int binaryToDecimal(String s)
	{
		int toInt;  //=new int[s.length()];
		int sum=0;
		double exp= s.length()-1;
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			toInt= Character.getNumericValue(c);
			double result= toInt* Math.pow(2, exp);
			sum+=result; 
			exp--;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		String str= new String("10101");
		System.out.println("Given binary in String: "+str);
		System.out.println("Value in Decimal: "+binaryToDecimal(str));
	}
}
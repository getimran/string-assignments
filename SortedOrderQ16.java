/*Q16 Sorted Order */

class SortedOrderQ16
{
	static void sortedOrder(String s)
	{
		byte temp;
		byte b[]= s.getBytes();
		for(int  i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(b[i]<b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		String sortedString= new String(b);
		System.out.println("Sorted String: "+sortedString);
	}
	
	public static void main(String[] args)
	{
		String str="ducat";
		System.out.println("Given String: "+str);
		sortedOrder(str);
	}
}
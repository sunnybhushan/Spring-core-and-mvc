package ArrayProgram;
public class MaxMinValueInArray
{
	public static void main(String[] args) 
	{
		int ar[]= {10,3,53,47,32,23};
		
		int max=ar[0];
		for (int i = 1; i < ar.length; i++)
		{
			if (max<ar[i]) 
			{
				max=ar[i];
			}
		}
		System.out.println("maximum value is "+max);
		
		int min=ar[0];
		for (int i = 1; i < ar.length; i++)
		{
			if (min>ar[i]) 
			{
				min=ar[i];
			}
		}
		System.out.println("minimum value is "+min);
	}
}




package ArrayProgram;

public class CountTheSpecified
{
	/*
	 * static int countOccurence(int ar[], int ele) { int count=0; }
	 */
	
	static int secondBiggest(int ar[])
	{
		int fbig=ar[0], sbig=ar[1];
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>fbig)
			{
				sbig=fbig;
				fbig=ar[i];
			}
		else if(ar[i]>sbig)
		{
			sbig=ar[i];
		}
		}
		return sbig;
		
		
	}
	
	public static void main(String[] args)
	{
		int ar[]= {45,56,75,23};
		
		
	}
	
}





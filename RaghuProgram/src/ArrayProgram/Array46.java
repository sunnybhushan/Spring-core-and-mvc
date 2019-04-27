// define the method to return nth biggest element from the unique element array.
package ArrayProgram;

public class Array46 
{
	public int nTheBiggest(int []ar, int n)
	{
		for (int i = 0; i < ar.length; i++) 
		{
			int count=0;
			for (int j = 0; j < ar.length; j++) 
			{
				if (ar[i]>ar[i])
				
					count++;
				
				if (count==n-1)
					return ar[i];
			}
			
		}
		return ar[i];
	
		
	
	}
	
	
	
	public static void main(String[] args) 
	{
		int ar[]= {12,35,65,89,45};
		Array46 a= new Array46();
		int big=a.nTheBiggest(ar, 4);
		System.out.println(ar+"th biggest number");
		
	}
}

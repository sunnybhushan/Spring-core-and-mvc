
/*Y*/
package Pattern;
public class Pattern7 
{

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n/2;j++)
			{
				/*
				 * if((i==j || i+j==n-1) && i<=n/2 || j==n/2 && j>=n/2 ) System.out.print("*");
				 */
			
				if(j==n/2 || i==0 || i==n/2 || j==n-2 && i<=n/2 || i==j)
				
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
				
			}
			System.out.println();
		}
	}
}
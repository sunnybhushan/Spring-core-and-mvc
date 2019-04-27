/*		1
	   1*2
	  1*2*3
	 1*2*3*4
	1*2*3*4*5
	
		*/

package CoreJava;

public class Pattern9 
{
	public static void main(String[] args) {
		int n=5;
		/*for(int i=1; i<=n; i++)
		{
			for (int j = 1; j <=n-i; j++)
			{
				System.out.print(" ");
			}
			int k=1;
			for (int j = 1; j < 2*i; j++) 
			{
				if (j%2==0) 
				{
				System.out.print("* ");
				}
				else {
					System.out.print(k+++" ");
				}
				
			}*/
//System.out.println(" ");
		//}
	
		for(int i=1; i<=n; i++)
		{
			for (int j = 1; j <=n-i; j++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j < i; j++) 
			{
				System.out.print(j+" ");
				if(j<i)
					System.out.print("* ");
				}
			System.out.println();
				
			}
	
	
	
	}
	
}














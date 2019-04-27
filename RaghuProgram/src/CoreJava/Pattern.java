/*1
2 3
4 5 6
7 8 9 1
2 3 4 5 6
*/
package CoreJava;

public class Pattern 
{
	public static void main(String[] args) 
	{
		int n=5, k=0;
		for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(k%9+1+" ");
				k++;
			}
			System.out.println(" ");
		}
	}
}

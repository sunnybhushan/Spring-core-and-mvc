/*	e
   de
  cde
 bcde
abcde
*/
package CoreJava;

public class Pattern5
{
	public static void main(String[] args) {
		


	int n=5;
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n-i; j++)
		{
			System.out.print(" ");
		}
	for (int j = n-i; j<n ; j++) 
	{
		System.out.print((char)(97+j)+" ");
	}
		System.out.println(" ");
	}
}
}

/*	1
	2 6
	3 7 10
	4 8 11 12
	5 9 12 14 15
	*/
package CoreJava;

public class Pattern8 
{
	public static void main(String[] args) {
	int n=5;
	for(int i=0; i<=n; i++)
	{	
		int k=1;
		for(int j=0; j<=i; j++)
		{
			System.out.print(k+" ");
			k=k+n-j;
		}
				
		System.out.println(" ");
	}
	
	
	}
}

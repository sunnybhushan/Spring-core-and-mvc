package Pattern;

public class Pattern6 
{
public static void main(String[] args) {
	int n=5;
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n;j++)
		{
			if(j>=i && i+j<=n-1 || i+j>=n-1 && j<=i )
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}

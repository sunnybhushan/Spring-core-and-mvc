// wajp to define a method to perform union of two array element.
package ArrayProgram;

public class Array47 
{
	public int[] union(int x[], int y[])
	{
		int un[]= new int[x.length+y.length];
		for (int i = 0; i < x.length; i++) 
		{
			un[i]=x[i];
		}
		int j=x.length;
		for (int i = 0; i < un.length; i++)
		{
			boolean absent=true;
		
		for (int k = 0; k < y.length; k++) 
		{
			if (x[k]==y[i])
			{
				absent=false;
				break;
			}
		}
		if (absent) 
		{
			un[j++]=y[i];
		}
		int union[]= new int[j];
		for (int k = 0; k < union.length; k++) 
		{
			union[i]=un[i];
		
		}
		}
		return union(null,null);
	
	
	}

	public static void main(String[] args) {
		int ar[]= {45,25,35,14,78,69};
		int br[]= {12,35,45,97,76};
		
	}
	
}

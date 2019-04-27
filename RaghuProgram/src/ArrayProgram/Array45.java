// wa method to insert one array element to other array specific index.
package ArrayProgram;

public class Array45 
{

	 int[] insertArr(int x[], int y[], int in)
	{
		if(in<0 || in>x.length)
		{
			System.out.println("Index not in th range");
			return x;
							
		}
	int z[]=new int[x.length+y.length];
	for (int i = 0; i < x.length; i++) 
	{
		if(i<in)
		{
			z[i]=x[i];
		}
		else
		{
			z[i+y.length]=x[i];
		}
	}
	for (int i = 0; i < y.length; i++) 
	{
		z[in+i]=y[i];
	}
	return z;
		
	}
	public static void main(String[] args)
	{
		
		Array45 a= new Array45();
		
		int x[]= {45,58,554,42};
	int	y[]={1,2,3};
	
	a.insertArr(x, y, 0);
	
		System.out.println();
	}
	
	
}











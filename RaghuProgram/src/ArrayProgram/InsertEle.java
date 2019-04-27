package ArrayProgram;

public class InsertEle 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30};
		int ele=25;
		
		int b[]= new int [a.length+1];
		
		b[0]=ele;
		for (int i = 0; i < b.length; i++) 	
		{
			if(i<b.length-1)
			{
				b[i]=a[i];
			}
			else
			{
				b[i]=ele;
			}
		}
		
		for (int k = 0; k < b.length; k++)
		{
			System.out.print(b[k]+" ");
		}
	}
}

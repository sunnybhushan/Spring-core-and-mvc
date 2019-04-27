package ArrayProgram;

public class Arrya23 
{
	public static void main(String[] args)
	{
		int ar[]= {10,20,30,40,50};
		int dele=50;
		//int brr[]= new int [ar.length-1];
		for (int i = 0; i < ar.length; i++) 
		{
			if (dele==ar[i])//ar[i]== dele;
			{
				for (int j = i; j < ar.length-1; j++)// ar[i]==ar[i+1]
					
				{
					ar[j]=ar[j+1];
				}
				break;
			}
		}
		for (int i = 0; i < ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("jj");
	}
}

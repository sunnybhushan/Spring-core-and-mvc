package ArrayProgram;

public class ZigJak
{
	public static void main(String[] args)
	{
		int ar[]= {10,20,30,40,50,60};
		int br[]= {1,2,3,4,5,6};
		int cr[]=zigjak(ar, br);
		
		for (int i = 0; i < cr.length; i++) {
			System.out.print(cr[i]+" ");
		}
		
		System.out.println("thanku1");
		
		
		
	}
	static int[]  zigjak(int ar[], int br[])
	{
		int i=0,j=0,k=0;
		int cr[]=new int[ar.length+br.length];
		while(i<ar.length && j<br.length) 
		{
			cr[k++]=ar[i++];
			cr[k++]=br[j++];
		}
		while(i<ar.length)
		{
			cr[k++]=ar[i++];
		}
		while(j<br.length)
		{
			cr[k++]=br[j++];
		}
		return cr;
	
	}
	
	
}




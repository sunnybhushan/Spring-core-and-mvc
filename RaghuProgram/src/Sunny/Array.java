package Sunny;

public class Array 
{
	public static void main(String[] args) {
		int ar[]= {10,20,30};
		int br[]={40,50,60,70};
		int lengthcr=ar.length+br.length;
		int cr[]=new int [lengthcr];
		
		for (int i = 0; i < ar.length; i++) {
			cr[i]=ar[i];
		}
		for (int i = 0; i < br.length; i++) {
			cr[ar.length+i]=br[i];
		}
		
		for (int i : cr) {
			System.out.print(i+" ");
		}
	}
}

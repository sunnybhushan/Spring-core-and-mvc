//{}=braces;
package ArrayProgram;

public class Array1
{
	public static void main(String[] args) {
		int ar[]= {1,5,3,4};
		int ar1[];
		ar1=new int[] {72,34,53,14,153,44}; //Initialize array in java
		
		int ar2[]; //decleration
		ar2= new int[5]; // allocation
		System.out.println(ar2); // print address of array fully qualified
		System.out.println(ar2[0]);// print the value;
		ar2[0]=45;
		
		
		
		
		
		for(int i=0; i<ar.length;  i++)
		{
			System.out.print(+ar[i]+",");
		}
		
		System.out.println();
		
		for(int i=0; i<ar1.length;  i++)
		{
			System.out.print(+ar1[i]+",");
		}
		
		
	}
	
}

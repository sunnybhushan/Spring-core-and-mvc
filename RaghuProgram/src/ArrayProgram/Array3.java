package ArrayProgram;

import java.util.Scanner;

public class Array3 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values you have;");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		
		int sum=0;
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		
		System.out.println("sun is: "+sum);
		
		System.out.println("Entered elements: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i+"-->"+ar[i]);
		}
		
	}
}













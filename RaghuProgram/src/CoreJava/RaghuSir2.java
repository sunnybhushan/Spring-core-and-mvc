//wajp to calculate how many digits present in our a number.
package CoreJava;

import java.util.Scanner;

public class RaghuSir2
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		int spin=3210;
//		int upin=0;
//		do {
//			System.out.println("Enter your pin");
//			upin=sc.nextInt();
//		} while (upin!=spin);
//		System.out.println("Valid");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		do {
			count++;
			 n=n/10;
			
		} while (n!=0);
		System.out.println("No of digit: "+count);
	
	}
}

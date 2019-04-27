//wajp to calculate the sum of digit in the number.
package CoreJava;

import java.util.Scanner;

public class Raghu3 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int sum=0;
		do 
		{
			count++;
			sum=sum+n%10;
			n=n/10;
			
			
		} while (n!=0);
		System.out.println("sum of number: "+sum);
		System.out.println("count: "+count);
		
		
	}
}
//wajp to count how many even digit and odd digit present in out number

class Raghusir
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int ecount=0;
				int ocount=0;
		int r=0;
		do {
			r=n%10;
			
			if(n%2==0)
				ecount++;
			else 
				ocount++;
			n=n/10;
		} while (n!=0);
		System.out.println("Evnen: "+ecount);
		System.out.println("Odd: "+ocount);
	}
}






















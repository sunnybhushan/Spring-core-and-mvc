//wap to print the even number between 1 to n.
package CoreJava;

import java.util.Scanner;

public class EvenNoBetween 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number where you want to print the number");
		int no1=sc.nextInt();
		System.out.println("Enter the number where you want to print the number");
		int no2=sc.nextInt();
		sc.close();
		if(no1!=2)
		
			no1++;
		while(no1<=no2)
		{
			System.out.println(no1);
			no1=no1+2;
		}
		
	}
}

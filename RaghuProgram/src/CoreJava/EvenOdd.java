//wrt a program to define if your number is even or odd.
package CoreJava;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		sc.close();
		boolean rs=Even(no);
		if(rs==true)
		{
			System.out.println("Even "+no);
		}
		else
		{
			System.out.println("Odd "+no);
		}
	}
	
public static boolean Even(int no)
{
	if(no%2==0)
	{
		return true;
	}
	else {
		return false;
	}
	
}
}



















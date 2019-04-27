//wap to display the number from 1 to 10;
package CoreJava;

import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
		System.out.println("Enter the starting number");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		System.out.println("Enter the last number");
		int no2=sc.nextInt();
		sc.close();
		
		while (no1>=no2) {
			
			System.out.println(no1);
			no1--;
		}
	}

}

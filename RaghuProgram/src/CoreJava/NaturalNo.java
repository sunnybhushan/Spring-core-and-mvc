//wap to calculate the sum of natural no;
package CoreJava;

import java.util.Scanner;

public class NaturalNo {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int no1=sc.nextInt();
	sc.close();
	
	int sum=0;
	while(no1>0)
		{
		 sum=sum+no1;
		 no1=no1-1;
		 
		}
	System.out.println("the sum of numvwr is: "+sum);
}
}

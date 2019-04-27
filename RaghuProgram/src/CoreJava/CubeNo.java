//wap to define a method to calculate the cube of a number.
package CoreJava;

import java.util.Scanner;

public class CubeNo 
{
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int no=sc.nextInt();
	sc.close();
	isCube(no);
	
	
}

public static void isCube(int no)
{
	int n=no*no*no;
	System.out.println("Cube of a number is "+n);
}

}

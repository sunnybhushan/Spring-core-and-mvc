/*  R
    RA
    RAG
    RAGH
    RAGHU
*/
package CoreJava;

import java.util.Scanner;

public class Pattern6
{
	public static void main(String[] args) {
		System.out.println("Enter the letter");
		Scanner sc= new Scanner(System.in);
		String st=sc.next();
		
		for (int i = 0; i < st.length(); i++) 
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println(" ");
		}
	}
}

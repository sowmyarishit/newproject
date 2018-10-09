package java_programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int s=sc.nextInt();
		int x=0;
		int y=1;
		System.out.print(x+" "+y+" ");                          

		int z=x+y;
		while(z<=s) {
			System.out.print(z+" ");
			x=y;
			y=z;
			z=x+y;

			
		}

	}

}

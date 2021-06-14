package logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Fiboinacci Series -");
		System.out.println("Enter fibonacci count value : ");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		input.close();
		int n1 = 0, n2 = 1, n3;
		
		System.out.print("Fibonacci series : " +n1 +" "+n2);
		for(int i=2; i<=count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}

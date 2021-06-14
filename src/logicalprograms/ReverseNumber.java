package logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//int num = 5432;
		//or take user input
		int num, rem, reverse = 0;
		System.out.println("Enter num for reverse number : ");
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		System.out.println("before reverse number : " +num);
		input.close();
		
		// condition for reverse number
		while(num != 0) {
			rem = num % 10; 
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		System.out.println("after reverse number : " +reverse);
	}
}

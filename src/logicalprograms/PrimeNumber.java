package logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter any number for check prime or not");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		int temp =0;
		
		for(int i = 2; i <= num-1;i++) {
			// checking here condition not prime
			if(num % i == 0) {
				temp = i; // not printing here stored in temp variable
			}
		}
		
		if(temp == 0) {
			System.out.println(num + " is prime number ");
		} else {
			System.out.println(num + " is not prime number ");
		}
		
	}
}

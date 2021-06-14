package logicalprograms;

import java.util.Scanner;

public class ParfectNumbers {

	public static void main(String[] args) {
		int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        n = s.nextInt();
        s.close();
        for(int i = 1; i < n; i++) {
        	if(n % i == 0) {
        		sum = sum + i;
        	}
        }
        
        if(sum == n) {
        	System.out.println("the perfact no is  : " +n);
        } else {
        	System.out.println("the not perfact no is : ");
        }
	}
}

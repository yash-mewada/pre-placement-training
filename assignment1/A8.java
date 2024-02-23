//WAP to Check number is +ve, -ve or zero

import java.util.Scanner;

class A8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if(num > 0) {
			System.out.println("It is positive number");
		} 
		else if(num < 0) {
			System.out.println("It is a negative number");
		} 
		else {
			System.out.println("The number is 0");
		}
	}
}
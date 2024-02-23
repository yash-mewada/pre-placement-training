//WAP to Check number is less than 20

import java.util.Scanner;
class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();

		if(num < 20) {
			System.out.println("Number is less than 20");
		} 
		else {
			System.out.println("Number is greater than 20");
		}
	}
}
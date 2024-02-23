//WAP to Check voting eligibility

import java.util.Scanner;

class A3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = sc.nextInt();

		if(age >= 18){
			System.out.println("You are eligible for voting");
		} else {
			System.out.println("You are not eligible for voting");
		}
	}
}
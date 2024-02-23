//WAP for Largest amongst three numbers using nested if else

import java.util.Scanner;

class A9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number 1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter a number 2: ");
		int num2 = sc.nextInt();

		System.out.println("Enter a number 3: ");
		int num3 = sc.nextInt();

		if(num1 > num2) {
			if(num1 > num3){
				System.out.println("Num1 is greatest");
			} else {
				System.out.println("Num3 is greated");
			}
		}
		else {
			if(num2 > num3) {
				System.out.println("Num 2 is greatest");
			}
			else{
				System.out.println("Num3 is greatest");
			}
		}
	}
}
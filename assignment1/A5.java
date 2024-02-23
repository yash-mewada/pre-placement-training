//WAP Enter three angles & check if it is a triangle

import java.util.Scanner;

class A5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter angle 1: ");
		int s1 = sc.nextInt();

		System.out.println("Enter angle 2: ");
		int s2 = sc.nextInt();

		System.out.println("Enter angle 3: ");
		int s3 = sc.nextInt();

		int sum = s1 + s2 + s3;

		if(sum == 180) {
			System.out.println("It is a triangle");
		} else {
			System.out.println("It is not a triangle");
		}
	}
}
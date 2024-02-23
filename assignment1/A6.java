//WAP to accept 5 paper marks from user and find total marks & percentage

import java.util.Scanner;

class A6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you marks");

		System.out.println("Enter marks 1");
		int m1 = sc.nextInt();

		System.out.println("Enter marks 2");
		int m2 = sc.nextInt();

		System.out.println("Enter marks 3");
		int m3 = sc.nextInt();

		System.out.println("Enter marks 4");
		int m4 = sc.nextInt();

		System.out.println("Enter marks 5");
		int m5 = sc.nextInt();

		int totalMarks = m1 + m2 + m3 + m4 + m5;
		double percentage = (totalMarks * 100) / 500;

		System.out.println("Total marks are: "+ totalMarks);
		System.out.println("percentage is "+ percentage + "%");
	}
}
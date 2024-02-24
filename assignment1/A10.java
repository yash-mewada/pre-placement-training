//WAP to Print grade of students

import java.util.Scanner;

class A10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your percentage");
		int percent = sc.nextInt();

		if(percent >=90 && percent <= 100){
			System.out.println("O+ grade");
		}
		else if(percent >=80 && percent <= 90){
			System.out.println("O grade");
		}
		else if(percent >=70 && percent <= 80){
			System.out.println("A+ grade");
		}
		else if(percent >=60 && percent <= 70){
			System.out.println("A grade");
		}
		else if(percent >=50 && percent <= 60){
			System.out.println("B grade");
		}
		else if(percent >=40 && percent <= 50){
			System.out.println("C grade");
		}
		else {
			System.out.println("Fail");
		}
	}
}
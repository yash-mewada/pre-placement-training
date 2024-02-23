//WAP to accept any character from the keyboard and check that entered character is in upper, lower, digit or special character using ASCII code

import java.util.Scanner;

class A7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		int asciiValue = (int)ch;

		System.out.println("Character is: " + ch);

		if(Character.isLetter(asciiValue)){
			System.out.println("It is a letter");
			if(Character.isUpperCase(ch)){
				System.out.println("it is UpperCase");
			} 
			else {
				System.out.println("It is lowercase");
			}
		} 
		else if(Character.isDigit(ch)){
			System.out.println("It is a digit");
		} 
		else {
			System.out.println("it is a special Character");
		}
	}
}
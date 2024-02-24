import java.util.Scanner;

class WL6 {
	public static void main(String[] args) {

		int rev = 0,num,rem,temp;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check it is palindrome or not");
		num = sc.nextInt();

		temp = num;

		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		if(rev == temp) {
			System.out.println(temp + " is a palindrome number");
		}
		else {
			System.out.println(temp + " is not a palindrome number");
		}
	}
}
import java.util.Scanner;

class FOR1 {
	public static void main(String[] args) {
		int n,fact = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find its factorial");
		n = sc.nextInt();

		for (int i = 1 ; i <= n ; i++ ) {
			fact = fact * i;
		}

		System.out.println("factorial of number is: " + fact);
	}
}
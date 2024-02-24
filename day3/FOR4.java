import java.util.Scanner;

class FOR4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x,n;
		double sum=1;

		System.out.println("Enter a number: ");
		x = sc.nextInt();

		System.out.println("Enter a range: ");
		n = sc.nextInt();

		for (int i = 1; i<=n ;i++) {
			sum += (Math.pow(x,i)) / i;
		}

		System.out.println("Sum is: " + sum);
	}
}
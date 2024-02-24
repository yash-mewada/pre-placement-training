import java.util.Scanner;

class FOR3 {
	public static void main(String[] args) {

		int f0 = 0,f1 = 1,f2,n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a range: ");
		n = sc.nextInt();

		System.out.println("Fibonacci range is: ");
		System.out.print(f0 + "\t" + f1 + "\t");

		for (int i = 3; i<=n ; i++) {
			f2 = f0 + f1;
			System.out.print(f2 + "\t");
			f0 = f1;
			f1 = f2;
		}
	}
}
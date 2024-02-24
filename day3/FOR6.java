import java.util.Scanner;

class FOR6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a range print in reverse order with difference of 2: ");
		int n = sc.nextInt();

		for (int i = n ; i >= 1 ; i = i-2) {
			System.out.print(i + "\t");
		}
	}
}
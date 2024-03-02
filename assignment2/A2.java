import java.util.Scanner;

class A2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a range: ");
		int n = sc.nextInt();

		int f0 = 0,f1 = 1,f2,sum = f0 + f1;

		for (int i = 3;i <= n ;i++ ) {
			f2 = f0 + f1;
			sum += f2;
			f0 = f1;
			f1 = f2;
		}
		System.out.println(sum);
	}
}
import java.util.Scanner;

class FOR7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x,y,sum=0;

		System.out.println("Enter number 1: ");
		x = sc.nextInt();

		System.out.println("Enter number 2: ");
		y = sc.nextInt();

		for (int i = 1; i<=x ;i++) {
			sum += y;
		}

		System.out.println("multiplication is: " + sum);
	}
}
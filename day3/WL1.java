import java.util.Scanner;

class WL1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum=0,no,rem;
		System.out.println("Enter a number to sum: ");
		no = sc.nextInt();

		while(no>0){
			rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}

		System.out.println("Sum of numbers: " + sum);
	}
}
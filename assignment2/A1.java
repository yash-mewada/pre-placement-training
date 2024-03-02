import java.util.Scanner;
class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int first=0,last=n%10;

		while (n>0){
			first = n%10;
			n = n/10;
		}

		System.out.println("Addition of first and last digit of number: " + (first + last));
	}
}
import java.util.Scanner;

class A15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n,rem,sum=0;

		System.out.println("Enter any 2 digit number");
		n = sc.nextInt();

		if(n>9 && n<100){
			rem = n % 10;
			n = n / 10;
			sum = rem + n;
		}

		if(sum > 10){
			System.out.println("sum of digits is greater than 10");
		}
		else{
			System.out.println("sum of digits is not greater than 10");
		}

	}
}
import java.util.Scanner;

class FOR2 {
	public static void main(String[] args) {

		int sum=0,n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a range: ");
		n = sc.nextInt();

		for (int i = 1; i<=n ; i++) {
			if(i%2 == 0){
				sum = sum + i;
			}
		}

		System.out.println("Sum is " + sum);
	}
}
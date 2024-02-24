import java.util.Scanner;

class WL4 {
	public static void main(String[] args) {

		int fact = 1,num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find its factorial: ");
		num = sc.nextInt();

		while(num > 0){
			fact = fact * num;
			--num;
		}

		System.out.println("factorial is " + fact);
	}
}
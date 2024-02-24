import java.util.Scanner;

class WL2 {
	public static void main(String[] args) {
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to count digit: ");
		int num = sc.nextInt();

		while(num > 0){
			num = num /10;
			++count;
		}

		System.out.println("There are " + count + " digits in the number");
	}
}
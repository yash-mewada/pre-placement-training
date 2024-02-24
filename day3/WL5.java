import java.util.Scanner;

class WL5 {
	public static void main(String[] args) {
		int sum=0,no,rem;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		no = sc.nextInt();

		int temp = no;

		while (no > 0){
			rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no /10;
		}

		if(sum == temp){
			System.out.println(temp + " is an armstrong number");
		} 
		else {
			System.out.println(temp+" is not an armstrong number");
		}
	}
}
import java.util.Scanner;
class SW1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an amount: ");
		int amt = sc.nextInt();

		System.out.print("Enter a range: ");
		int note = sc.nextInt();

		switch(note) {
			case 2000: 
				int n1 = amt/2000;
				System.out.print("you need " + n1 + " notes of 2000\n"); 
				amt = amt % 2000;
			case 500: 
				n1 = amt/500;
				System.out.print("you need " + n1 + " notes of 500\n");
				amt = amt % 500;
			case 200: 
				n1 = amt/200;
				System.out.print("you need " + n1 + " notes of 200\n");
				amt = amt % 200;
			case 100: 
				n1 = amt/100;
				System.out.print("you need " + n1 + " notes of 100\n");
				amt = amt % 100;
			case 50: 
				n1 = amt/50;
				System.out.print("you need " + n1 + " notes of 50\n");
				amt = amt % 50;
			case 20: 
				n1 = amt/20;
				System.out.print("you need " + n1 + " notes of 20\n");
				amt = amt % 20;
			case 10: 
				n1 = amt/10;
				System.out.print("you need " + n1 + " notes of 10\n");
				amt = amt % 10;
			case 5: 
				n1 = amt/5;
				System.out.print("you need " + n1 + " notes of 5\n");
				amt = amt % 5;
			case 2: 
				n1 = amt/2;
				System.out.print("you need " + n1 + " notes of 2\n");
				amt = amt % 2;
			case 1: 
				n1 = amt/1;
				System.out.print("you need " + n1 + " notes of 1\n");
				amt = amt % 1;
				break;
			default: System.out.print("Enter a valid cash range\n");
		}
	}
}
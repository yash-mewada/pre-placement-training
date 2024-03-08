import java.util.Scanner;

class PQ11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String s = sc.nextLine();

		System.out.println("Enter the index: ");
		int i = sc.nextInt();

		System.out.println("Character " + s.charAt(i) + " at " + i +" position");
	}
}
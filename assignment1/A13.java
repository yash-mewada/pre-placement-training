import java.util.Scanner;

class A13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your percentage: ");
		int percent = sc.nextInt();

		if(percent >= 75){
			System.out.println("Student has scored distinction");
		}
		else {
			System.out.println("Student has not scored distinction");
		}
	}
}
import java.util.Scanner;

class IF3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter marks 1: ");
		int m1 = sc.nextInt();

		System.out.println("enter marks 2: ");
		int m2 = sc.nextInt();

		System.out.println("enter marks 3: ");
		int m3 = sc.nextInt();

		System.out.println("enter gender(m/f): ");
		String gender = sc.next();

		int percent = ((m1 + m2 + m3) * 100) / 300;

		if(percent >= 62 && gender.equals("f")){
			System.out.println("You are eligible for admission");
		} 
		else {
			System.out.println("You are not eligible for admission");
		}
	}
}
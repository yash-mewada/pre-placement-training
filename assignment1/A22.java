import java.util.Scanner;

class A22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m1,m2,m3,m4,m5;
		double percent;
		String gender;

		System.out.println("Enter marks 1: ");
		m1 = sc.nextInt();

		System.out.println("Enter marks 2: ");
		m2 = sc.nextInt();

		System.out.println("Enter marks 3: ");
		m3 = sc.nextInt();

		System.out.println("Enter marks 4: ");
		m4 = sc.nextInt();

		System.out.println("Enter marks 5: ");
		m5 = sc.nextInt();

		System.out.println("Enter your gender: m/f");
		gender = sc.next();

		percent = ((m1 + m2 + m3 + m4 + m5) * 100) / 500;

		if(percent >= 60 && gender.equals("m")){
			System.out.println("You are eligible for admission");
		}
		else if(percent >= 80 && gender.equals("f")){
			System.out.println("You are eligible for admission");
		}
		else {
			System.out.println("You are not eligible for admission");
		}
	}
}
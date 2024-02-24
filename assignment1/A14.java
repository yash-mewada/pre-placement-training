import java.util.Scanner;

class A14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a1,a2,a3;

		System.out.println("Enter angle 1: ");
		a1 = sc.nextInt();
		
		System.out.println("Enter angle 2: ");
		a2 = sc.nextInt();

		System.out.println("Enter angle 3: ");
		a3 = sc.nextInt();

		if(a1 + a2 + a3 != 180){
			System.out.println("Not a triangle");
		}
		else if(a1 == 90 || a2 == 90 || a3 == 90){
			System.out.println("Right angled triangle");
		}
		else if (a1 < 90 && a2 < 90 && a3 < 90){
			System.out.println("Acute triangle");
		}
		else {
			System.out.println("obtuse triangle");
		}
	}
}
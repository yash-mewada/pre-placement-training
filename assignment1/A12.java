import java.util.Scanner;

class A12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b,c;

		System.out.println("Enter number 1: ");
		a = sc.nextInt();

		System.out.println("Enter number 2: ");
		b = sc.nextInt();

		System.out.println("Enter number 3: ");
		c = sc.nextInt();

		if(a>b && a>c){
			System.out.println(a + " is greatest");
		}
		else if(b>a && b>c){
			System.out.println(b + " is greatest");
		}
		else{
			System.out.println(c + " is greatest");
		}
	}
}
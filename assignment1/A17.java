import java.util.Scanner;

class A17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b;
		char ch;
		do{
			System.out.println("Enter number 1: ");
			a = sc.nextInt();

			System.out.println("Enter number 2: ");
			b = sc.nextInt();

			System.out.println("Enter the operation: +,-,*,/");
			System.out.println("Enter 0 to exit");
			ch = sc.next().charAt(0);

			switch(ch){
				case '+':
					System.out.println("a + b = " + (a+b));
					break;

				case '-':
					System.out.println("a - b = " + (a-b));
					break;

				case '*':
					System.out.println("a * b = " + a*b);
					break;

				case '/':
					System.out.println("a / b = " + a/b);
					break;

				case '0':
					System.exit(0);
					break;

				default:
					System.out.println("Enter a valid operation");
			}
		}
		while(true);

	}
}
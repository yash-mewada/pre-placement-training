import java.util.Scanner;

class A16 {
	public static void main(String[] args) {
		String day;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day like mon,sun or holiday");
		day = sc.next();

		if(day.equals("sun") || day.equals("sat")){
			System.out.println("it is weekend");
		}
		else if(day.equals("holiday")) {
			System.out.println("it is holiday");
		}
		else {
			System.out.println("it is weekday");
		}
	}
}
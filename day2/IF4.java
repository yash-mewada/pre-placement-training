import java.util.Scanner;
class IF4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a day like mon,tue....");
		String day = sc.next();

		if(day.equals("sun") || day.equals("sat"))
			System.out.println("It is weekend");
		else
			System.out.println("It is weekday");
	}
}
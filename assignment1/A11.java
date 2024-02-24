import java.util.Scanner;

class A11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sal=20000;
		int dailyAllowance,travellingAllowance,houseRent;

		System.out.println("Enter daily allowance: ");
		dailyAllowance = sc.nextInt();

		System.out.println("Enter travelling allowance: ");
		travellingAllowance = sc.nextInt();

		System.out.println("Enter house rent");
		houseRent = sc.nextInt();

		int grossSal = sal + dailyAllowance + travellingAllowance + houseRent;

		System.out.println("Gross salary is: " + grossSal);
	}
}
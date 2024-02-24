import java.util.Scanner;

class A20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a range to print sum of even numbers: ");
		int range = sc.nextInt();
		int sum = 0;

		for(int i = 1; i <= range; i++){
			if(i%2 == 0){
				sum += i;
			}
		}

		System.out.println("sum of even numbers is: " + sum);
	}
}
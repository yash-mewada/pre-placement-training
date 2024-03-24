import java.util.Scanner;
class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int sum=0;

		System.out.println("Enter elements in array: ");
		for (int i = 0;i < 5;i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0;i < 5;i++) {
			sum += arr[i];
		}

		System.out.println("Summation of array: " + sum);
	}
}
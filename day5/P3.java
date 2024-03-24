import java.util.Scanner;

class P3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int sumEven,sumOdd,even,odd;
		sumEven=sumOdd=even=odd=0;

		System.out.println("Enter elements in array: ");
		for (int i = 0;i < 5;i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0;i < 5;i++) {
			if(arr[i]%2 == 0){
				sumEven += arr[i];
				even++;
			}
			else{
				sumOdd += arr[i];
				odd++;
			}
		}
		System.out.println("Sum of odd: " + sumOdd);
		System.out.println("Sum of even: " + sumEven);
		System.out.println("no of odd: " + odd);
		System.out.println("no of even: " + even);
	}
}
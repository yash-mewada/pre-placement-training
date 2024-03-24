import java.util.Scanner;

class P5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];

		System.out.println("Enter elements in array: ");
		for (int i = 0;i < 3 ;i++ ) {
			for (int j = 0;j < 3 ;j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("elements in array are: ");
		for (int i = 0;i < 3;i++) {
			for (int j = 0;j < 3;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
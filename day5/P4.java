import java.util.Scanner;

class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter elements in array: ");
		for (int i = 0;i < 5;i++) {
			arr[i] = sc.nextInt();
		}

		int small,large;
		small=large=arr[0];

		for (int i = 0;i < 5;i++) {
			if(small > arr[i])
				small = arr[i];
			if(large < arr[i])
				large = arr[i];
		}

		System.out.println("largest element: " + large + " smallest element: " + small);
	}
}
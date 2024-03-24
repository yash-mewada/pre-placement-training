import java.util.*;

class P14{
	public static void main(String[] args) {
		int arr[] = new int[6];
		Arrays.fill(arr,100);

		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr,3,6,44);
		System.out.println(Arrays.toString(arr));
	}
}
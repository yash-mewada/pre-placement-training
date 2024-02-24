import java.util.Scanner;

class WL3 {
	public static void main(String[] args) {

		int mul=1,num,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find multiplication");
		
		num = sc.nextInt();

		while(num > 0){
			rem = num % 10;
			mul = mul * rem;
			num = num / 10;
		}

		System.out.println("multiplication is " + mul);
	}
}
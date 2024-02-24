import java.util.Scanner;

class WL7 {
	public static void main(String[] args) {
		int no,rem,count = 0,temp,temp2;
		double sum=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		no = sc.nextInt();

		temp = no;
		temp2 = no;

		while(temp2 > 0){
			temp2 = temp2 /10;
			count++;
		}

		while (no > 0){
			rem = no % 10;
			sum = sum + (Math.pow(rem,count));
			no = no /10;
		}

		if(sum == temp){
			System.out.println(temp + " is an armstrong number");
		} 
		else {
			System.out.println(temp+" is not an armstrong number");
		}
	}
}
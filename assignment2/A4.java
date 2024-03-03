import java.util.Scanner;

class A4 {
	public static void main(String[] args) {

		for (int i = 1;i <= 10000 ;i++ ) {
			int no=i,rem,count = 0,temp,temp2;
			double sum=0;
		
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
				System.out.println(i);
			}
		}
		 
	}
}
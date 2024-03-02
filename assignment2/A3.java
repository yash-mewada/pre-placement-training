import java.util.Scanner;

class A3{
	public static void main(String[] args) {
		for (int i = 2;i <= 5555 ;i++) {
			boolean flag = true;
			for (int j = 2;j < i ;j++ ) {
				if(i % j == 0){
					flag = false;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}
class P9 {
	public static void main(String[] args) {
		int n = 1,sum = 0;
		for (int i = 1;i <= 4 ;i++ ) {
			for (int j = 1;j <= 4 ;j++ ) {
				if(j == i){
					sum = sum + n;
				}
				System.out.print(n + " ");
				n++;
			}

			System.out.println();
		}
		System.out.println("Sum: " + sum);
	}
}
class P10 {
	public static void main(String[] args) {
		int n = 1;
		for (int i = 1;i <= 4 ;i++ ) {
			int sum = 0;
			for (int j = 1;j <= 4 ;j++ ) {
				sum = sum + n;
				System.out.print(n + " ");
				n++;
			}
			System.out.print("-> " + sum);
			System.out.println();
		}
	}
}
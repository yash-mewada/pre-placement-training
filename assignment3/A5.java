class A5 {
	public static void main(String[] args) {
		int n = 74;
		for (int i = 1;i <= 10 ;i++ ) {
			for (int j = 1;j <= 9 ;j++ ) {
				System.out.print((char)n + " ");
			}
			System.out.println();
			n--;
		}
	}
}
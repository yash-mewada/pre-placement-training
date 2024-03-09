class P2 {
	public static void main(String[] args) {
		int n = 4,seq = 1;

		for (int i = 1;i <= n ;i++ ) {
			for (int j = 1;j <= n ;j++ ) {
				System.out.print(seq + " ");
				seq++;
			}
			System.out.println();
		}
	}
}
class A8{
	public static void main(String[] args) {
		for (int i = 1;i <= 10 ;i++ ) {
			int ch = 74;
			for (int j = 10;j >= i ;j-- ) {
				System.out.print((char) ch);
				ch--;
			}
			System.out.println();
		}
	}
}
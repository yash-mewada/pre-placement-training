class A7{
	public static void main(String[] args) {
		int ch = 74;
		for (int i = 1;i <= 10 ;i++) {
			for (int j = 10;j >= i ;j--) {
				System.out.print((char) ch);
			}
			ch--;
			System.out.println();
		}
	}
}
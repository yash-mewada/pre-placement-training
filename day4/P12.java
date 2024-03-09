class P12{
	public static void main(String[] args) {
		int n1 = 0,n2 = 11;

		for (int i = 1;i <= 5;i++ ) {

			n1++;
			n2--;

			if(n1 == 3 && n2 == 8)
				continue;

			System.out.println(n1 + " " + n2);	
		}
	}
}
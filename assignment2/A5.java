class A5 {
	public static void main(String[] args) {
		for (int i = 1;i <= 9999 ;i++ ) {
			int no=i,temp = i,rev=0,rem;

			while(no > 0){
				rem = no % 10;
				rev = rev * 10 + rem;
				no = no /10;
			}

			if(rev == temp){
				System.out.println(temp);
			}
		}
	}
}
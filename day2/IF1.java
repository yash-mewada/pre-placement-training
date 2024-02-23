class IF1 {
	public static void main(String[] args) {
		int a=1,b=2,c=5,d=6,e=10;

		int max = a;

		if(max < b) {
			max = b;
		}

		if(max < c) {
			max = c;
		}

		if(max < d) {
			max = d;
		}

		if(max < e) {
			max = e;
		}

		System.out.println(max);
	}
}
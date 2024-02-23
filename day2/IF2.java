class IF2 {
	public static void main(String[] args) {
		int a=10,b=3,c=1,d=5;

		int min = a;

		if(min > b)
			min = b;

		if(min > c)
			min = c;

		if(min > d)
			min = d;

		System.out.println(min);
	}
}
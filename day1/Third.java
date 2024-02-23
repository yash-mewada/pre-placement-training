class Third {
	static int i = 5;
	static public void show(){
		System.out.println("Value of i = " + i);
	}

	public void showAgain(){
		System.out.println("Value of i = " + i);
	}

	public static void main(String args[]){
		Third.show();

		Third t = new Third();
		t.showAgain();
	}
}
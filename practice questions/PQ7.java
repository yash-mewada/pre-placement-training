//swap two variables without mathematical operators and temp variable
class PQ7{
	public static void main(String[] args) {
		int a = 50,b = 40;

		System.out.println("Before swapping: a = " + a + " b = " + b );

		a = a^b;
		b = a^b;
		a = a^b;

		System.out.println("After swapping");
		System.out.println("a = " + a);
		System.out.println("b = " +b);
	}
}
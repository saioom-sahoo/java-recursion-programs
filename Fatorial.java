public class Fatorial {
	static int number = 5,fact = 1;
	public static void main(String args[]) {
		System.out.println(factorial(number));
	}
	public static int factorial(int n) {
		if(n > 1) {
			fact = fact*n;
			n--;
			factorial(n);
		}
		return fact; 
	}

}
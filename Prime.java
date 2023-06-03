public class Prime {
	static int number = 5, count = 0;

	public static void main(String args[]) {
		if (prime(number) == 2) {
			System.out.println("It is prime number");
		} else {
			System.out.println("It is not");
		}
	}

	public static int prime(int n) {
		if (n != 0) {
			if (number % n == 0) {
				count++;
			}
			n--;
			prime(n);
		}
		return count;
	}

}
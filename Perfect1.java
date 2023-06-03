public class Perfect1 {
	static int number1 = 6,sum = 0,number2 = 1;
	public static void main(String args[]) {
		sum = sum + factor();
		if(sum == number1) {
			System.out.println("Perfect number");
		}
		else {
		      System.out.println("Not Perfect number");
		}
	}
	public static int factor() {
		if(number2 < number1) {
			if(number1 % number2 == 0) {
				return number2;
			}
			number2++;
			factor();
		}
		return 0;
	}
}
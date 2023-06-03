public class Perfect {
	static int number = 6,sum = 0 ,number2 = 1;
	public static void main(String args[]) {
		
		if(perfect() == number) {
			System.out.println("Perfect number");
		}
		else {
		      System.out.println("Not Perfect number");
		}
	}
	public static int perfect() {
		if(number2 < number) {
			if(number % number2 == 0){
			sum = sum + number2;
			}
		   number2++;
		   perfect();
			
		}
		return sum;
	}

}
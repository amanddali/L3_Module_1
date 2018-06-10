package IntroToJUnitTest;

public class Methods {

	public String multiply(int num1, int num2) {
		int answer = num1 * num2;
		String stuff = "";
		stuff += answer;
		return num1 + " x " + num2 + " = " + stuff;
	}

	public Boolean isPrime(int num) {
		Boolean stuff = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				stuff = false;
			}
		}
		return stuff;
	}

	public Boolean isSquare(int num) {
		Boolean stuff = false;
		double random = Math.sqrt((double) num);
		if (random % 1 == 0) {
			stuff = true;
		}
		return stuff;
	}

	public Boolean isCube(int num) {
		Boolean stuff = false;
		double random = Math.cbrt((double) num);
		if (random % 1 == 0) {
			stuff = true;
		}
		return stuff;
	}
}

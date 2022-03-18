package goldMan;

public class Power {

	public static void main(String a[]) {
		// System.out.println(isPowerHelper(100,10));
		// System.out.println(isPowerHelper(0,10));
		// System.out.println(isPowerHelper(1,10));
		// System.out.println(isPowerHelper(999,10));
		// System.out.println(isPowerHelper(9,10));
		// System.out.println(isPowerHelper(10000,10));
		// System.out.println(isPowerHelper(1000000000,10));

		System.out.println(isPowerHelper(64, 8));
		System.out.println(isPowerHelper(512, 8));
		System.out.println(isPowerHelper(0, 8));
		System.out.println(isPowerHelper(1, 8));
		System.out.println(isPowerHelper(7, 8));
		System.out.println(isPowerHelper(72, 8));
		System.out.println(isPowerHelper(65, 8));
		System.out.println(isPowerHelper(0.015625, 8));
		System.out.println(isPowerHelper(0.125, 8));
		System.out.println(isPowerHelper(0.1, 8));
		
	}

	private static boolean isPowerHelper(double number, int power) {
		if (number < 1)
			return negativePower(number, power);
		else
			return positivePower(number, power);

	}

	private static boolean positivePower(double number, int power) {
		if (number == 1) {
			return true;
		}
		if (number < power && number > 1) {
			return false;
		}

		return isPowerHelper((number / power) + (number % power), power);

	}

	private static boolean negativePower(double number, int power) {
		if (number == 0) {
			return true;
		}
		if (number > 1) {
			return false;
		}

		return isPowerHelper((number*power), power);

	}

}

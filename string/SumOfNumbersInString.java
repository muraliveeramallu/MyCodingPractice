package string;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		SumOfNumbersInString s = new SumOfNumbersInString();
		System.out.println(s.sumOfNumbers("1#234qqqqa1D:1 1"));
		System.out.println(s.sumOfNumbers("1#234qqq 34qa1D:1 1"));
	}

	private int sumOfNumbers(String string) {
		String[] numbers = string.split("\\D");
		int sum = 0;
		for(String number:numbers) {
			try {
				sum = sum + Integer.parseInt(number);
			}
			catch(Exception e) {
				continue;
			}
		}
		return sum;
	}

}

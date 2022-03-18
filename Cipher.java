
public class Cipher {

	public static void main(String[] args) throws Exception {
		Cipher c = new Cipher();

		System.out.println(c.encode("innoWake rules", 5));
		// System.out.println(c.decode("nsstBfpj wzqjx", 5));

		// System.out.println(c.encode("COBOL", 6));
		System.out.println(c.decode("IUHUR", 6));

		// System.out.println(c.encode("I am fi9!", 6));
		// System.out.println(c.decode("O gs lo9!", 6));

		// System.out.println(c.encode("", 6));
		// System.out.println(c.decode("", 6));

		// System.out.println(c.encode(null, 6));
		// System.out.println(c.decode(null, 6));

		// System.out.println(c.encode("COBOL", -6));
		// System.out.println(c.decode("IUHUR", -6));

		// System.out.println(c.encode("innoWake rules", 0));
		// System.out.println(c.decode("nsstBfpj wzqjx", 0));

	}

	public String encode(String input, int rotations) throws Exception {
		StringBuffer result = new StringBuffer();

		if (input == null || input.isEmpty()) {
			throw new Exception("Invalid Input text");
		}

		if (rotations < 0) {
			throw new Exception("Invalid rotation Count");
		}

		if (rotations == 0) {
			return input;
		}

		for (int i = 0; i < input.length(); i++) {
			char alphabet = input.charAt(i);
			if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
				alphabet = (char) (alphabet + rotations);

				if (alphabet > 'z') {
					alphabet = (char) (alphabet + 'a' - 'z' - 1);
				} else if (alphabet > 'Z' && alphabet < 'a') {
					alphabet = (char) (alphabet + 'A' - 'Z' - 1);
				}
			} else {
				result = result.append(alphabet);
				continue;
			}
			result = result.append(alphabet);
		}
		return result.toString();
	}

	public String decode(String input, int rotations) throws Exception {
		StringBuffer result = new StringBuffer();

		if (input == null || input.isEmpty()) {
			throw new Exception("Invalid Input Text");
		}

		if (rotations < 0) {
			throw new Exception("Invalid rotation Count");
		}

		if (rotations == 0) {
			return input;
		}

		for (int i = 0; i < input.length(); i++) {
			char alphabet = input.charAt(i);
			if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
				alphabet = (char) (alphabet - rotations);

				if (alphabet < 'A') {
					alphabet = (char) (alphabet - 'A' + 'Z' + 1);
				} else if (alphabet < 'a' && alphabet > 'Z') {
					alphabet = (char) (alphabet - 'a' + 'z' + 1);
				}
			} else {
				result = result.append(alphabet);
				continue;
			}
			result = result.append(alphabet);

		}
		return result.toString();

	}
}

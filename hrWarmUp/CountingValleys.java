package hrWarmUp;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingValleys s = new CountingValleys();
		System.out.println(s.getVallyCountt(8, "DDUUUUDD"));
		System.out.println(s.getVallyCountt(8, "UDDDUDUU"));
		System.out.println(s.getVallyCountt(20, "UUDDUUUUDDDDDDUUDDUU"));
		System.out.println(s.getVallyCountt(12, "UUUUDDUUDDDD"));
		System.out.println("/");
		System.out.println(s.getVallyCountt1(8, "DDUUUUDD"));
		System.out.println(s.getVallyCountt1(8, "UDDDUDUU"));
		System.out.println(s.getVallyCountt1(20, "UUDDUUUUDDDDDDUUDDUU"));
		System.out.println(s.getVallyCountt1(12, "UUUUDDUUDDDD"));


	}

	private int getVallyCountt(int n, String path) {

		int valleyCount = 0;
		int baseLevel = 0;
		int depth = 0;
		int height = 0;
		if (n == 0)
			return 0;
		for (int i = 0; i < n; i++) {
			if (baseLevel == 0) {
				depth = 0;
				height = 0;
			}
			if (path.charAt(i) == 'D') {
				baseLevel = baseLevel - 1;
				depth += 1;
				if (height > 0)
					height -= 1;
			} else
			if (path.charAt(i) == 'U') {
				baseLevel = baseLevel + 1;
				height += 1;
				if (depth > 0)
					depth -= 1;
			}

			//System.out.println("Iteration " + i + "-> height = " + height + " Depth =" + depth + " Base = " + baseLevel);
			if (baseLevel == 0 && height > depth) {
				valleyCount += 1;
			}
		}

		return valleyCount;

	}

	private int getVallyCountt1(int n, String path) {
		int level = 0;
		int valleys = 0;
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'U') {
				level++;
			} else if (path.charAt(i) == 'D') {
				if (level == 0) {
					valleys++;
				}
				level--;
			}
		}
		return valleys;
	}

}

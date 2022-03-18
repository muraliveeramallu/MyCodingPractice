package ArraysVol2;
//This is to check array Conatains a particular number or not
public class CheckArrayContainsANumber {

	public static void main(String[] args) {
		System.out.println(ArrayContainsNumberOrNot(new int[] {3,2,5,6,7,1,3}, 16));

	}

	private static Boolean ArrayContainsNumberOrNot(int[] a, int n) {
		
		for(int i=0; i<a.length;i++) {
			if(a[i] == n)
				return true;
		}
		
		return false;
	}

}

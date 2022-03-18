package myPracticeSet2;

public class ClimbingStairCase {
	
	static int numberOfUniqueWays(int steps, int[] stepperArray) {
		int count = 0;
		
		for(int i = 0; i<stepperArray.length; i++) {
			int reminder = steps%stepperArray[i];
			
			if(reminder == 0) {
				count=count+1;
			} else {
				
			}
			
		}	
		
		return 0;
	}
	
	public static void main(String a[]) {
		numberOfUniqueWays(8, new int[] {1,2});
	}

}

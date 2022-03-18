package hrArray;

public class NewYearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewYearChaos n = new NewYearChaos();
		n.getMinumBribe(new int[] {2,1,5,3,4},5);

		n.getMinumBribe(new int[] {2,5,1,3,4},5);
		n.getMinumBribe(new int[] {2,1,5,3,4,7,9,6,8},9);//{1,2,3,4,5,6,7,8,9}
		n.getMinumBribe(new int[] {2,1,5,4,3},5);
		n.getMinumBribe(new int[] {2,1,3,5,4},5);

	}

	private void getMinumBribe(int[] queue, int n) {
         int bribe = 0;
		for(int i=0;i<n;i++) {
			if(queue[i]!=i+1) {
			  int actualPosition = queue[i]-1;
			  if(actualPosition>i) {
			  if((actualPosition-i)>2){
				 System.out.println("Chaos");
				 return;
			  } else
			  {
				  bribe = bribe + (actualPosition-i);  	  
			  }
			  }
		}
			
	}
		System.out.println(bribe);
	}

}

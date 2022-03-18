package sorting;

import java.util.LinkedList;
import java.util.Queue;

public class FraudulentActivity {

	public static void main(String[] args) {
		FraudulentActivity f =new FraudulentActivity();
		f.fraudNotificationCount(new int[] {2, 3, 4, 2, 3, 6, 8, 4, 5}, 9, 5);
		f.fraudNotificationCount(new int[] {10, 20, 30, 40, 50}, 5, 3);
	}

	private void fraudNotificationCount(int[] spent, int n, int r) {
		Queue<Integer> q = new LinkedList<Integer>();
		int sum = 0;
		int temp = 0;
		int notificationCount = 0;
		for(int i=0;i<spent.length;i++) {
			if(i<=(r-1))
			 sum = sum+spent[i];
			q.add(spent[i]);
			if(i>(r-1)) {
				if(2*(sum/r)<=spent[i])
					notificationCount++;
				sum = sum+spent[i]-q.poll();
			}
		}
		System.out.println("Number of time Notifications sent = "+notificationCount);
		
	}

}

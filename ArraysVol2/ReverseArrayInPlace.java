package ArraysVol2;

public class ReverseArrayInPlace {
	
	public static void main(String a[]) {
		getReverseArray(new int[] {5,3,4,6,2});
		getReverseArray(new int[] {5,3,4,7,6,2});
		String s= "01234";
		
	}

	private static void getReverseArray(int[] a) {
		System.out.println();
		int mid= a.length/2;
		int temp=0;
		for(int i=0,j=a.length-1; i< mid && j>mid-1;i++,j--) {
			temp = a[i];
			a[i] = a[j];
			a[j]=temp;
		}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

package ArraysVol2;

public class CommonElementsIn3Arrays {
	public static void main(String a[]) {
		int[] input1 = {1, 5, 10, 20, 40, 80};
		int[] input2 = {6, 7, 20, 80, 100};
		int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
		getCommonElements(input1,input2,input3);
		System.out.println();
		getNonCommonElementsUsingList(input1,input2,input3);
	}

	private static void getCommonElements(int[] a, int[] b, int[] c) {
		int arraysize = a.length+b.length+c.length;
		int i = 0, j=0,k=0;
		for(int x=0;x<arraysize;x++) {
			if(i>a.length-1 || j>b.length-1 || k>c.length-1)
				break;
			
			if(a[i]==b[j] && b[j]==c[k]) {
				System.out.print(a[i]+" ");
				i++;
				j++;
				k++;
			} else if(a[i] < b[j] && a[i] < c[k]) {
				i++;
			} else if(b[j]<a[i] && b[j]<c[k]) {
				j++;
			} else if(c[k]<a[i] && c[k]<b[j]) {
				k++;
			}
		}
		
	}
	
	private static void getNonCommonElementsUsingList(int[] a, int[] b, int[] c) {
		int arraysize = a.length+b.length+c.length;
		int i = 0, j=0,k=0;
		for(int x=0;x<arraysize;x++) {			
			if(a[i]==b[j] && b[j]==c[k]) {
				if(i<a.length-1)
				   i++;
				if(j<b.length-1)
				   j++;
				if(k<c.length-1)
				  k++;
			} else if(i<a.length-1 && a[i] < b[j] && a[i] < c[k]) {
				System.out.print(a[i]+" ");
				i++;
			} else if(j<b.length-1 && b[j]<a[i] && b[j]<c[k]) {
				System.out.print(b[j]+" ");
				j++;
			} else if(k<c.length-1 && c[k]<a[i] && c[k]<b[j]) {
				System.out.print(c[k]+" ");
				k++;
			}
		}
		
	}

}

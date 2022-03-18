package array;
/*Add a 1 to the number in the array
Ex: [1,2,3] -> [1,2,4]
[1,2,9] -> [1,3,0]
[9,9,9] -> [1,0,0,0]
 */
public class ArrayNumberIncrement {

public static int[] incrementNumber(int[] input){

int inputSize = input.length;
int[] outputArray = new int[inputSize];
int carry = 1;
int number = 0;

for(int i= input.length-1; i>=0; i-- ) {
	if(carry == 1)
      number = input[i] + 1;
	else
	  number = 	input[i];
     if(number > 9)
       carry = 1; 
     else 
      carry = 0;        
    int reminder =  number%10;
    outputArray[i] = reminder;
    
    if(i==0 && carry == 1) {
    	outputArray = new int[inputSize+1];
    	outputArray[0] = 1;
    }
    

}

return outputArray;

}

	public static void main(String a[]) {
		int[] outputArray = incrementNumber(new int[] { 9, 9, 0 });
		for(int i = 0; i<outputArray.length; i++ ) {
		    System.out.println( outputArray[i] + " ");
		}
	}

}

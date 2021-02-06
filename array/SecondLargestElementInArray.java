package in.co.array;

public class SecondLargestElementInArray {
	public static void main(String []args){
		int[] array = {45,99,32,75,62};
		int size = array.length;
	
		for(int i = 0; i<size;i++){
			for(int j = i+1;j<size;j++){
				if(array[i]>array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			
			}
		}
		System.out.println("Second Largest Element in Array is "+ array[size-2]);
	}
}

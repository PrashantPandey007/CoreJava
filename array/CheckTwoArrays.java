package in.co.array;

import java.util.Arrays;

public class CheckTwoArrays {
	public static void main(String []args){
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,3,4};
		
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		int[] arr3 = {1,2,3};
		
		System.out.print(Arrays.equals(arr1, arr3));
	}

}

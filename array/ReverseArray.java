package in.co.array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String []args){
		int[] inputArr = {5,4,3,2,1};
		
		System.out.println("Array without reverse "+ Arrays.toString(inputArr));
		reverseArray(inputArr);
	}
	public static void reverseArray(int[] inputArr){
		for(int left=0,right=inputArr.length-1;left<right;left++,right--){
			int temp = inputArr[left];
			inputArr[left] = inputArr[right];
			inputArr[right] = temp;
		}
		System.out.print("Reverse Array :");
		for(int val : inputArr)
			System.out.print(" "+val);
	}

}

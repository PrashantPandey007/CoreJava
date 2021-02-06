package in.co.array;

public class FinfSmallAndLargest {
	public static void main(String []args){
		int[] inputArr = {10,43,25,69,12,34};
		
		int largest = inputArr[0];
		
		int smallest = inputArr[0];
		
		for(int number : inputArr){
			
			if(number>largest){
				largest = number;
			}else if(smallest>number){
				smallest = number;
			}
		}
		System.out.println("Largest and Smallest Numbers are "+largest+" "+smallest);
	}

}

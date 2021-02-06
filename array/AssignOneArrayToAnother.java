package in.co.array;

public class AssignOneArrayToAnother {
	public static void main(String []args){
	int[] arr1 = new int[5000];
	int[] arr2 = new int[100];
	arr1 = arr2;
	System.out.println(arr1.length);
	}

}

package in.co.array;

public class Array11 {

	public static void main(String[] args) {
		char[] copyFrom = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'};
		char[] copyTo = new char[10];
		
		System.arraycopy(copyFrom,2,copyTo,0,8);
		System.out.println(copyTo);

	}

}
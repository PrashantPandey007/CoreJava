package in.co.rayss;

public class Palindrome {
	public static void main(String []args){
	int a,sum=0;
	int T = 0;
	int n = 1331;
	
	T = n;
	
	while(n>0){
		a=n%10;
		sum = (sum*10)+a;
		n=n/10;
	}
	if (T==sum){
		System.out.println("This a palindrome number.");
	}else{
		System.out.println("This is not a palindrome number.");
	}
	}
	
}

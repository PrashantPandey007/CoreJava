package in.co.ifelse;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		
		int num = input.nextInt();
		
		for(int i = 2; i<=num/2;i++){
			if(num%i==0){
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println(num+" is a Prime Number.");
		}else{
			System.out.println(num+" is not a Prime Number.");
		}
	

	}

}

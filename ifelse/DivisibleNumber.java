package in.co.ifelse;
import java.util.Scanner;
public class DivisibleNumber {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int num = input.nextInt();
		
		if((num%7==0)&&(num%5==0)){
			System.out.println("Divisible");
		}else{
			System.out.println("Non Divisible");
		}
	}
}

package in.co.ifelse;
import java.util.Scanner;
public class FactorialWhileLoop {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int num = input.nextInt();
		int fact = 1;
		int i=1;
		while(i<=num){
			fact=fact*i;
			System.out.println("Factorials : "+fact);
			i++;
		}
	}

}

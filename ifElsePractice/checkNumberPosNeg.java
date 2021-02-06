package in.co.ifElsePractice;
import java.util.Scanner;
public class checkNumberPosNeg {
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int num = s.nextInt();
		if(num>0){
			System.out.println("Number is Positive.");
		}else if(num<0){
			System.out.println("Number is Negative.");
		}else{
			System.out.println("Number is Zero.");
		}
	}

}

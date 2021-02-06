package in.co.ifElsePractice;
import java.util.Scanner;
public class checkDiscount {
	private static Scanner s;

	public static void main(String []args){
		s = new Scanner(System.in);
		System.out.println("Enter Quantity:");
		int x = s.nextInt();
		
		if((x*100)>1000){
			System.out.println("You got a Discount of "+(.1*x*100)+"And your Total Cost is "+((x*100)-(.1*x*100)));
		}else{
			System.out.println("No Discount.");
		}
	}

}

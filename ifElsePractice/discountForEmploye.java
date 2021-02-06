package in.co.ifElsePractice;
import java.util.Scanner;
public class discountForEmploye {
	private static Scanner s;

	public static void main(String []args){
		s = new Scanner(System.in);
		System.out.println("Enter Year :");
		int year = s.nextInt();
		
		
		if(year>5){
			System.out.println("Enter Salary");
			int salary = s.nextInt();
			System.out.println("You got bonus of"+(.05*salary)+"And your total salary is "+(salary+(.05*salary)));
		}else{
			System.out.println("No Bonus");
		}
	}

}

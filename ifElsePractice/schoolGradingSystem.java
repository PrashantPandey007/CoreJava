package in.co.ifElsePractice;
import java.util.Scanner;
public class schoolGradingSystem {
	private static Scanner s;

	public static void main(String []args){
		s = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks = s.nextInt();
		if(marks>80){
			System.out.println("Grade A");
		}else if(marks<80&&marks>60){
			System.out.println("Grade B");
		}else if(marks<60&&marks>50){
			System.out.println("Grade C");
		}else if(marks<50&&marks>45){
			System.out.println("Grade D");
		}else if(marks<45&&marks>25){
			System.out.println("Grade E");
		}else if(marks<25){
			System.out.println("Grade F");
		}
	}

}

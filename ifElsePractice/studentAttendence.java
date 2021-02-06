package in.co.ifElsePractice;
import java.util.Scanner;
public class studentAttendence {
	
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Classes Held :");
		int classes = s.nextInt();
		System.out.println("Enter Class Attendence :");
		int attendence = s.nextInt();
		
		double percent = (attendence*100)/classes;
		
		if(percent>75.0){
			System.out.println("Student can sit in the Exam Hall");
		}else{
			System.out.println("Student cannot sit in the Exam Hall");
		}
	}

}

package in.co.ifElsePractice;
import java.util.Scanner;
public class getDayName {
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int day = s.nextInt();
		
		System.out.println(getDayNamee(day));
	}
	public static String getDayNamee(int day){
		String dayName = " ";
		switch (day){
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tuesday"; break;
		case 3: dayName = "Wednesday"; break;
		case 4: dayName = "Thursday"; break;
		case 5: dayName = "Friday"; break;
		case 6: dayName = "Saturday"; break;
		case 7: dayName = "sunday"; break;
		default: dayName = "Invalid day range";
		}
		return dayName;
	}

}

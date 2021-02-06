package in.co.ifElsePractice;
import java.util.Scanner;
public class numberOfDaysInAMonth {
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		
		int number_OfDaysInMonth = 0;
		String monthOfName = "Unknown";
		
		System.out.println("Enter Month Number : ");
		int month = s.nextInt();
		
		System.out.println("Enter Year : ");
		int year = s.nextInt();
		
		switch(month){
		case 1: 
			monthOfName = "January";
			number_OfDaysInMonth = 31;
			break;
		case 2:
			monthOfName = "February";
			if((year%400==0)||(year%4==0)&&(year%100!=0)){
				number_OfDaysInMonth = 29;
			}else{
				number_OfDaysInMonth = 28;
			}
			break;
		case 3:
			monthOfName = "March";
			number_OfDaysInMonth = 31;
			break;
		case 4:
			monthOfName = "April";
			number_OfDaysInMonth = 30;
			break;
		case 5:
			monthOfName = "May";
			number_OfDaysInMonth = 31;
			break;
		case 6:
			monthOfName = "June";
			number_OfDaysInMonth = 30;
			break;
		case 7:
			monthOfName = "July";
			number_OfDaysInMonth = 31;
			break;
		case 8:
			monthOfName = "Augast";
			number_OfDaysInMonth = 31;
			break;
		case 9:
			monthOfName = "September";
			number_OfDaysInMonth = 30;
			break;
		case 10:
			monthOfName = "October";
			number_OfDaysInMonth = 31;
			break;
		case 11:
			monthOfName = "November";
			number_OfDaysInMonth = 30;
			break;
		case 12:
			monthOfName = "December";
			number_OfDaysInMonth = 31;
			break;
		}
		System.out.println(monthOfName+" "+year+" has "+ number_OfDaysInMonth+" days ");
	}

}

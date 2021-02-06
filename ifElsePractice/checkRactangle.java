package in.co.ifElsePractice;
import java.util.Scanner;
public class checkRactangle {
	private static Scanner s;

	public static void main(String []args){
		s = new Scanner(System.in);
		System.out.println("Enter Length :");
		int x = s.nextInt();
		
		System.out.println("Enter Breadth");
		int y = s.nextInt();
		
		if(x==y){
			System.out.println("This is a Square.");
		}else{
			System.out.println("This is a Ractangle");
		}
	}

}

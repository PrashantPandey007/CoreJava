package in.co.rays;
import java.util.Scanner;
public class Table {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num = input.nextInt();
		int a = 1;
		int tablee = 0;
		while(a<=10){
			tablee = num*a;
			System.out.println(num+" * "+a+" = "+tablee);
			a++;
		}
	}

}

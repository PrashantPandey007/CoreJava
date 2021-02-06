package in.co.ifelse;

import java.util.Scanner;

public class OddEvenn {
	
	public static void main(String[] args) {
		
		int i = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Any Number : ");
		
		int num = input.nextInt();
		
		switch(num){
		
		case 1:
			while(i<=20){
				if(num%2==0){
					System.out.println("Even Number");
					
				}else{
					System.out.println("Odd");
				}
			}
			}
		}
		
		
	}



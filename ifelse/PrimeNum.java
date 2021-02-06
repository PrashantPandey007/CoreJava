package in.co.ifelse;

public class PrimeNum {
	public static void main(String []args){
		int i,a=0,d=0;
		int b=191;
		a = b/2;
		if(b==0||b==1){
			System.out.println(b+" is not a prime number.");
		}else{
			for(i = 2; i <= a ; i++){
				if(b%i==0){
					System.out.println(b+" is not a prime number.");
					
					d = 1;
					break;
				}
			}if(d==0){
				System.out.println(b+" is a prime number.");
			}
		}
	}

}

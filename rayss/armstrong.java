package in.co.rayss;

public class armstrong {
	public static void main(String []args){
		int num = 371, OriginalNum, remainder, result = 0;
		OriginalNum = num;
		
		while(OriginalNum != 0){
			remainder = OriginalNum%10;
			result = (int) (result + Math.pow(remainder,3));
			OriginalNum /= 10;
		}
		if(result==num){
			System.out.println("This is Armstrong Number.");
		}else{
			System.out.println("This is not a Armstrong Number.");
		}
		
	}

}

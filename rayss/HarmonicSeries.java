package in.co.rayss;

public class HarmonicSeries {
	public static void main(String []args){
		int number = 4;
		
	System.out.println("The harmonic series is :");
	
	double result = 0.0;
	
	while(number > 0){
		result = result+(double)1/number;
		number--;
		System.out.println(result+"");
		
	}
	System.out.println("The output of Harmonic series is :"+ result);
	}
}

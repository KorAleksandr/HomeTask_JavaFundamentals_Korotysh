package by.kas.branching_app.main;

//**************************************************************************************
// Подсчитать количество отрицательных среди чисел а, b, с.
//**************************************************************************************

public class Task18 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		int result = 0;
	
		a = ScannerData.enterDouble("Enter 1st number: " );
		b = ScannerData.enterDouble("Enter 2nd number: " );		
		c = ScannerData.enterDouble("Enter 3rd number: " );
		
		if ( a < 0 ) {
			result++;
		}
		
		if ( b < 0 ) {
			result++;
		}		

		if ( c < 0 ) {
			result++;
		}
		
		System.out.println(result + " negative numbers entered");
	}

}

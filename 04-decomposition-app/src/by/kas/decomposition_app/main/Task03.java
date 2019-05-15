package by.kas.decomposition_app.main;

//**************************************************************************************
// Написать метод(методы) для нахождения наибольшего общего делителя четырех
// натуральных чисел.
//**************************************************************************************

public class Task03 {

	public static void main(String[] args) {
		final int quantity = 4;
		int[] array = new int[4];
		
		int result;
	
		for (int i = 0; i < quantity; i++)
		while ( array[i] < 1 ) {
			array[i] = ScannerData.enterInt("Enter number_" + (i + 1) + " > 0 :" );
		}
		
		result = gcdForFewNumbers( array, quantity );
		
		System.out.println("GCD: " + result);

	}

	public static int greatestCommonDivisor(int A, int B) { // вычисление НОД для А и B
		while (A != 0 && B != 0 ) {
		    if ( A > B )  {
		        A = A % B;
		    } else {
		        B = B % A;
		    }
		}
		
		return A + B;
	}
	
	public static int gcdForFewNumbers(int[] array, int n) { // вычисление НОД для N чисел
		int result;
		
		result = array[0];
		for (int i = 1; i < n; i++) {
			result = greatestCommonDivisor(result, array[i]);
		}
		
		return result;
	}
	
}

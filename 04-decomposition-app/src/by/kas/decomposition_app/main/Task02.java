package by.kas.decomposition_app.main;

//**************************************************************************************
// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
// общего кратного двух натуральных чисел:
// 						НОК(А,В) = A * B / НОД (А,В)
//**************************************************************************************

public class Task02 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		
		int result;
	
		while (A < 1 ) {
			A = ScannerData.enterInt("Enter A > 0: " );
		}
		
		while (B < 1 ) {
			B = ScannerData.enterInt("Enter B > 0: " );
		}
		
		result = greatestCommonDivisor(A, B);
		System.out.println("GCD: " + result);
		
		result = leastСommonMultiple( A, B, result );
		System.out.println("LCM: " + result);
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

	public static int leastСommonMultiple(int A, int B, int GCD) { // вычисление НОК для А и B
		return A * B / GCD;
	}
}

package by.kas.cycles_app.main;

//**************************************************************************************
// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
// больше или равен заданному е. Общий член ряда имеет вид:
//		An = 1 /pow(2, n) + 1 / pow(3, n)
//**************************************************************************************

public class Task19 {

	public static void main(String[] args) {
		double e;
		double a;
		
		double sum;
		
		e = 0;
		while ( e <= 0) {
			e = ScannerData.enterDouble("Enter a positive e: " );
		}
		
		sum = 0;
		for ( int n = 1; ; n++ ) {
			a = calcFunc(n);
			
			if ( a >= e ) {
				sum = sum + a;
			} else {
				break;
			}
		}
		
		System.out.println("Sum = " + sum);

	}

	public static double calcFunc(double n) {
		return (1 / Math.pow(2, n) + 1 / Math.pow(3, n));
	}	
	
}

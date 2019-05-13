package by.kas.cycles_app.main;

//**************************************************************************************
// Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
// Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по
// сравнению с введенным числом.
//**************************************************************************************

public class Task24 {

	public static void main(String[] args) {
		
		long n;
		
		long result;
		long sum;
		
		long temp;
		
		n = 0;
		while ( n <= 0 ) {
			n = ScannerData.enterInt("Enter a positive number: " );
		}
		
		result = 0;
		sum = 0;
		do  {
			temp = n % 10;
			n = n / 10;
			
			result = result * 10 + temp;
			
			if ( temp % 2 == 0 ) {
				sum = sum + temp;
			}
		} while ( n > 0 );
		
		System.out.println("Result = " + result);
		System.out.println("Sum of even numbers: " + sum);
				
	}

}

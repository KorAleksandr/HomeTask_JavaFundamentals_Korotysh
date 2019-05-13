package by.kas.cycles_app.main;

//**************************************************************************************
// Напишите программу, где пользователь вводит любое целое положительное число. А
// программа суммирует все числа от 1 до введенного пользователем числа.
//**************************************************************************************

public class Task6 {

	public static void main(String[] args) {
		int n = 0;
		
		int sum = 0;
	
		while ( n <= 0 ) {
			n = ScannerData.enterInt("Enter a positive number: " );
		}
		
		for ( int i = 1; i <= n; i++ ) {
			sum = sum + i;
		}

		System.out.println("Sum = " + sum);
	}

}

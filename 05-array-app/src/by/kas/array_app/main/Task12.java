package by.kas.array_app.main;

import java.util.Random;

//**************************************************************************************
// Задана последовательность N натуральных чисел. Вычислить сумму чисел,
// порядковые номера которых являются простыми числами.
//**************************************************************************************

public class Task12 {

	public static void main(String[] args) {
		int[] array = new int[100];
		long sum;

		arrayUintFill(array);
		
		sum = 0;
		for( int i = 0; i < array.length; i++ ) {
			if ( isSimpleNumber(i) == true)  {
				sum = sum + array[i];
				System.out.print(i + " ");	// вывод индексов, которые являются простыми
			}
		}

		System.out.println();
		System.out.println("Sum = " + sum);

	}
	
	public static boolean isSimpleNumber(int num) { // заполняет массив числами в диапазоне 1...1000
		boolean result = true;
		
		if ( num < 2 ) {
			return false;
		}
		
		for ( int i = 2; i <= Math.sqrt(num); i++) {
			if ( num % i == 0) {
                result = false;
                break;
			}       
		}	
		
		return result;
	}

	public static void arrayUintFill(int[] array) { // заполняет массив числами в диапазоне 1...1000
		Random rand = new Random();
		
		for( int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextInt(1000);
		}
	}	
	
}

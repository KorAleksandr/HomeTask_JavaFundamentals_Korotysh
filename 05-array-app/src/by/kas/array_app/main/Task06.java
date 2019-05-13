package by.kas.array_app.main;

import java.util.Random;

//**************************************************************************************
// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси,
// содержащую все эти числа.
//**************************************************************************************

public class Task06 {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		int min = Integer.MAX_VALUE;
		int max = 0;
		int result;

		arrayUintFill(array);
		
		for( int i = 0; i < array.length; i++ ) { // ищем минимальное и максимальное значения
			if ( min > array[i] ) {
				min = array[i];
			}
			
			if ( max < array[i] ) {
				max = array[i];
			}			
		}
		
		result = max - min;
		System.out.print("Distance = " + result);
	}
	
	public static void arrayUintFill(int[] array) { // заполняет массив числами в диапазоне 1...1000
		Random rand = new Random();
		
		for( int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextInt(1000);
		}
	}	

}

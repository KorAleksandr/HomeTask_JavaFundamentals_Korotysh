package by.kas.array_app.main;

import java.util.Random;

//**************************************************************************************
// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший
// элементы.
//**************************************************************************************

public class Task09 {

	public static void main(String[] args) {
		double[] array = new double[10];
		
		int minIndex = 0;
		int maxIndex = 0;
		
		double temp;

		arrayDoubleFill(array);
		
		for( int i = 0; i < array.length; i++ ) { // ищем минимальное и максимальное значения
			if ( array[minIndex] > array[i] ) {
				minIndex = i;
			}
			
			if ( array[maxIndex] < array[i] ) {
				maxIndex = i;
			}			
		}
		
		
		arrayPrint(array);						// выводим исходный массив
		
		// меняем местами маx и min
		temp = array[maxIndex];
		array[maxIndex] = array[minIndex];
		array[minIndex] = temp; 
		
		arrayPrint(array); 						// выводим массив после перестановки
	}
	
	public static void arrayDoubleFill(double[] array) { // заполняет массив числами в диапазоне 1...1000
		Random rand = new Random();
		
		for( int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextDouble();
		}
	}	
	
	
	public static void arrayPrint(double[] array) { // выводит в консоль, указанный массив
		for( int i = 0; i < array.length; i++ ) { 
			System.out.print(array[i] + " ");
		}
		
		System.out.println();		
	}

}

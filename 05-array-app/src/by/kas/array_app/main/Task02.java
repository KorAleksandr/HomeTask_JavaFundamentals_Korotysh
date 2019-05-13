package by.kas.array_app.main;

import java.util.Random;

//**************************************************************************************
// ¬ целочисленной последовательности есть нулевые элементы. —оздать массив из номеров
// этих элементов.
//**************************************************************************************

public class Task02 {

	public static void main(String[] args) {
		int[] array = new int[1000];

		arrayUintFill(array);
		
		int j = 0;
		for( int i = 0; i < array.length; i++ ) { // считаем к-во нулевых элементов в массиве
			if ( array[i] == 0) {
				j++;
			}
		}
		
		int[] arrayZero = new int[j];			// создаем массив под найденное к-во нулевых элементов
		j = 0;
		for( int i = 0; i < array.length; i++ ) { // заполне€ем массив
			if ( array[i] == 0) {
				arrayZero[j] = i;
				j++;
			}
		}		
		
		for( int i = 0; i < arrayZero.length; i++ ) {
			System.out.print(arrayZero[i] + " ");
		}
	}
	
	public static void arrayUintFill(int[] array) { // заполн€ет массив числами в диапазоне 1...1000
		Random rand = new Random();
		
		for( int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextInt(100);
		}
	}

}
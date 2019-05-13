package by.kas.array_app.main;

import java.util.Random;

//**************************************************************************************
// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны
// данному К.
//**************************************************************************************

public class Task01 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int K = 11;
		int sum;

		arrayUintFill(array);
		
		sum = 0;
		for( int i = 0; i < array.length; i++ ) {
			if ( array[i] % K == 0) {
				sum = sum + array[i];
			}
		}
		
		System.out.println("Sum = " + sum);
	}
	
	public static void arrayUintFill(int[] array) { // заполняет массив числами в диапазоне 1...1000
		Random rand = new Random();
		
		for( int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextInt(1000);
		}
	}

}

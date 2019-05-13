package by.kas.array_app.main;

import java.util.Random;

//**************************************************************************************
// ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� � ����������
// ��������.
//**************************************************************************************

public class Task09 {

	public static void main(String[] args) {
		double[] array = new double[10];
		
		int minIndex = 0;
		int maxIndex = 0;
		
		double temp;

		arrayDoubleFill(array);
		
		for( int i = 0; i < array.length; i++ ) { // ���� ����������� � ������������ ��������
			if ( array[minIndex] > array[i] ) {
				minIndex = i;
			}
			
			if ( array[maxIndex] < array[i] ) {
				maxIndex = i;
			}			
		}
		
		
		arrayPrint(array);						// ������� �������� ������
		
		// ������ ������� ��x � min
		temp = array[maxIndex];
		array[maxIndex] = array[minIndex];
		array[minIndex] = temp; 
		
		arrayPrint(array); 						// ������� ������ ����� ������������
	}
	
	public static void arrayDoubleFill(double[] array) { // ��������� ������ ������� � ��������� 1...1000
		Random rand = new Random();
		
		for( int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextDouble();
		}
	}	
	
	
	public static void arrayPrint(double[] array) { // ������� � �������, ��������� ������
		for( int i = 0; i < array.length; i++ ) { 
			System.out.print(array[i] + " ");
		}
		
		System.out.println();		
	}

}

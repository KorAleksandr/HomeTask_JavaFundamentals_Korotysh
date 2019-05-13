package by.kas.array_app.main;

import java.util.Random;

//**************************************************************************************
// ���� ������������������ ����� �1 ,�2 ,..., ��. ������� ���������� ����� �������� ���,
// ���������� ��� ��� �����.
//**************************************************************************************

public class Task06 {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		int min = Integer.MAX_VALUE;
		int max = 0;
		int result;

		arrayUintFill(array);
		
		for( int i = 0; i < array.length; i++ ) { // ���� ����������� � ������������ ��������
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
	
	public static void arrayUintFill(int[] array) { // ��������� ������ ������� � ��������� 1...1000
		Random rand = new Random();
		
		for( int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextInt(1000);
		}
	}	

}

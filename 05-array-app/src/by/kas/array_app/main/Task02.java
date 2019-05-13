package by.kas.array_app.main;

import java.util.Random;

//**************************************************************************************
// � ������������� ������������������ ���� ������� ��������. ������� ������ �� �������
// ���� ���������.
//**************************************************************************************

public class Task02 {

	public static void main(String[] args) {
		int[] array = new int[1000];

		arrayUintFill(array);
		
		int j = 0;
		for( int i = 0; i < array.length; i++ ) { // ������� �-�� ������� ��������� � �������
			if ( array[i] == 0) {
				j++;
			}
		}
		
		int[] arrayZero = new int[j];			// ������� ������ ��� ��������� �-�� ������� ���������
		j = 0;
		for( int i = 0; i < array.length; i++ ) { // ���������� ������
			if ( array[i] == 0) {
				arrayZero[j] = i;
				j++;
			}
		}		
		
		for( int i = 0; i < arrayZero.length; i++ ) {
			System.out.print(arrayZero[i] + " ");
		}
	}
	
	public static void arrayUintFill(int[] array) { // ��������� ������ ������� � ��������� 1...1000
		Random rand = new Random();
		
		for( int i = 0; i < array.length; i++ ) {
			array[i] = rand.nextInt(100);
		}
	}

}
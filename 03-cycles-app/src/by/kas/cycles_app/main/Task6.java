package by.kas.cycles_app.main;

//**************************************************************************************
// �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. �
// ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.
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

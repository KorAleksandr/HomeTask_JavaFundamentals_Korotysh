package by.kas.linear_app.main;

//**************************************************************************************
// �������� ��� ��� ������� ������. � n ����� ������� 80 � ������. ������� ������
// ������ � m ������� �������, ���� � ������ ������� ������ �� 12 �. ������, ��� � �����?
//**************************************************************************************

public class Task06 {
	
	public static void main(String[] args) {
		double n;
		double m;
		
		n = ScannerData.enterDouble("Enter n: " );
		m = ScannerData.enterDouble("Enter m: " );
		
		System.out.println( "Milk in large cans of " + ((80/n + 12) * m) + " liters");
	}	

}

package by.kas.branching_app.main;

//**************************************************************************************
// ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� ��
// ����� ������.
//
// ���������� ��������� ������, ���������� ����� ��� �����:
// (x - x1)/(x2 - x1) = (y - y1)/(y2 - y1)
//**************************************************************************************

public class Task29 {

	public static void main(String[] args) {
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double x3;
		double y3;
		
		double result1;
		double result2;		
	
		x1 = ScannerData.enterDouble("Enter x1: " );
		y1 = ScannerData.enterDouble("Enter y1: " );
		
		x2 = ScannerData.enterDouble("Enter x2: " );
		y2 = ScannerData.enterDouble("Enter y2: " );
		
		x3 = ScannerData.enterDouble("Enter x3: " );
		y3 = ScannerData.enterDouble("Enter y3: " );
		
		result1 = (x3 - x1)/(x2 - x1);
		result2 = (y3 - y1)/(y2 - y1);
		
		if ( result1 == result2 ) {
			System.out.println("Points lie on one line");
		} else {
			System.out.println("Points do not lie on one line");
		}

	}

}

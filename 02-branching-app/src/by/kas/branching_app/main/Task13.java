package by.kas.branching_app.main;

//**************************************************************************************
// ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������, ������� ��
// ����� ��������� ����� � ������ ���������.
//**************************************************************************************

public class Task13 {

	public static void main(String[] args) {
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double distance1;
		double distance2;
	
		x1 = ScannerData.enterDouble("Enter x1: " );
		y1 = ScannerData.enterDouble("Enter y1: " );
		
		x2 = ScannerData.enterDouble("Enter x2: " );
		y2 = ScannerData.enterDouble("Enter y2: " );
		
		distance1 = Math.hypot(x1, y1);			// ���������� �� ������ ��������� ��� ����� x1, y1
		distance2 = Math.hypot(x2, y2);			// ���������� �� ������ ��������� ��� ����� x1, y1
		
		if ( distance1 < distance2 )
			System.out.println("Point x1, y1 closer ");
		else
			System.out.println("Point x2, y closer ");
		
	}

}

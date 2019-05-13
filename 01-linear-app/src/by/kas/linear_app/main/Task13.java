package by.kas.linear_app.main;

//**************************************************************************************
// ������ ���������� ���� ������ ������������ (�1 �2),(�2, �2) ),(�3, �3). ����� ���
// �������� � �������
//**************************************************************************************

public class Task13 {

	public static void main(String[] args) {
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double x3;
		double y3;		
		
		double side1;
		double side2;
		double side3;
		
		double p;
	
		x1 = ScannerData.enterDouble("Enter x1: " );
		y1 = ScannerData.enterDouble("Enter y1: " );
		
		x2 = ScannerData.enterDouble("Enter x2: " );
		y2 = ScannerData.enterDouble("Enter y2: " );
		
		x3 = ScannerData.enterDouble("Enter x3: " );
		y3 = ScannerData.enterDouble("Enter y3: " );				
		
		side1 = sideLength( x1 - x2, y1 - y2 );			// ����� 1-�� ������� ������������
		side2 = sideLength( x1 - x3, y1 - y3 );			// ����� 2-�� ������� ������������
		side3 = sideLength( x2 - x3, y2 - y3 );			// ����� 3-�� ������� ������������
	
		p = side1 + side2 + side3;
		System.out.println("Perimeter of a triangle = " + p);
	
		// ������ ������� ������������ �� ������� ������ S = sqrt(p(p - a)(p - b)(p - c)), ��� p = (a + b + c)/2
		p = p / 2;
		System.out.println("Area of a triangle = " + Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
	}
	
	// ������ ���������� ����� ����� �������
	public static double sideLength( double deltaX, double deltaY ) {	
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}

}

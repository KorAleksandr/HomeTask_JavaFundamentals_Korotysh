package by.kas.linear_app.main;

//**************************************************************************************
// ������� �������� �������: z = 2 * x + ( y � 2 ) * 5
//**************************************************************************************
public class Task03 {
	
	public static void main(String[] args) {
		double x;
		double y;
		
		x = ScannerData.enterDouble("Enter x: " );
		y = ScannerData.enterDouble("Enter y: " );
		
		System.out.println("2 * x + (y - 2) * 5 = " + (2 * x + (y - 2) * 5));
	}
	
}

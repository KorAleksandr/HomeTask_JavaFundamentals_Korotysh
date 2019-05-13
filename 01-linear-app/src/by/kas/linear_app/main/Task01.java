package by.kas.linear_app.main;

//**************************************************************************************
// Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и
// частное
//**************************************************************************************
public class Task01 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x = ScannerData.enterDouble("Enter x: " );
		y = ScannerData.enterDouble("Enter y: " );
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
	}
}

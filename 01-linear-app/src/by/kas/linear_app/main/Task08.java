package by.kas.linear_app.main;

//**************************************************************************************
// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (b + sqrt(b^2 + 4ac)) / 2a - a^3 + b^-2
//**************************************************************************************

public class Task08 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;
		
		a = ScannerData.enterDouble("Enter a: " );
		b = ScannerData.enterDouble("Enter b: " );
		c = ScannerData.enterDouble("Enter c: " );
		
		z = b + Math.sqrt(b * b + 4 * a * c);
		z = z / (2 * a);
		z = z - Math.pow(a, 3) + Math.pow(b, -2);
		
		System.out.println("(b + sqrt(b^2 + 4ac)) / 2a - a^3 + b^-2) = " + z);
	}	
	
}

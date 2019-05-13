package by.kas.linear_app.main;

//**************************************************************************************
// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов
//**************************************************************************************

public class Task11 {
	
	public static void main(String[] args) {	
		double a;
		double b;
		double c;
	
		a = ScannerData.enterDouble("Enter a: " );
		b = ScannerData.enterDouble("Enter b: " );
	
		System.out.println("Area of a triangle = " + (a * b / 2));
	
		c = Math.sqrt(a * a + b * b);
	
		System.out.println("Hypotenuse = " + c);
	}
}
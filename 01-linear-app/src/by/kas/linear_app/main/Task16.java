package by.kas.linear_app.main;

//**************************************************************************************
// Найти произведение цифр заданного четырехзначного числа.
//**************************************************************************************

public class Task16 {

	public static void main(String[] args) {
		int x = 0;
		int z;
		
		do {
			x = ScannerData.enterInt("Enter four digits: " );
		} while ( x < 1000 || x > 9999 );
		
		z = x % 10;
		x = x / 10;
		z = z * (x % 10);
		x = x / 10;
		z = z * (x % 10);
		x = x / 10;		
		z = z * (x % 10);
		
		System.out.println("Result = " + z);
	}
}

package by.kas.cycles_app.main;

//**************************************************************************************
// Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
//**************************************************************************************

public class Task13 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		double step = 0.5;
		double lowPoint = -5;
		double hiPoint = 5;
		
		System.out.println("   x        y");
		
		x = lowPoint;
		while ( x <= hiPoint ) {
			y = calcFunc(x);
			
			System.out.printf("%4.1f %8.4f %n", x, y);
			
			x = x + step;
		}
	}
	
	public static double calcFunc(double x) {
		return 5 - x * x / 2;
	}

}

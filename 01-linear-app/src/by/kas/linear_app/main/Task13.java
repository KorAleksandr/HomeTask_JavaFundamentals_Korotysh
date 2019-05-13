package by.kas.linear_app.main;

//**************************************************************************************
// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его
// периметр и площадь
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
		
		side1 = sideLength( x1 - x2, y1 - y2 );			// длина 1-ой стороны треугольника
		side2 = sideLength( x1 - x3, y1 - y3 );			// длина 2-ой стороны треугольника
		side3 = sideLength( x2 - x3, y2 - y3 );			// длина 3-ей стороны треугольника
	
		p = side1 + side2 + side3;
		System.out.println("Perimeter of a triangle = " + p);
	
		// расчет площади треугольника по формуле Герона S = sqrt(p(p - a)(p - b)(p - c)), где p = (a + b + c)/2
		p = p / 2;
		System.out.println("Area of a triangle = " + Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
	}
	
	// расчет расстояния между двумя точками
	public static double sideLength( double deltaX, double deltaY ) {	
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}

}

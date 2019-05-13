package by.kas.branching_app.main;

//**************************************************************************************
// Даны два угла треугольника (в градусах). Определить, существует ли такой
// треугольник, и если да, то будет ли он прямоугольным
//**************************************************************************************

public class Task14 {

	public static void main(String[] args) {
		double angle1;
		double angle2;
	
		angle1 = ScannerData.enterDouble("Enter 1st angle: " );
		angle2 = ScannerData.enterDouble("Enter 2nd angle: " );
		
		if ( angle1 + angle2 >= 180 ) {
			System.out.println("The triangle does not exist");
		} else {
			if ( 180 - (angle1 + angle2) == 90 ) {
				System.out.println("This triangle is rectangular");
			} else {
				System.out.println("This triangle is not rectangular");
			}
		}

	}

}

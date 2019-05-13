package by.kas.linear_app.main;

//**************************************************************************************
//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
// • Целое число N является четным двузначным числом
//**************************************************************************************

public class Task37 {

	public static void main(String[] args) {
		int x = 0;
		
		boolean d = true;
		boolean temp;
		
		x = ScannerData.enterInt("Enter integer: " );
		
		temp = (x % 2) != 1 ? true : false;		// проверяем на четность
		d = d & temp;
		temp = x > 9 ? true : false;			// проверяем на двузначность
		d = d & temp;
		temp = x < 100 ? true : false;			// проверяем на двузначность		
		d = d & temp;		
		
		System.out.println(d);		
	}

}

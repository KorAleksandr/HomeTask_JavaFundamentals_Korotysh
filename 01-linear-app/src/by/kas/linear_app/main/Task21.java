package by.kas.linear_app.main;

//**************************************************************************************
// ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой
// част€х). ѕомен€ть местами дробную и целую части числа и вывести полученное значение
// числа
//**************************************************************************************

public class Task21 {

	public static void main(String[] args) {
		double R;
		int temp;
		float z;
	
		R = ScannerData.enterDouble("Enter a number in the form nnn.ddd: " );
	
		temp = (int)R;
		z = (float)(R - temp);
		z = z * 1000;
		z = z + (float)temp / 1000;
		
		System.out.println("Result = " + z);
	}
}

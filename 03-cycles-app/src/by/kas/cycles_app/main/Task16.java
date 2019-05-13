package by.kas.cycles_app.main;

//**************************************************************************************
// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
//**************************************************************************************

public class Task16 {

	public static void main(String[] args) {
		
		int sum = 0;
		long result = 1;

		for ( int i = 1; i <= 10; i++ ) {
			sum = sum + i;
			result = result * sum;
		}

		System.out.println("Result = " + result);
	}

}

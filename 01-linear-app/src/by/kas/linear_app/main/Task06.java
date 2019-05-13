package by.kas.linear_app.main;

//**************************************************************************************
// Ќаписать код дл€ решени€ задачи. ¬ n малых бидонах 80 л молока. —колько литров
// молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
//**************************************************************************************

public class Task06 {
	
	public static void main(String[] args) {
		double n;
		double m;
		
		n = ScannerData.enterDouble("Enter n: " );
		m = ScannerData.enterDouble("Enter m: " );
		
		System.out.println( "Milk in large cans of " + ((80/n + 12) * m) + " liters");
	}	

}

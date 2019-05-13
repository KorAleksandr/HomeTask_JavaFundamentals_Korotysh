package by.kas.linear_app.main;

//**************************************************************************************
//¬вести любой символ и определить его пор€дковый номер, а также указать предыдущий
//и последующий символы.
//**************************************************************************************

public class Task33 {

	public static void main(String[] args) {
		String s;
		char symbol;
		int num;
		
		do {
			s = ScannerData.enterString("Enter character: ");
		} while ( s.length() != 1 );		
		
		symbol = s.charAt(0);
		num = symbol;
		System.out.println("Serial number: " + num);
		System.out.println("Previous character: " + (char)(num - 1));
		System.out.println("Next character: " + (char)(num + 1));
	}

}

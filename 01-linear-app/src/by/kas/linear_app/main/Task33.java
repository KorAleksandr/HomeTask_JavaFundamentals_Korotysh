package by.kas.linear_app.main;

//**************************************************************************************
//������ ����� ������ � ���������� ��� ���������� �����, � ����� ������� ����������
//� ����������� �������.
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

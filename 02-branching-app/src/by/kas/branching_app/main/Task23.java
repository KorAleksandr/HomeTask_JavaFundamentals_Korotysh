package by.kas.branching_app.main;

//**************************************************************************************
// ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� �
// �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.
//**************************************************************************************

public class Task23 {

	public static void main(String[] args) {
		int day;
		int month;
		
		boolean result;
	
		day = ScannerData.enterInt("Enter day: " );
		month = ScannerData.enterInt("Enter month: " );
		
		result = false;

		if ( month >= 1 && month <= 12 ) { // ���� ����� ������ ���������
			if ( day >= 1 && day <= dayInMonth( month ) ) {
				result = true;
			}
		}
		
		if ( result == true ) {
			System.out.println("Date is correct");
		} else {
			System.out.println("Date is not correct");
		}
	}
	
	public static int dayInMonth(int month) { // ���������� �-�� ���� � ������
		int day;
		
		switch ( month ) {
		case 2:
			day = 28;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;			
		
		default:
			day = 31;
			break;
		}
		
		return day;
	}
}

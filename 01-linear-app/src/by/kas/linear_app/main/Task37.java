package by.kas.linear_app.main;

//**************************************************************************************
//��������� �������� ���������, ���������� �������� true, ���� ���������
//������������ �������� ��������, � false � � ��������� ������:
// � ����� ����� N �������� ������ ���������� ������
//**************************************************************************************

public class Task37 {

	public static void main(String[] args) {
		int x = 0;
		
		boolean d = true;
		boolean temp;
		
		x = ScannerData.enterInt("Enter integer: " );
		
		temp = (x % 2) != 1 ? true : false;		// ��������� �� ��������
		d = d & temp;
		temp = x > 9 ? true : false;			// ��������� �� ������������
		d = d & temp;
		temp = x < 100 ? true : false;			// ��������� �� ������������		
		d = d & temp;		
		
		System.out.println(d);		
	}

}

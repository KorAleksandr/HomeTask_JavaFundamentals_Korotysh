package by.kas.linear_app.main;

//**************************************************************************************
// ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � �����
// ������). �������� ������� ������� � ����� ����� ����� � ������� ���������� ��������
// �����
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

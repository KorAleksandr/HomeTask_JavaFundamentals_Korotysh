package by.kas.array2d_app.main;

public class Task13 {

	public static void main(String[] args) {
		int size = 0;
		
		while ( size < 1 ) {
			size = ScannerData.enterInt("Enter size array > 1 :");
		}
		
		int[][] array = new int[size][size];
		
		int n = 1;
		boolean reverse = false;
		for( int n_line = 0; n_line < size; n_line++ ) {
			for( int n_column = 0; n_column < size; n_column++ ) {
				array[n_line][n_column] = n;
				if ( reverse == true ) {
					n--;
				} else {
					n++;
				}
			}
			
			if (reverse == false) {
				reverse = true;
				n--;
			} else {
				reverse = false;
				n++;
			}
		}
		
		array2Dprint(array, size);
	}
	
	public static void array2Dprint( int[][] array, int n ) { // выводит в консоль, указанный массив n x n
		
		for( int n_line = 0; n_line < n; n_line++ ) {
			for( int n_column = 0; n_column < n; n_column++ ) {
				if ( n < 10) {
					System.out.printf("%d", array[n_line][n_column]);
				} else {
					System.out.printf("%2d ", array[n_line][n_column]);
				}
			}
			
			System.out.println();			
		}		
	}		

}

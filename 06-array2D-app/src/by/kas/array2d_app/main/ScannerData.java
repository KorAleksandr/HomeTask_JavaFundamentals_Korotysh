package by.kas.array2d_app.main;

import java.util.Locale;
import java.util.Scanner;

public class ScannerData {
	public static double enterDouble (String message) {
		double a;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print(message);
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.print(message);
		}
		
		a = sc.nextDouble();
		
		return a;
	}
	
	public static int enterInt (String message) {
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(message);
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		
		a = sc.nextInt();
		
		return a;
	}
	
	public static String enterString (String message) {
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(message);
		s = sc.nextLine();
		
		return s;
	}	
}

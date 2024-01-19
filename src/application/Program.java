package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Category;
import entities.Book;
import entities.enums.BookStatus;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many books would you like to add? ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			
		}
		
		
		
		
		scanner.close();
		
		
	}

}

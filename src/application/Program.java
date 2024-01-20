package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Category;
import entities.Book;
import entities.enums.BookStatus;
import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many books would you like to add? ");
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume the line break
		
		List<Book> books = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Book #" + (i+1) + " Data:");
			
			System.out.print("Name: ");
			
			String name = scanner.nextLine();
			
			System.out.print("Author: ");
			String author = scanner.nextLine();
			
			System.out.print("ID: ");
			int id = scanner.nextInt();
						
			System.out.print("Category: ");
			scanner.nextLine(); // Consume the line break
			String categoryInput = scanner.nextLine();
			
			Category category = new Category(categoryInput);
			
			Book book = new Book(name, author, id, category);
			
			books.add(book);
		}
		
		System.out.println("List of books: ");
		for (Book c : books) {
			System.out.println(c);
		}
		
		
				
		
		scanner.close();
		
		
	}

}

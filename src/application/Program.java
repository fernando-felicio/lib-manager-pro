package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Category;
import entities.Book;
import entities.enums.BookStatus;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many books would you like to add? ");
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume the line break

		List<Book> books = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Book #" + (i + 1) + " Data:");

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

			Book book = new Book(name, author, id, category, BookStatus.AVAILABLE);

			books.add(book);
		}

		System.out.println("List of books: ");
		for (Book c : books) {
			System.out.println(c);
		}

		System.out.print("Enter the ID Which book do you want to rent? ");
		int idToRent = scanner.nextInt();

		Book position = books.stream().filter(x -> x.getId() == idToRent).findFirst().orElse(null);

		for (Book x : books) {
			if (position == null) {
				System.out.println("This book does not exist");
				break;
			} else {
				System.out.print("Do you want to rent the book: " + position.getName() + " ?");
				scanner.nextLine();
			}

			String confirmRent = scanner.nextLine().toLowerCase();
			System.out.println();
			if (confirmRent.charAt(0) == 'y') {
				position.setStatus(BookStatus.UNAVAILABLE);
				System.out.println("Did you rent the book : " + position.getName());
				System.out.println();
				break;
			} else {
				System.out.println("ok, Bye");
				break;
			}
		}

		System.out.println("LIBRARY STATUS:");
		System.out.println("");
		System.out.println("AVAILABLE Books: ");

		for (Book x : books) {
			if (x.getStatus() == BookStatus.AVAILABLE) {
				System.out.println("Name: " + x.getName() + " | ID:  " + x.getId());
			}

		}

		System.out.println("==============");
		System.out.println("UNAVAILABLE Books: ");

		for (Book x : books) {
			if (x.getStatus() == BookStatus.UNAVAILABLE) {
				System.out.println("Name: " + x.getName() + " | ID: " + x.getId());
			}

		}

		scanner.close();

	}

}

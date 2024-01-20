package entities;

public class Book {
	
	private String name;
	private String author;
	private int id;
	private Category category; // Associating the Category class within the Book class
	
	public Book() {
		
	}
	
	public Book (String name, String author, int id, Category category) {
		this.name = name;
		this.author = author;
		this.id = id;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Name : " + this.name + " | Author : " + this.author + " | ID : " + this.id + " | Category : " + this.category + " |";
	}

	
	
	
	


}

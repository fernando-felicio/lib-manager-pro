package entities;

public class Book {
	
	private String name;
	private String author;
	private int id;
	private Category category; // Associating the Category class within the Book class
	
	public Book() {
		
	}
	
	public Book (String name, String author, int id, Category category) {
		
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
	
	
	


}

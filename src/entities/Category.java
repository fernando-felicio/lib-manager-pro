package entities;

public class Category {
	
	private String bookCategory;
	
	
	public Category(String category) {
		this.bookCategory = category;
	}
	
	public String bookCategory() {
		return bookCategory;
	}
	
	public void setCategory( String bookCategory ) {
		this.bookCategory = bookCategory;
	}

	@Override
	public String toString() {
		return bookCategory;
	}
	
	

}

package app.autowiring.byConstructor.demo;

public class Book {
	private Integer bookId;
	private Float version;
	
	public Book(Integer bookId, Float version, Author author) {
		super();
		this.bookId = bookId;
		this.version = version;
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Author author;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Float getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", version=" + version + ", author="
				+ author + "]";
	}

	public void setVersion(Float version) {
		this.version = version;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	

}

package app.autowiring.byType.demo;

public class Book {
	private Integer bookId;
	private Float version;
	
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

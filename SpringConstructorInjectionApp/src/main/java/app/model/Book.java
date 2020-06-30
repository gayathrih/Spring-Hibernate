package app.model;

public class Book {

	private Integer bookId;
	private String bookName;
	private Float version;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String bookName, Float version) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.version = version;
	}
	
	public Book(String bookName,Integer bookId,  Float version) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.version = version;
	}

	public Integer getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}
	public Float getVersion() {
		return version;
	}
	

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", version=" + version + "]";
	}

}

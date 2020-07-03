package app.beanlifecycle.withoutcallbackmethods;

public class Book {

	private Integer bookId;
	private String bookName;
	private Float version;

	

	public Integer getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}
	public Float getVersion() {
		return version;
	}
	
	
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setVersion(Float version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", version=" + version + "]";
	}
	public void initBean(){
		System.out.println("Book...initlization...");
	}
	
	public void destroyBean(){
		System.out.println("Book...destroy.....");
	}
}

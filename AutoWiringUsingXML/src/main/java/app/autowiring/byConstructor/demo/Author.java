package app.autowiring.byConstructor.demo;

public class Author {
	
	private String authorName;
	private String gonels;
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String authorName, String gonels) {
		super();
		this.authorName = authorName;
		this.gonels = gonels;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getGonels() {
		return gonels;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", gonels=" + gonels + "]";
	}
	public void setGonels(String gonels) {
		this.gonels = gonels;
	}
	
	
	
	

}

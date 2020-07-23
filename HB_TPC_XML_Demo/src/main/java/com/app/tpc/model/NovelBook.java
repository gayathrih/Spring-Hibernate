package com.app.tpc.model;

public class NovelBook extends Book {

	  private String genre;

	public NovelBook() {
		super();
		// TODO Auto-generated constructor stub
	}


	public NovelBook(Integer bid, String bname, String bauthor, Float price,
			String genre) {
		super(bid, bname, bauthor, price);
		this.genre = genre;
	}


	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "NovelBook [genre=" + genre + "]";
	}
	  
	  
}

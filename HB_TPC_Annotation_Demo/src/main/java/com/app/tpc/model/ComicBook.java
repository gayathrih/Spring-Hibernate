package com.app.tpc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ComicBook")
public class ComicBook extends Book {

	  private String cb_publisher;

	public ComicBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ComicBook(Integer bid, String bname, String bauthor, Float price,
			String cb_publisher) {
		super(bid, bname, bauthor, price);
		this.cb_publisher = cb_publisher;
	}



	public String getCb_publisher() {
		return cb_publisher;
	}

	public void setCb_publisher(String cb_publisher) {
		this.cb_publisher = cb_publisher;
	}

	@Override
	public String toString() {
		return "ComicBook [cb_publisher=" + cb_publisher + "]";
	}
	  
	  
}

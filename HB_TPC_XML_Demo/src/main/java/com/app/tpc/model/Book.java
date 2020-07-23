package com.app.tpc.model;

public class Book {
	
	private Integer bid;
	private  String bname;
	private String  bauthor;
	private Float  price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bid, String bname, String bauthor, Float price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.price = price;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor
				+ ", price=" + price + "]";
	}
	
	
	

}

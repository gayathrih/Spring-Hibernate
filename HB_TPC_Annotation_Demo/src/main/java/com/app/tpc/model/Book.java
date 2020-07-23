package com.app.tpc.model;

import javax.persistence.*;

@Entity
@Table(name="New_BOOK")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Book {
	
	@Id
	@Column(name="BID")
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer bid;
	
	@Column(name="BName")
	private  String bname;
	
	@Column(name="BAutor")
	private String  bauthor;
	
	@Column(name="BPrice")
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

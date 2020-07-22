package app.model;

import javax.persistence.*;

@Entity
@Table(name="customer_new_table")
public class Customer {
	
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
	
	@Column(name="cname")
	private String name;
	
	@Column(name="caddress")
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}

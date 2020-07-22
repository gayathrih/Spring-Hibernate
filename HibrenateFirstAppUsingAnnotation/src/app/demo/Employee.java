package app.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpTable")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EmpID")
	Integer eId;
	
	@Column(name="EmpName")
	private String eName;
	
	@Column(name="EmpRole")
	private String eRole;
	
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteRole() {
		return eRole;
	}
	public void seteRole(String eRole) {
		this.eRole = eRole;
	}
	
	
	

}

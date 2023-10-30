package com.files.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="company")
public class Company  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
	private String cname;
	private String cemail;
	private String caddress;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", cname=" + cname + ", cemail=" + cemail + ", caddress=" + caddress + "]";
	}
	public Company(Long id, String cname, String cemail, String caddress) {
		super();
		this.id = id;
		this.cname = cname;
		this.cemail = cemail;
		this.caddress = caddress;
	}
	
	

}

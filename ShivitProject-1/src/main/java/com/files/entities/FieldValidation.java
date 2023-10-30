package com.files.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="field_validation")
public class FieldValidation 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String vname;
	
	@ManyToOne
	@JoinColumn(name="custom_field_id")
	private CustomField customField;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomField getCustomField() {
		return customField;
	}

	public void setCustomField(CustomField customField) {
		this.customField = customField;
	}



	@Override
	public String toString() {
		return "FieldValidation [id=" + id + ", vname=" + vname + ", customField=" + customField + "]";
	}

	public FieldValidation(Long id,String vname, CustomField customField) {
		super();
		this.vname=vname;
		this.id = id;
		this.customField = customField;
	}

	public FieldValidation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

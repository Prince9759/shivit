package com.files.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="field_indexing")
public class FieldIndexing 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="custom_field_id" )
	private CustomField customField;

	private String iname;
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
		return "FieldIndexing [id=" + id + ", customField=" + customField + ", iname=" + iname + "]";
	}

	public FieldIndexing(Long id, String iname,CustomField customField) {
		super();
		this.id = id;
		this.iname=iname;
		this.customField = customField;
	}

	public FieldIndexing() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

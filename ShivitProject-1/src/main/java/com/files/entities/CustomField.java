package com.files.entities;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Table(name="custom_fields")
public class CustomField 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	  private Long moduleId;
	
	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	} 

	@OneToMany(mappedBy = "customField",cascade = CascadeType.ALL)
	private List<FieldValidation> fieldvalidation;
	
	  @OneToOne(mappedBy =  "customField", cascade = CascadeType.ALL)
	    private FieldIndexing fieldIndexing;

	public Long getId() {
		return id; 
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<FieldValidation> getFieldvalidation() {
		return fieldvalidation;
	}

	public void setFieldvalidation(List<FieldValidation> fieldvalidation) {
		this.fieldvalidation = fieldvalidation;
	}

	public FieldIndexing getFieldIndexing() {
		return fieldIndexing;
	}

	public void setFieldIndexing(FieldIndexing fieldIndexing) {
		this.fieldIndexing = fieldIndexing;
	}


	@Override
	public String toString() {
		return "CustomField [id=" + id + ", moduleId=" + moduleId + ", fieldvalidation=" + fieldvalidation
				+ ", fieldIndexing=" + fieldIndexing + "]";
	}

	public CustomField(Long id, Long moduleId,List<FieldValidation> fieldvalidation, FieldIndexing fieldIndexing) {
		super();
		this.id = id;
		this.moduleId=moduleId;
		this.fieldvalidation = fieldvalidation;
		this.fieldIndexing = fieldIndexing;
	}

	public CustomField() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	  

}

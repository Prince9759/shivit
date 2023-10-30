package com.files.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.files.entities.Company;
import com.files.entities.CustomField;
import com.files.service.CompanyService;
import com.files.service.CustomService;

@RestController
@CrossOrigin
public class Controller
{
	@Autowired
	private CustomService cus;
	@Autowired
	private CompanyService com;
	
	
	  @GetMapping("/customfields/{moduleId}")
	    public ResponseEntity<List<CustomField>> getCustomFieldsByModuleId(@PathVariable Long moduleId) {
	        List<CustomField> customFields = cus.getCustomByModuleId(moduleId);
	        return new ResponseEntity<>(customFields, HttpStatus.OK);
	    }
	  
	  
	  
	  @PostMapping("/addcompany")
	    public String addCompany(@RequestBody Company company) {
	        Company result = com.addCompany(company);
	       
	        return "addSuccessfully";
	    }
	
	  @PutMapping("/updatecompany/{companyId}")
	    public String updateCompany(@PathVariable Long companyId, @RequestBody Company company) {
		  
	        return com.updateCompany(companyId, company);
	        
	    }
	  
	  
	   @GetMapping("/allcompany")
	    public ResponseEntity<List<Company>> getAllCompanies(@RequestParam(defaultValue = "0") int page,
	                                                        @RequestParam(defaultValue = "10") int size) {
	        List<Company> companies = com.getAllCompany(page, size);
	        return new ResponseEntity<>(companies, HttpStatus.OK);
	    }
	  
	   @GetMapping("findByid/{id}")
	   public List<Company> getCompanyById(@PathVariable Long id) 
	   {
		   return com.findCompanyByid(id);
	   }
	   
	

}

package com.files.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.files.entities.Company;
import com.files.repository.CompanyRepository;

@Service
public class CompanyService 
{
	@Autowired
	private CompanyRepository companyrepo;
	
	  public Company addCompany(Company company) {
		  System.out.println(company);
	        return companyrepo.save(company);
	    }
	  

	    public String updateCompany(Long companyId, Company company) {
	        Optional<Company> result = companyrepo.findById(companyId);
	        System.out.println(result+"hello");
	        if (result.isPresent()) {
	            Company existingCompany = result.get();
	            System.out.println(company.getId()+"hr"+existingCompany);
	          
	             existingCompany.setCname(company.getCname());
	             existingCompany.setCemail(company.getCemail());
	             existingCompany.setCaddress(company.getCaddress());
	             companyrepo.saveAndFlush(existingCompany);
	            return "update Succesfully";
	        } else {
	           
	            return "not update";
	        }
	        
	      
	    }
	    public List<Company> getAllCompany(int page, int size) {
	        return companyrepo.findAll(PageRequest.of(page, size)).getContent();
	    }
	    
	    public List<Company> findCompanyByid(Long id) 
	    {
	    	 Optional<Company> findById = companyrepo.findById(id);
	    	  Company company = findById.get();
	    	  List<Company> l =  new ArrayList<>();
	    	  l.add(company);
	    	  return l;
	    	 
	    }

}

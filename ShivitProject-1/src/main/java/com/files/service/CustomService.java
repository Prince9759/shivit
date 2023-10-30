package com.files.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.files.entities.CustomField;
import com.files.repository.CustomFieldRepository;

@Service
public class CustomService
{
	@Autowired
	private CustomFieldRepository crepo;
	
	public List<CustomField> getCustomByModuleId(Long id)
	{
		return crepo.findByModuleId(id);
	}
	

}

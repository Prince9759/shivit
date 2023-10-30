package com.files.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.files.entities.CustomField;



@Repository
public interface CustomFieldRepository  extends JpaRepository<CustomField,Long>{
	 List<CustomField> findByModuleId(Long moduleId);
}

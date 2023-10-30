package com.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.files.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}

package com.ria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ria.model.CountryReport;

@Repository
public interface CountryReportRepository  extends JpaRepository<CountryReport,Integer> {

	List findAll();

	CountryReport findById(int id);

	CountryReport save(CountryReport report);
}

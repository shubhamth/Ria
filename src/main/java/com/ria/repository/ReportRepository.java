package com.ria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ria.model.Report;
 
@Repository
public interface ReportRepository extends JpaRepository<Report,Integer> {

	List findAll();

	Report findById(int id);

	Report save(Report report);
}

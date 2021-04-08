package com.ria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ria.model.Report;
import com.ria.repository.CountryReportRepository;
import com.ria.repository.ReportRepository;

 
@RequestMapping("/report-api/")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ReportController {
	@Autowired
	ReportRepository reportRepository;
	
	@Autowired
	CountryReportRepository countryReportRepository;

	@GetMapping(path = { "reports" })
	public @ResponseBody List<Report>  findAll() {
		return reportRepository.findAll();
	}
	
	@GetMapping(path = "reports/{id}")
	public @ResponseBody Report findOne(@PathVariable("id") int id) {
		return reportRepository.findById(id);
	}
 
	
	@PostMapping("save")
	public @ResponseBody List<Report> save(@Validated @RequestBody Report report) {
		reportRepository.save(report);
		 List<Report> reportList = reportRepository.findAll();
		return reportList;
		
	}	
}

package com.ria.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "REPORT")
public class Report implements Serializable{
	
	 
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable = false, insertable=false)
	private int id;
	
	@Column(name = "REPORTNAME", nullable = false)
	private String reportName;

	@Column(name = "PREPAREDON", nullable = false)
	private Date prepareOn;
	
	//@OneToOne(mappedBy = "author", cascade=CascadeType.ALL, orphanRemoval = true)
	
	
	@OneToOne(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL)
	 @JoinColumn(name = "REPORT_ID") 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private CountryReport countryReport;
 
	public Report() {
		super();
	}
	

	 
public Report(int id, String reportName, Date prepareOn) {
		super();
		this.id = id;
		this.reportName = reportName;
		this.prepareOn = prepareOn;
	}


	public CountryReport getCountryReport() {
		return countryReport;
	}
	public void setCountryReport(CountryReport countryReport) {
		this.countryReport = countryReport;
	}
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	
	public Date getPrepareOn() {
		return prepareOn;
	}
	public void setPrepareOn(Date prepareOn) {
		this.prepareOn = prepareOn;
	}



	@Override
	public String toString() {
		return "Report [id=" + id + ", reportName=" + reportName + ", prepareOn=" + prepareOn + ", countryReport="
				+ countryReport + "]";
	}
	
	
	

}

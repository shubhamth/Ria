package com.ria.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "COUNTRY_REPORT")
public class CountryReport implements Serializable{
    private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable = false, insertable=false)
	private int id;
    
 
	 
	@Column(name = "NAME", nullable = false)
	private String name; 
	
	@Column(name = "POPULATION", nullable = false)
	private int  population;
	
	@OneToMany(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL)
	@JoinColumn(name = "COUNTRY_ID") 
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	List<StateReport> states ;
	
 
	public CountryReport() {
		super();
	}

 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}


	public List<StateReport> getStates() {
		return states;
	}


	public void setStates(List<StateReport> states) {
		this.states = states;
	}


 

 
}

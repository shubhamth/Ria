package com.ria.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATE_REPORT")
public class StateReport  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id;
private String name;
private String capital;
private int totalDistricts;
private int population;



public StateReport() {
	super();
}
public StateReport(int id , String name, String capital, int totalDistricts,
		int population) {
	super();
	this.id = id;
	 
	this.name = name;
	this.capital = capital;
	this.totalDistricts = totalDistricts;
	this.population = population;
}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
 
@Column(name = "NAME", nullable = false)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Column(name = "CAPITAL", nullable = false)
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}

@Column(name = "TOTAL_DISTRICTS", nullable = false)
public int getTotalDistricts() {
	return totalDistricts;
}
public void setTotalDistricts(int totalDistricts) {
	this.totalDistricts = totalDistricts;
}

@Column(name = "POPULATION", nullable = false)
public int getPopulation() {
	return population;
}
public void setPopulation(int population) {
	this.population = population;
}


}

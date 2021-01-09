package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_accountHolderOccu")
public class AccountHolderOccu {

	@Id
	@GeneratedValue
	private int id;
	
	private String type;
	private String income_source;
	private long annual_income;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIncome_source() {
		return income_source;
	}
	public void setIncome_source(String income_source) {
		this.income_source = income_source;
	}
	public long getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(long annual_income) {
		this.annual_income = annual_income;
	}
	
	
}

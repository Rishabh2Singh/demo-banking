package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="internet_banking")
public class InternetBanking {

	@Id
	@Column(name="customer_id")
	@GeneratedValue
	private int customerId;
	
	private String loginPass;
	private String transPass;
	private int status;
	
	@OneToMany(mappedBy="customer")
	private List<Beneficiary> beneficiaries;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getLoginPass() {
		return loginPass;
	}
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	public String getTransPass() {
		return transPass;
	}
	public void setTransPass(String transPass) {
		this.transPass = transPass;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}
	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	
}

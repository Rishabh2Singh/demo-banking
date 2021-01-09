package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_account")
public class Account {

	@Id
	@Column(name="account_no")
	@GeneratedValue
	private long accountNo;
	
	private String type;
	private double balance;
	
	@OneToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="holder_id")
	private AccountHolder accountHolder;
	
	@OneToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="customer_id")
	private InternetBanking internetBanking;
	
	private int status;

	@OneToMany(mappedBy="account")
	private List<Activity> activities;
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountHolder getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}
	public InternetBanking getInternetBanking() {
		return internetBanking;
	}
	public void setInternetBanking(InternetBanking internetBanking) {
		this.internetBanking = internetBanking;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
} 

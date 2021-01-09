package com.lti.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="approval_activity")
public class ApprovalActivity {

	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="account_no")
	private Account account;
	
	@ManyToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="customer_id")
	private InternetBanking customer;
	
	private String type;
	private String approval;
	
	@ManyToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="admin_id")
	private Admin admin;
	
	private LocalDate date;
	private LocalTime time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public InternetBanking getCustomer() {
		return customer;
	}
	public void setCustomer(InternetBanking customer) {
		this.customer = customer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}

}

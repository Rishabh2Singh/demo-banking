package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_beneficiary")
public class Beneficiary {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@ManyToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="account_no")
	private Account account;
	
	private String type;
	private String nickname;
	
	@ManyToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(table="customer_id")
	private InternetBanking customer;

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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public InternetBanking getCustomer() {
		return customer;
	}
	public void setCustomer(InternetBanking customer) {
		this.customer = customer;
	}
	
}

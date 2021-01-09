package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_accountHolder")
public class AccountHolder {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@Column(name="father_name")
	private String fatherName;
	
	private long mobile;
	
	@Column(name="adhar_card")
	private long adharCard;
	private LocalDate dob;

	@Column(name="debit_card")
	private int debitCard;

	@Column(name="credit_card")
	private int creditCard;
	
	@OneToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="res_id")
	private AccountHolderAdd accountHolderAdd1;
	
	@OneToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="mail_Add")
	private AccountHolderAdd accountHolderAdd2;
	
	@OneToOne(cascade= { CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="occu_id")
	private AccountHolderOccu accountHolderOccu;
}

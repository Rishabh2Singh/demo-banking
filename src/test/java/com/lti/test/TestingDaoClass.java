package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.DaoClass;
import com.lti.entity.Account;
import com.lti.entity.AccountHolder;
import com.lti.entity.AccountHolderAdd;
import com.lti.entity.AccountHolderOccu;
import com.lti.entity.Admin;
import com.lti.entity.InternetBanking;

public class TestingDaoClass {

	@Test
	public void fetchAccount() {
		DaoClass dao=new DaoClass();
		AccountHolderOccu obj=(AccountHolderOccu) dao.fetch(AccountHolderOccu.class, 201);
		System.out.println(obj.getAnnual_income()+" "+obj.getIncome_source());
	}
	@Test
	public void addOccu() {
		DaoClass dao=new DaoClass();
		AccountHolderOccu obj=new AccountHolderOccu();
		obj.setAnnual_income(45000);
		obj.setIncome_source("LTI");
		obj.setType("HHH");
		
		dao.save(obj);
	}
	@Test
	public void addAdmin() {
		DaoClass dao=new DaoClass();
		Admin a=new Admin();
		a.setName("Aditya");
		a.setPassword("qwerty");
		a.setContact(979797997);
		a.setDesignation("HR");
		a.setEmail("KUSH@LTI");
		
		dao.save(a);
	}
	@Test
	public void addAccountDet() {
		DaoClass dao=new DaoClass();
		AccountHolderAdd add1=new AccountHolderAdd();
		add1.setAddress("123 h no");
		add1.setCity("Bhopal");
		add1.setLandmark("petrol pump");
		add1.setState("MP");
		add1.setPincode(123456);
		
		AccountHolderAdd fethol=(AccountHolderAdd) dao.save(add1);
		
		AccountHolderAdd add2=new AccountHolderAdd();
		add2.setAddress("123 h no");
		add2.setCity("Bhopal");
		add2.setLandmark("petrol pump");
		add2.setState("MP");
		add2.setPincode(123456);
		
//		AccountHolderAdd fethol2=(AccountHolderAdd) dao.save(add2);
		
		AccountHolderOccu occu=new AccountHolderOccu();
		occu.setAnnual_income(25000);
		occu.setIncome_source("LTI");
		occu.setType("DEV");
		
//		AccountHolderOccu fetoc=(AccountHolderOccu) dao.save(occu);
		
		AccountHolder obj=new AccountHolder();
		obj.setName("Ankit");
		obj.setFatherName("MP");
		obj.setAdharCard(1234567898);
		obj.setDob(LocalDate.of(1999, 1, 1));
		obj.setMobile(987654321);
		obj.setAccountHolderAdd1(add1);
		obj.setAccountHolderAdd2(add2);
		obj.setAccountHolderOccu(occu);
		
		AccountHolder fetobj=(AccountHolder) dao.save(obj);
		
		InternetBanking ib=new InternetBanking();
		ib.setLoginPass("123");
		ib.setTransPass("1234");
		ib.setStatus(1);
		
//		InternetBanking fetib=(InternetBanking) dao.save(ib);
		
		Account a=new Account();
		a.setBalance(50000);
		a.setType("Saving");
		a.setStatus(1);
		a.setAccountHolder(obj);
		a.setInternetBanking(ib);
		
		Account fet=(Account) dao.save(a);
		System.out.println(fet.getAccountNo()+" "+fet.getBalance()+" "+fetobj.getName());
	}
	
}

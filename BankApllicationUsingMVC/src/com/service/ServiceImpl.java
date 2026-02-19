package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Account;
import com.dao.DaoInterface;
@Service
public class ServiceImpl implements ServiceInterface{
	@Autowired
public DaoInterface di;
	@Override
	public void setRegistration(Account ac) {
		di.setRegistractionInDao(ac);
		
	}
	@Override
	public void updatePass(String em, String pass) {
		di.updatePassInDao(em,pass);
		
	}
	@Override
	public Account getValidLogin(String email, String password) {
		Account loginFromDao = di.getValidLoginFromDao(email,password);
		return loginFromDao;
		
	}
	@Override
	public int WithdrawAmount(String an, double amount) {
		 int  n= di.WithdrawAmountFromDao(an,amount);
		 return n;
		
	}
	@Override
	public void depositeAmount(String an, double amount) {
		di.depositeAmountFromDao(an,amount);
		
	}
	@Override
	public double checkBalance(String an) {
		double balance = di.checkBalanceFromDao(an);
		return balance;
		
	}
	@Override
	public Account updateDetails(String an) {
		Account detailsInDao = di.updateDetailsInDao(an);
		return detailsInDao;
		
	}
	@Override
	public void editDeatils(String an, String name, String username, String email, long cn, String pn, String pass) {
	di.editDeatilsInDao(an,name,username,email,cn,pn,pass);
		
	}
	@Override
	public void delete(String an) {
	di.deleteFromDao(an);
	}

}

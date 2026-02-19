package com.service;

import com.Entity.Account;

public interface ServiceInterface {

	void setRegistration(Account ac);

	void updatePass(String em, String pass);

	Account getValidLogin(String email, String password);

	int WithdrawAmount(String an, double amount);

	void depositeAmount(String an, double amount);

	double checkBalance(String an);

	Account updateDetails(String an);

	void editDeatils(String an, String name, String username, String email, long cn, String pn, String pass);

	void delete(String an);



}

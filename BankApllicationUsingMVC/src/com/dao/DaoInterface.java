package com.dao;

import com.Entity.Account;

public interface DaoInterface {

	void setRegistractionInDao(Account ac);

	void updatePassInDao(String em, String pass);

	Account getValidLoginFromDao(String email, String password);

	int WithdrawAmountFromDao(String an, double amount);

	void depositeAmountFromDao(String an, double amount);

	double checkBalanceFromDao(String an);

	Account updateDetailsInDao(String an);

	void editDeatilsInDao(String an, String name, String username, String email, long cn, String pn, String pass);

	void deleteFromDao(String an);



}

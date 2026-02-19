package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.Account;

@Repository
public class DaoImpl implements DaoInterface {
	@Autowired
	public SessionFactory si;

	@Override
	public void setRegistractionInDao(Account ac) {
		Session session = si.openSession();
		session.save(ac);
		session.beginTransaction().commit();

	}

	@Override
	public void updatePassInDao(String em, String pass) {
		Session session = si.openSession();
		Query query = session.createQuery("from Account where email=:email");
		query.setParameter("email", em);
		Account result = (Account) query.getSingleResult();
		result.setPassword(pass);
		session.update(result);
		session.save(result);
		session.beginTransaction().commit();

	}

	@Override
	public Account getValidLoginFromDao(String email, String password) {
		Session session = si.openSession();
		Query query = session.createQuery("from Account where email= :email and password= :password ");
		query.setParameter("email", email);
		query.setParameter("password", password);

		Account result = (Account) query.getSingleResult();

		return result;

	}

	@Override
	public int WithdrawAmountFromDao(String an, double amount) {
		Session session = si.openSession();
		Query query = session.createQuery("from Account where accountNo=:accountNo");
		query.setParameter("accountNo", an);
		Account result = (Account)query.getSingleResult();
		if(result.getBalance()>=amount) {
			result.setBalance(result.getBalance()-amount);
			session.update(result);
			session.save(result);
			session.beginTransaction().commit();
			return 1;
		}
			else {
				return -1;
			}
		
		
		
	}

	@Override
	public void depositeAmountFromDao(String an, double amount) {
		Session session = si.openSession();
		Query query = session.createQuery("from Account where accountNo=:accountNo");
		query.setParameter("accountNo", an);
		Account result = (Account)query.getSingleResult();
	
			result.setBalance(result.getBalance()+amount);
			session.update(result);
			session.save(result);
			session.beginTransaction().commit();
		
	}

	@Override
	public double checkBalanceFromDao(String an) {
		Session session = si.openSession();
		Query query = session.createQuery("from Account where accountNo=:accountNo");
		query.setParameter("accountNo", an);
		Account result = (Account)query.getSingleResult();
		double balance = result.getBalance();
		return balance;
		
	}

	@Override
	public Account updateDetailsInDao(String an) {
		
		Session session = si.openSession();
		Query query = session.createQuery("from Account where accountNo=:accountNo");
		query.setParameter("accountNo", an);
		Account result = (Account)query.getSingleResult();
		return result;
	}

	@Override
	public void editDeatilsInDao(String an, String name, String username, String email, long cn, String pn,
			String pass) {
		
		Session session = si.openSession();
		Query query = session.createQuery("from Account where accountNo=:accountNo");
		query.setParameter("accountNo", an);
		Account ac = (Account)query.getSingleResult();
		ac.setAccountNo(an);
		ac.setName(name);
		ac.setUsername(username);
		ac.setEmail(email);
		ac.setContactNO(cn);
		ac.setPanNo(pn);
		ac.setPassword(pass);
		session.save(ac);
		session.beginTransaction().commit();
		
	}

	@Override
	public void deleteFromDao(String an) {
		Session session = si.openSession();
		Query query = session.createQuery("from Account where accountNo=:accountNo");
		query.setParameter("accountNo", an);
		Account ac = (Account)query.getSingleResult();
		session.delete(ac);
		
		session.beginTransaction().commit();
	}

}

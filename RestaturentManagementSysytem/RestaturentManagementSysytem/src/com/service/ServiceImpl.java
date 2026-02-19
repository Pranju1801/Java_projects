package com.service;

import java.util.List;
import com.entity.TodaysExpence;
import com.entity.Westage;

import java.util.Map;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.DaoInterface;
import com.entity.Branch;
import com.entity.DailyIncome;
import com.entity.MonthlyExpence;
import com.entity.Partner;
import com.entity.request;
import com.entity.TodaysExpence;
@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	public DaoInterface di;

	@Override
	public Partner getSPartner() {
		System.out.println("in service impl");

		Partner partner = di.getSPartnerFromDao();
		return partner;
	}

	@Override
	public Partner plogin(String n, String pass) {
		Partner partner = di.ploginFromDao(n, pass);
		return partner;
	}

	@Override
	public void addPartner(Partner p) {
		di.addPartnerInDao(p);

	}

	@Override
	public void addBranch(Branch b, int id) {
		di.addBranchInDao(b, id);
	}

	/*
	 * @Override public void saveIncome(int in,Date parse) {
	 * di.savaIncomeInDao(in,parse);
	 * 
	 * }
	 */

	@Override
	public void saveIncome(DailyIncome d) {
		di.saveIncomeIn(d);

	}

	@Override
	public void TodaysExpence(TodaysExpence tx) {
		di.TodaysExpenceInDao(tx);
	}

	@Override
	public void monthlyExpence(MonthlyExpence mx) {
		di.monthlyExpenceInDao(mx);
		
	}

		
	@Override
	public void storeBranchId(int bid) {
      di.storeBranchIdInDAO(bid);		
	}

	@Override
	public List<DailyIncome> getIncomeDetails() {
		List<DailyIncome> income = di.getIncomeDetailsFromDAo();
		return income;
	}

	@Override
	public List<TodaysExpence> getDailyExpense() {
		List<TodaysExpence> tx= di.getDailyExpenseFromDao();	
		return tx;
	}

	@Override
	public List<MonthlyExpence> getMonthlyExpense() {
		List<MonthlyExpence> expence = di.getMonthlyExpenceFromDao();
		return expence;
	}

	@Override
	public void saveWestage(Westage w) {
		di.saveWestageInDao(w);
	}

	@Override
	public void send(request r) {
		di.sendOrderInDao(r);
		
	}

	@Override
	public List<request> getreq() {
         List<request> request = di.getreqFromDao();
         return request;
	}

	@Override
	public List<Westage> getwest() {
		List west=di.getWestFromDao();
		return west;
	}
	 
}

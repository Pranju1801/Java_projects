package com.service;

//import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.entity.Branch;
import com.entity.DailyIncome;
import com.entity.MonthlyExpence;
import com.entity.Partner;
import com.entity.TodaysExpence;
import com.entity.Westage;
import com.entity.request;

public interface ServiceInterface {

	void addPartner(Partner p);
	void addBranch(Branch b,int id);
	
	
	Partner getSPartner();

	Partner plogin(String n, String pass);
	
	 // void saveIncome(int in, Date parse);
	void saveIncome(DailyIncome d);
	void TodaysExpence(TodaysExpence tx);
	void monthlyExpence(MonthlyExpence mx);
	void storeBranchId(int bid);
	List<DailyIncome> getIncomeDetails();
	List<TodaysExpence> getDailyExpense();
	List<MonthlyExpence> getMonthlyExpense();
	void saveWestage(Westage w);
	void send(request r);
	List<request> getreq();
	List<Westage> getwest();
	 

}

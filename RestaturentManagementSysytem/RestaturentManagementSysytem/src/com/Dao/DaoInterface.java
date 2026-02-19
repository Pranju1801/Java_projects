package com.Dao;

import java.util.List;
import java.util.Map;

//import java.time.LocalDate;
//import java.util.Date;

import com.entity.Branch;
import com.entity.DailyIncome;
import com.entity.MonthlyExpence;
import com.entity.Partner;
import com.entity.TodaysExpence;
import com.entity.Westage;
import com.entity.request;

public interface DaoInterface {

	void addBranchInDao(Branch b, int id);

	void addPartnerInDao(Partner p);

	Partner getSPartnerFromDao();

	Partner ploginFromDao(String n, String pass);


	 // void savaIncomeInDao(int in, LocalDate parse);

	//void savaIncomeInDao(int in, Date parse);

	void saveIncomeIn(DailyIncome d);


	void TodaysExpenceInDao(TodaysExpence tx);

	void monthlyExpenceInDao(MonthlyExpence mx);


	void storeBranchIdInDAO(int bid);

	List<DailyIncome> getIncomeDetailsFromDAo();

	List<TodaysExpence> getDailyExpenseFromDao();

	List<MonthlyExpence> getMonthlyExpenceFromDao();

	void saveWestageInDao(Westage w);

	void sendOrderInDao(request r);

	List<request> getreqFromDao();

	List<Westage> getWestFromDao();
	 
}

package com.Dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Branch;
import com.entity.DailyIncome;
import com.entity.MonthlyExpence;
import com.entity.Partner;
import com.entity.TodaysExpence;
import com.entity.Westage;
import com.entity.request;
import com.entity.Partner;
@Repository
public class DaoImpl implements DaoInterface {
	@Autowired
	public SessionFactory si;
	public static int id;
	public static int bId;
	//public static int subId;

	@Override
	public void addBranchInDao(Branch b, int id) {
		Session session = si.openSession();
		Partner partner = session.get(Partner.class, id);
		b.setPartner(partner);
		session.save(b);
		session.beginTransaction().commit();
	}

	@Override
	public Partner getSPartnerFromDao() {
		try {
			System.out.println("in dao impl");
			Session session = si.openSession();
			Query q = session.createQuery("from Partner where partnerId=:partnerId");
			Query setParameter = q.setParameter("partnerId", bId);
			Partner singleResult = (Partner)q.getSingleResult();
			System.out.println(singleResult);

			return singleResult;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;

		}

	}

	/*
	 * public void setbid() { Session session = si.openSession(); Query query =
	 * session.
	 * createQuery("from Branch where Partner.partnerId= : Partner.partnerId ");
	 * query.setParameter("Partner.partnerId", id); Branch result= (Branch)
	 * query.getSingleResult(); int bid = result.getBranchId(); //subId=bid;
	 * 
	 * }
	 */

	@Override
	public Partner ploginFromDao(String n, String pass) {
		Session session = si.openSession();
		Query query = session.createQuery("from Partner where name= :name and password= :password ");
		query.setParameter("name", n);
		query.setParameter("password", pass);

		Partner result = (Partner) query.getSingleResult();
		int pid = result.getPartnerId();

		id = pid;
		System.out.println(pid);

		return result;
	}

	@Override
	public void addPartnerInDao(Partner p) {
		Session session = si.openSession();
		session.save(p);
		session.beginTransaction().commit();
	}

	@Override
	public void saveIncomeIn(DailyIncome d) {
		Session session = si.openSession();
		System.out.println(id);
		d.setPid(id);
		session.save(d);
		session.beginTransaction().commit();

	}

	

	@Override
	public void TodaysExpenceInDao(TodaysExpence tx) {
		Session session = si.openSession();
		tx.setPid(id);
		session.save(tx);
		session.beginTransaction().commit();
	}

	@Override
	public void monthlyExpenceInDao(MonthlyExpence mx) {
		Session session = si.openSession();
		mx.setPid(id);
		session.save(mx);
		session.beginTransaction().commit();
	}

	

	@Override
	public void storeBranchIdInDAO(int bid) {
		System.out.println(bid);
		bId = bid;
	}

	@Override
	public List<DailyIncome> getIncomeDetailsFromDAo() {
		System.out.println("in dao impl");
		Session session = si.openSession();
		Query q = session.createQuery("from DailyIncome where pid=:pid");

		Query setParameter = q.setParameter("pid", bId);
		List result = q.getResultList();
		// Branch p = (Branch) q.getSingleResult();
		System.out.println(result);

		return result;
	}

	@Override
	public List<TodaysExpence> getDailyExpenseFromDao() {
		Session session = si.openSession();
		Query q = session.createQuery("from TodaysExpence where pid=:pid");

		Query setParameter = q.setParameter("pid", bId);
		 List result = q.getResultList();
		System.out.println(result);

		return result;		
	}

	@Override
	public List<MonthlyExpence> getMonthlyExpenceFromDao() {
		Session session = si.openSession();
		Query q = session.createQuery("from MonthlyExpence where pid=:pid");

		Query setParameter = q.setParameter("pid", bId);
		 List result = q.getResultList();
		System.out.println(result);

		return result;				
	}

	@Override
	public void saveWestageInDao(Westage w) {
		Session session = si.openSession();
		w.setPid(id);

		session.save(w);
		session.beginTransaction().commit();		
	}

	@Override
	public void sendOrderInDao(request r) {
		Session session = si.openSession();
		r.setPid(id);

		session.save(r);
		session.beginTransaction().commit();			
	}

	@Override
	public List<request> getreqFromDao() {
		Session session = si.openSession();
		
		Query q = session.createQuery("from request where pid=:pid");

		Query setParameter = q.setParameter("pid", bId); 
		List result = q.getResultList();
		System.out.println(result);

		return result;		
	}

	@Override
	public List<Westage> getWestFromDao() {
Session session = si.openSession();
		
		Query q = session.createQuery("from Westage where pid=:pid");

		Query setParameter = q.setParameter("pid", bId);
		 List result =q.getResultList();
		System.out.println(result);

		return result;		

	}

}

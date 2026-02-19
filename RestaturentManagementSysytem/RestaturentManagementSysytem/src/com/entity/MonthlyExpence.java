package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class MonthlyExpence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rent;
	private int kirana;
	private int workerPayment;
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String startDate;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String endDate;
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getKirana() {
		return kirana;
	}
	public void setKirana(int kirana) {
		this.kirana = kirana;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWorkerPayment() {
		return workerPayment;
	}
	public void setWorkerPayment(int workerPayment) {
		this.workerPayment = workerPayment;
	}
	

}

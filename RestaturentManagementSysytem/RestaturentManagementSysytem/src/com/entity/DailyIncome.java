package com.entity;

//import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class DailyIncome {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int tid;
@DateTimeFormat(pattern = "yyyy-mm-dd")
//@Temporal(TemporalType.DATE)
private String datef;

	/*
	 * private LocalDate datef =LocalDate.now();
	 */
private int todaysIncome;
private int pid;


public int getTid() {
	return tid;
}

public void setTid(int tid) {
	this.tid = tid;
}




public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getDatef() {
	return datef;
}

public void setDatef(String datef) {
	this.datef = datef;
}

public int getTodaysIncome() {
	return todaysIncome;
}

public void setTodaysIncome(int todaysIncome) {
	this.todaysIncome = todaysIncome;
}

}

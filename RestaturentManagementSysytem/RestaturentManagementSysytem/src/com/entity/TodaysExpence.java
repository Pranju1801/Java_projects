package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodaysExpence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private String datef;
public String getDatef() {
	return datef;
}
public void setDatef(String datef) {
	this.datef = datef;
}
private String kirana;
private String pavLadi;
private String milk;
private String khaki;
private int pid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getKirana() {
	return kirana;
}
public void setKirana(String kirana) {
	this.kirana = kirana;
}
public String getPavLadi() {
	return pavLadi;
}
public void setPavLadi(String pavLadi) {
	this.pavLadi = pavLadi;
}
public String getMilk() {
	return milk;
}
public void setMilk(String milk) {
	this.milk = milk;
}
public String getKhaki() {
	return khaki;
}
public void setKhaki(String khaki) {
	this.khaki = khaki;
}


}

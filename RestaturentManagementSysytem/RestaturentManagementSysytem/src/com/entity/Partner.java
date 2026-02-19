package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Partner {
	
	/*
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 */	@Id
	private int partnerId;
	 
	private String name;
	private long contactNo;
	private String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * @OneToOne(cascade = CascadeType.ALL) private Branch branch;
	 */
	public int getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String string) {
		this.name = string;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	/*
	 * public Branch getBranch() { return branch; }
	 * 
	 * public void setBranch(Branch branch) { this.branch = branch; }
	 */

}

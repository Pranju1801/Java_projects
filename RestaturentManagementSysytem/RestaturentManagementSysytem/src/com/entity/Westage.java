
package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

@Entity
public class Westage {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String datef;
	@Column(nullable = true)
	private int poheWestage;
	@Column(nullable = true)
	private int vadapavWestage;
	@Column(nullable = true)
	private int pulavWestage;
	@Column(nullable = true)
	private int samosaWestage;
	@Column(nullable = true)
	private int misalWestage;
	@Column(nullable = true)
	private int puribhajiWestage;
	@Column(nullable = true)
	private int idliWestage;


	private int pid;
	
	public int getPid() {
		return pid;
	}

	public String getDatef() {
		return datef;
	}

	public void setDatef(String datef) {
		this.datef = datef;
	}

	public int getPoheWestage() {
		return poheWestage;
	}

	public void setPoheWestage(int poheWestage) {
		this.poheWestage = poheWestage;
	}

	public int getVadapavWestage() {
		return vadapavWestage;
	}

	public void setVadapavWestage(int vadapavWestage) {
		this.vadapavWestage = vadapavWestage;
	}

	public int getPulavWestage() {
		return pulavWestage;
	}

	public void setPulavWestage(int pulavWestage) {
		this.pulavWestage = pulavWestage;
	}

	public int getSamosaWestage() {
		return samosaWestage;
	}

	public void setSamosaWestage(int samosaWestage) {
		this.samosaWestage = samosaWestage;
	}

	public int getMisalWestage() {
		return misalWestage;
	}

	public void setMisalWestage(int misalWestage) {
		this.misalWestage = misalWestage;
	}

	public int getPuribhajiWestage() {
		return puribhajiWestage;
	}

	public void setPuribhajiWestage(int puribhajiWestage) {
		this.puribhajiWestage = puribhajiWestage;
	}

	public int getIdliWestage() {
		return idliWestage;
	}

	public void setIdliWestage(int idliWestage) {
		this.idliWestage = idliWestage;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}

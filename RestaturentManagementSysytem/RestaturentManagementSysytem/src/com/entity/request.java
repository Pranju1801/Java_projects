package com.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

@Entity
public class request {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String datef;
	private int poheMasala;
	private int vadapavMasala;
	
	public int getVadapavMasala() {
		return vadapavMasala;
	}

	public void setVadapavMasala(int vadapavMasala) {
		this.vadapavMasala = vadapavMasala;
	}

	private int pulavMasala;
	private int samosaMasala;
	private int misalpavMasala;
	private int puribhajiMasala;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDatef() {
		return datef;
	}

	public void setDatef(String datef) {
		this.datef = datef;
	}

	public int getPoheMasala() {
		return poheMasala;
	}

	public void setPoheMasala(int poheMasala) {
		this.poheMasala = poheMasala;
	}

	public int getPulavMasala() {
		return pulavMasala;
	}

	public void setPulavMasala(int pulavMasala) {
		this.pulavMasala = pulavMasala;
	}

	public int getSamosaMasala() {
		return samosaMasala;
	}

	public void setSamosaMasala(int samosaMasala) {
		this.samosaMasala = samosaMasala;
	}

	public int getMisalpavMasala() {
		return misalpavMasala;
	}

	public void setMisalpavMasala(int misalpavMasala) {
		this.misalpavMasala = misalpavMasala;
	}

	public int getPuribhajiMasala() {
		return puribhajiMasala;
	}

	public void setPuribhajiMasala(int puribhajiMasala) {
		this.puribhajiMasala = puribhajiMasala;
	}

	public int getSweetChatni() {
		return sweetChatni;
	}

	public void setSweetChatni(int sweetChatni) {
		this.sweetChatni = sweetChatni;
	}

	private int sweetChatni;
	private int pid;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	

	

	

	
}

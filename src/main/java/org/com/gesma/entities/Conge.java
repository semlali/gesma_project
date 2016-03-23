package org.com.gesma.entities;

import java.util.Date;

public class Conge {

	private Long idConge;
	private int dureeConge; 
	private Date dateDebut;
	
	
	
	public Conge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conge(int dureeConge, Date dateDebut) {
		super();
		this.dureeConge = dureeConge;
		this.dateDebut = dateDebut;
	}
	public Long getIdConge() {
		return idConge;
	}
	public void setIdConge(Long idConge) {
		this.idConge = idConge;
	}
	public int getDureeConge() {
		return dureeConge;
	}
	public void setDureeConge(int dureeConge) {
		this.dureeConge = dureeConge;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	
	
}

package org.com.gesma.entities;

import java.util.Date;

public class BulletinPaie {

	private Long idBulletin ;
	private Date dateSaisie;
	private int nbrHeuresTravaillees;
	private int nbrJourFeries;
	private int nbrCongesPayes;
	private int nbreHeuresSup100;
	private int nbreHeuresSup50;
	private int nbreHeuresSup20;
	
	
	
	
	public BulletinPaie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BulletinPaie(Date dateSaisie, int nbrHeuresTravaillees,
			int nbrJourFeries, int nbrCongesPayes, int nbreHeuresSup100,
			int nbreHeuresSup50, int nbreHeuresSup20) {
		super();
		this.dateSaisie = dateSaisie;
		this.nbrHeuresTravaillees = nbrHeuresTravaillees;
		this.nbrJourFeries = nbrJourFeries;
		this.nbrCongesPayes = nbrCongesPayes;
		this.nbreHeuresSup100 = nbreHeuresSup100;
		this.nbreHeuresSup50 = nbreHeuresSup50;
		this.nbreHeuresSup20 = nbreHeuresSup20;
	}

	public Long getIdBulletin() {
		return idBulletin;
	}
	public void setIdBulletin(Long idBulletin) {
		this.idBulletin = idBulletin;
	}
	public Date getDateSaisie() {
		return dateSaisie;
	}
	public void setDateSaisie(Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}
	public int getNbrHeuresTravaillees() {
		return nbrHeuresTravaillees;
	}
	public void setNbrHeuresTravaillees(int nbrHeuresTravaillees) {
		this.nbrHeuresTravaillees = nbrHeuresTravaillees;
	}
	public int getNbrJourFeries() {
		return nbrJourFeries;
	}
	public void setNbrJourFeries(int nbrJourFeries) {
		this.nbrJourFeries = nbrJourFeries;
	}
	public int getNbrCongesPayes() {
		return nbrCongesPayes;
	}
	public void setNbrCongesPayes(int nbrCongesPayes) {
		this.nbrCongesPayes = nbrCongesPayes;
	}
	public int getNbreHeuresSup100() {
		return nbreHeuresSup100;
	}
	public void setNbreHeuresSup100(int nbreHeuresSup100) {
		this.nbreHeuresSup100 = nbreHeuresSup100;
	}
	public int getNbreHeuresSup50() {
		return nbreHeuresSup50;
	}
	public void setNbreHeuresSup50(int nbreHeuresSup50) {
		this.nbreHeuresSup50 = nbreHeuresSup50;
	}
	public int getNbreHeuresSup20() {
		return nbreHeuresSup20;
	}
	public void setNbreHeuresSup20(int nbreHeuresSup20) {
		this.nbreHeuresSup20 = nbreHeuresSup20;
	}
	
	
}

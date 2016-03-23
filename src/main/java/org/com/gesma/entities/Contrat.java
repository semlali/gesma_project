package org.com.gesma.entities;

import java.util.Date;

public class Contrat {
	private Long idContrat;
	private Date dateEmbauche;
	private Double salaireBase;
	private String modeRegelemnt;
	
	
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contrat(Date dateEmbauche, Double salaireBase, String modeRegelemnt) {
		super();
		this.dateEmbauche = dateEmbauche;
		this.salaireBase = salaireBase;
		this.modeRegelemnt = modeRegelemnt;
	}
	public Long getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(Long idContrat) {
		this.idContrat = idContrat;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Double getSalaireBase() {
		return salaireBase;
	}
	public void setSalaireBase(Double salaireBase) {
		this.salaireBase = salaireBase;
	}
	public String getModeRegelemnt() {
		return modeRegelemnt;
	}
	public void setModeRegelemnt(String modeRegelemnt) {
		this.modeRegelemnt = modeRegelemnt;
	}
	
	
	
	

}

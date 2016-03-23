package org.com.gesma.entities;

public class CIMR {
	
private Long idCIMR;
private int tauxCimrSalarial;
private int tauxCimrPatronale;



public CIMR() {
	super();
	// TODO Auto-generated constructor stub
}
public CIMR(int tauxCimrSalarial, int tauxCimrPatronale) {
	super();
	this.tauxCimrSalarial = tauxCimrSalarial;
	this.tauxCimrPatronale = tauxCimrPatronale;
}
public Long getIdCIMR() {
	return idCIMR;
}
public void setIdCIMR(Long idCIMR) {
	this.idCIMR = idCIMR;
}
public int getTauxCimrSalarial() {
	return tauxCimrSalarial;
}
public void setTauxCimrSalarial(int tauxCimrSalarial) {
	this.tauxCimrSalarial = tauxCimrSalarial;
}
public int getTauxCimrPatronale() {
	return tauxCimrPatronale;
}
public void setTauxCimrPatronale(int tauxCimrPatronale) {
	this.tauxCimrPatronale = tauxCimrPatronale;
}


}

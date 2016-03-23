package org.com.gesma.entities;

public class Profession {
private Long idProfession ;
private String nomProfession;


public Profession(String nomProfession) {
	super();
	this.nomProfession = nomProfession;
}
public Profession() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getIdProfession() {
	return idProfession;
}
public void setIdProfession(Long idProfession) {
	this.idProfession = idProfession;
}
public String getNomProfession() {
	return nomProfession;
}
public void setNomProfession(String nomProfession) {
	this.nomProfession = nomProfession;
} 


}

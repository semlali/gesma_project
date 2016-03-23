package org.com.gesma.entities;

public class TypeContrat {
private Long idTypeContrat;
private String nomType;




public TypeContrat(String nomType) {
	super();
	this.nomType = nomType;
}
public TypeContrat() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getIdTypeContrat() {
	return idTypeContrat;
}
public void setIdTypeContrat(Long idTypeContrat) {
	this.idTypeContrat = idTypeContrat;
}
public String getNomType() {
	return nomType;
}
public void setNomType(String nomType) {
	this.nomType = nomType;
}

}

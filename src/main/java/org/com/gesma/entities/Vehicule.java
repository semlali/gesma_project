package org.com.gesma.entities;

import java.util.Collection;


import javax.persistence.*;


@Entity
@Table(name="vehicule")
public class Vehicule {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_vehicule;
	private String description;
	private String nom_vehicule;
	private int matricule;	
	
	@OneToMany(mappedBy="vehicule")
	private  Collection<Fonctionnaire> fonctionnaires;
	
	
	public int getId_vehicule() {
		return id_vehicule;
	}
	public void setId_vehicule(int id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNom_vehicule() {
		return nom_vehicule;
	}
	public void setNom_vehicule(String nom_vehicule) {
		this.nom_vehicule = nom_vehicule;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public Collection<Fonctionnaire> getFonctionnaires() {
		return fonctionnaires;
	}
	public void setFonctionnaires(Collection<Fonctionnaire> fonctionnaires) {
		this.fonctionnaires = fonctionnaires;
	}
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicule(String description, String nom_vehicule, int matricule, Collection<Fonctionnaire> fonctionnaires) {
		super();
		this.description = description;
		this.nom_vehicule = nom_vehicule;
		this.matricule = matricule;
		this.fonctionnaires = fonctionnaires;
	}
	
	
	
	
	
	

}

package org.com.gesma.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAISSE")
public class Caisse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_caisse;
	private String nom_caisse;
	
	public Caisse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNom_caisse() {
		return nom_caisse;
	}
	public void setNom_caisse(String nom_caisse) {
		this.nom_caisse = nom_caisse;
	}
	

}

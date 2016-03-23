package org.com.gesma.entities;

public class TypeConge {
	
	private Long idTypeConge;
	private String type;
	
	
	
	public TypeConge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeConge(String type) {
		super();
		this.type = type;
	}
	public Long getIdTypeConge() {
		return idTypeConge;
	}
	public void setIdTypeConge(Long idTypeConge) {
		this.idTypeConge = idTypeConge;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}

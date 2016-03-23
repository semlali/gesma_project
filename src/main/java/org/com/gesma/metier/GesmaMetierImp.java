package org.com.gesma.metier;

import org.com.gesma.dao.GesmaDao;

public class GesmaMetierImp implements GesmaMetier {
	
	
	private GesmaDao dao;
	
	public GesmaDao getDao() {
		return dao;
	}
	public void setDao(GesmaDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void addEmployee(String fname, String lname, int salary) {
		
		 dao.addEmployee(fname, lname, salary);
	}

}

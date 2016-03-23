package org.com.gesma.metier;

import org.com.gesma.dao.GesmaDao;

public class GesmaMetierImp implements GesmaMetier {
	GesmaDao dao;
	public GesmaDao getDao() {
		return dao;
	}
	public void setDao(GesmaDao dao) {
		this.dao = dao;
	}
	@Override
	public Integer addEmployee(String fname, String lname, int salary) {
		
		return dao.addEmployee(fname, lname, salary);
	}

}

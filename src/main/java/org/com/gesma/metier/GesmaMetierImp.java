package org.com.gesma.metier;

import org.com.gesma.dao.GesmaDao;
import org.com.gesma.entities.Employee;

public class GesmaMetierImp implements GesmaMetier {
	private GesmaDao dao;
	

	public void setDao(GesmaDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void addEmployee(Employee e) {
	    dao.addEmployee(e);
	    
	    
	}

}

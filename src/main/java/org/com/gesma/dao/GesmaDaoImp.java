package org.com.gesma.dao;

import java.util.Iterator;
import java.util.List;

import org.com.gesma.entities.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import gesma_project.hibernatUtil;

public class GesmaDaoImp {

	 @Autowired
	 private static SessionFactory factory;
	   /* Method to CREATE an employee in the database */
	   public void addEmployee(Employee e){
	      Session session = hibernatUtil.getSessionFactory().getCurrentSession();
	      session.beginTransaction();   
	      session.save(e); 
	      session.getTransaction().commit();;
	   
	    
	   }
 /* public void listEmployees( ){
    Session session = factory.openSession();
    Transaction tx = null;
    try{
       tx = session.beginTransaction();
       List employees = session.createQuery("FROM Employee").list(); 
       for (Iterator iterator = 
                         employees.iterator(); iterator.hasNext();){
          Employee employee = (Employee) iterator.next(); 
          System.out.print("First Name: " + employee.getFirstName()); 
          System.out.print("  Last Name: " + employee.getLastName()); 
          System.out.println("  Salary: " + employee.getSalary()); 
       }
       tx.commit();
    }catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    }finally {
       session.close(); 
    }
  }*/
}

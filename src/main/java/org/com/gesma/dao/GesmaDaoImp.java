package org.com.gesma.dao;

import java.util.Iterator;
import java.util.List;

import org.com.gesma.entities.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GesmaDaoImp {

	 private static SessionFactory factory;
	   /* Method to CREATE an employee in the database */
	   public Integer addEmployee(String fname, String lname, int salary){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	         Employee employee = new Employee();
	         employee.setFirstName(fname);
	         employee.setLastName(lname);
	         employee.setSalary(salary);
	         employeeID = (Integer) session.save(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;
	   }
  public void listEmployees( ){
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
  }
}

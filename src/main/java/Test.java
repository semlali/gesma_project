


import org.com.gesma.dao.GesmaDaoImp;
import org.com.gesma.entities.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
	 private static SessionFactory factory;
	public static void main(String[] args) {
		
		 try{
	         factory = new AnnotationConfiguration().
	                   configure().
	                   //addPackage("com.xyz") //add package if used.
	                   addAnnotatedClass(Employee.class).
	                   buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	      GesmaDaoImp ME = new GesmaDaoImp();

	      /* Add few employee records in database */
	     /* Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
	      Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
	      Integer empID3 = ME.addEmployee("John", "Paul", 10000);

	      /* List down all the employees 
	      ME.listEmployees();*/

	     
	}

}

import org.com.gesma.entities.Employee;
import org.com.gesma.metier.GesmaMetier;
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
	         System.out.println("create factory in test");
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		 
		 
	      GesmaMetier metier = null;
	      
	      metier.addEmployee("samia", "semlali", 15000);
	      

	      // List down all the employees 
	      //ME.listEmployees();

	     
	}

}

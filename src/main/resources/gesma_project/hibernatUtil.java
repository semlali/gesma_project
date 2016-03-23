package gesma_project;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class hibernatUtil {
	 
	 private static final SessionFactory factory;
	
	static{
	 
	 try{
		 
         factory = new AnnotationConfiguration().
                configure("hibernate.cfg.xml").buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
	 

}
	 public static SessionFactory getSessionFactory(){
		 return factory;
	 }
}



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		try {
			System.out.println("Iniciando o Static do Hibernate Utils");
			Configuration configuration = new Configuration();
			configuration.configure("/hibernate.cfg.xml");
			
			System.out.println("Após o configuration.configure()");
			

			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
			builder.applySettings(configuration.getProperties());
			System.out.println("Após o registro do serviço e as propriedades");

			sessionFactory = configuration.buildSessionFactory(builder.build());
			
			System.out.println("Criando a Session Factory");

		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);

		}
	}

	public static Session openSession() {
		
		if (sessionFactory != null)
		   return sessionFactory.openSession() ;
		
	    return null ;
	}

}

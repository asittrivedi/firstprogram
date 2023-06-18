package hibernate9.hibernate9;
import java.util.Properties;
import org.hibernate.SessionFactory;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.cfg.Environment;
	import org.hibernate.service.ServiceRegistry;

	import  hibernate9.hibernate9.employee1;
	import  hibernate9.hibernate9.address1;
public class hibernate9config {
	  private static SessionFactory sessionFactory;
				    public static SessionFactory getSessionFactory() {
				        if (sessionFactory == null) {
				            try {
				                Configuration configuration = new Configuration();
				                Properties settings = new Properties();
				                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				                settings.put(Environment.URL, "jdbc:mysql://localhost:3308/hiber5");
				                settings.put(Environment.USER, "root");
				                settings.put(Environment.PASS, "root");

				                settings.put(Environment.SHOW_SQL, "true");

				                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				                settings.put(Environment.HBM2DDL_AUTO, "create-drop");

				                configuration.setProperties(settings);

				                configuration.addAnnotatedClass(employee1.class);
				              configuration.addAnnotatedClass(address1.class);
				                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				                        .applySettings(configuration.getProperties()).build();

				                    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				                } catch (Exception e) {
				                    e.printStackTrace();
				                }
				            }
				            return sessionFactory;
				        }
				            
				            
				            
				            
				            }











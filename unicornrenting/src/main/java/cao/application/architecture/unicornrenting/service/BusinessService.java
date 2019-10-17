package cao.application.architecture.unicornrenting.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import cao.application.architecture.unicornrenting.model.Product;

public class BusinessService {
	protected SessionFactory sessionFactory;

	protected void setup() {
		// code to load Hibernate Session factory
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
																									// from
																									// hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	protected void exit() {
		// code to close Hibernate Session factory
		sessionFactory.close();
	}

	protected void createProduct(String name, int price, boolean isRented) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Product licorne = new Product("Sparky", 150, true);

		session.save(licorne);

		session.getTransaction().commit();
		session.close();
	}

	protected List<Product> readAllProductsAvailable() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		TypedQuery<Product> query = session.createNamedQuery("SELECT * FROM Product p WHERE p.is_rented = 1",
				Product.class);
		List<Product> results = query.getResultList();
		session.getTransaction().commit();
		session.close();

		return results;
	}

	protected void update() {

	}

	protected void delete() {

	}

	public static void main(String[] args) {
		// code to run the program
		BusinessService manager = new BusinessService();
		manager.setup();

		manager.exit();
	}
}
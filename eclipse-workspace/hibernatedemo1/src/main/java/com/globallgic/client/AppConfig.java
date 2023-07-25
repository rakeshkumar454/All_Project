package com.globallgic.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.globallogic.entity.Product;

public class AppConfig {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Product product = new Product();
		product.setProductId(1);
		product.setName("Laptop");
		product.setCategory("Electronics");
		product.setPrice(53000.5);
		System.out.println("Inserted");

		session.save(product);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}

package com.vasanth.springworkshop.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemoUpdate {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		// ALL QUERIES IN HIBERNATE MUST HAPPEN WITHIN TRANSACTIONS ONLY
		
		session.beginTransaction();
		
		// 1) Update a single object from the table
		
		Student stu=session.get(Student.class, 4);
		
		stu.setFirstName("Praveen");
		stu.setLastName("Kumar");
		
		System.out.println(stu);
		
		session.getTransaction().commit();
		
		
		Session session1=factory.getCurrentSession();
		
		
		session1.beginTransaction();
		// 2) Execute a query to update multiple objects
		
		int n=session1.createQuery("update Student set firstName='Vasanth' "
				+ "where id in (7,8,9)").executeUpdate();
		
		System.out.println(n +"rows affected!");

		
		session1.getTransaction().commit();
		
		factory.close();
	

	}

}

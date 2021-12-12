package com.vasanth.springworkshop.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemoCreate {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		// ALL QUERIES IN HIBERNATE MUST HAPPEN WITHIN TRANSACTIONS ONLY
		
		session.beginTransaction();
		
		Student stu=new Student(9,"Yash","Gupta");
		
		session.save(stu);
		
		session.getTransaction().commit();
		
		factory.close();
	

	}

}

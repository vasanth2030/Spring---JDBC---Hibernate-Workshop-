package com.vasanth.springworkshop.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemoRead {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		// ALL QUERIES IN HIBERNATE MUST HAPPEN WITHIN TRANSACTIONS ONLY
		
		session.beginTransaction();
		
		// 1) session.get() -> Get single object from the table
		
		Student stu=session.get(Student.class, 4);
		
		System.out.println(stu);
		
		session.getTransaction().commit();
		
		
		Session session1=factory.getCurrentSession();
		
		
		session1.beginTransaction();
		// 2) Execute a query
		
		List<Student> stuList=session1.createQuery("from Student where id=5").getResultList();
		
		for(Student s: stuList)
		{
			System.out.println(s);
		}
		
		session1.getTransaction().commit();
		
		factory.close();
	

	}

}

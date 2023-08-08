package com.diigitTraining.aadharInfo;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

//import hibernate.student;

//import hibernate.student;



public class HibernateManager {
	private Session session;

	public HibernateManager() {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionfactory = configuration.buildSessionFactory(builder.buildServiceRegistry());
		session = sessionfactory.openSession();
		System.out.println("CONNECTED TO PF..........");

	}

	public boolean saveObj(addharInfo ad) {
		Transaction tran = session.beginTransaction();
		Serializable save = session.save(ad);
		tran.commit();
		if (save != null) {
			return true;
		}
		return false;
	}

	public ArrayList readAll() {
		session.beginTransaction();
		Query q = session.createQuery("from addharInfo");
		List li = q.list();
		Iterator itr = li.iterator();
		ArrayList li1 = new ArrayList();
		
		while (itr.hasNext()) {
			addharInfo ad = (addharInfo) itr.next();
			li1.add(ad);
		}
		
		return li1;
		
	}
	public void update(int id, String email) {
		Transaction t = session.beginTransaction();
		addharInfo s = (addharInfo)session.get(addharInfo.class, id);
		s.setEmail(email);
		session.update(s);
	
		System.out.println("update Success");
		t.commit();
		
	}
	public void delete(int id) {
		Transaction t = session.beginTransaction();
		addharInfo s = (addharInfo)session.get(addharInfo.class, id);
//		s.setEmail(email);
		session.delete(s);
		System.out.println("delete Success");
		t.commit();
		
	}
//	public void specificRead(String roll) {
//		session.beginTransaction();
//		addharInfo s = (addharInfo) session.get(student.class, roll);
//		System.out.println(s.getName() + "  " + s.getRoll());
//
//	}


}

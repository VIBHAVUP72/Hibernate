package org.jsp.hibdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser 
{
	public static void main(String[] args) 
	{
		User u = new User();
		u.setName("ABC");
		u.setAge(24);
		u.setPhone(8888);
		u.setPassword("a123");
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		s.save(u);
		Transaction t = s.beginTransaction();
		t.commit();
		System.out.println("user saved with ID:" + u.getId());
	}
}

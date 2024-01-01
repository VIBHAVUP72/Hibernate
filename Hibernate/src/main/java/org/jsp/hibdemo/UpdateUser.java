package org.jsp.hibdemo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser 
{
	public static void main(String[] args) 
	{
		User u = new User();
		u.setId(2);
		u.setName("rawnak");
		u.setPassword("bdsm234");
		u.setAge(22);
		u.setPhone(89786756499l);
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		s.update(u);
		t.commit();
	}
}

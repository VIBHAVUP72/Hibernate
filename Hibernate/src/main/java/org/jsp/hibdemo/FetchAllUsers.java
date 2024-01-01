package org.jsp.hibdemo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class FetchAllUsers
{
	public static void main(String[] args) 
	{
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q = s.createQuery("select u from User u");
		List<User> users = q.getResultList();
		for(User u : users)
		{
			System.out.println("ID : "+u.getId());
			System.out.println("Name : "+u.getName());
			System.out.println("Age : "+u.getAge());
			System.out.println("Phone : "+u.getPhone());
			System.out.println("------------------------");
		}
	}
}

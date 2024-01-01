package org.jsp.hibdemo;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UserLogin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Phone Number");
		long phone = sc.nextLong();
		System.out.println("Enter your Password");
		String password = sc.next();
		String hql = "select u from User u where u.phone=?1 and u.password=?2";
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q = s.createQuery(hql);
		q.setParameter(1,phone);
		q.setParameter(2,password);
		List<User> users = q.getResultList();
		if(users.size()>0)
		{
			User u = users.get(0);
			System.out.println("Welcome Mr. "+u.getName()+", Your are Succesfully Logged in");
			System.out.println("ID: "+u.getId());
			System.out.println("Age: "+u.getAge());
			System.out.println("Phone Number: "+u.getPhone());
		}
		else
		{
			System.out.println("Invalid Phone Number or Password");
		}
		sc.close();
	}
}

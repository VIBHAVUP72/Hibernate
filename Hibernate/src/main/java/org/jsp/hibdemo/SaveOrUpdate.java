package org.jsp.hibdemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdate {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID to update");
		int id = sc.nextInt();
		System.out.println("Enter the Name, Phone, Age, Password");
		String name = sc.next();
		long phone = sc.nextLong();
		int age = sc.nextInt();
		String password = sc.next();
		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setAge(age);
		u.setPhone(phone);
		u.setPassword(password);
		Session s1 = new Configuration().configure().buildSessionFactory().openSession();
		s1.saveOrUpdate(u);
		Transaction t = s1.beginTransaction();
		t.commit();
		sc.close();	
	}
}

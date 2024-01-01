package org.jsp.hibdemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test 
{
	public static void main(String args[])
	{
		  Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		     SessionFactory factory=cfg.buildSessionFactory();
		     System.out.println(factory);
	}
}
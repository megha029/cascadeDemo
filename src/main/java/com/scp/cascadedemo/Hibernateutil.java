package com.scp.cascadedemo;

	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
	 
	public class Hibernateutil{
	     
		
			public static SessionFactory sessionFactory = null;

			@SuppressWarnings("deprecation")
			

			public static SessionFactory getSessionFactory() {
				if (null == sessionFactory) {
					sessionFactory = new Configuration().configure().buildSessionFactory();
				}
				return sessionFactory;
	    }
	     
	}

	

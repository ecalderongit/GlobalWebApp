package com.globalapps.common.jpa.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataBaseConnection {
	
	private static SessionFactory sessionFactory;
	
	private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
    	if(null == sessionFactory){
    		sessionFactory = buildSessionFactory();
    	}
        return sessionFactory;
    }
    
    public static void shutdown() {
    	getSessionFactory().close();
    }


}

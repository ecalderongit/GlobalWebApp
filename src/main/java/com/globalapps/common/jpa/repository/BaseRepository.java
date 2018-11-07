package com.globalapps.common.jpa.repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.hibernate.Session;

public class BaseRepository<T> implements Repository<T>{
    private Class<T> type;
    public BaseRepository() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
 
    public T create(final T t) {
    	Session session = DataBaseConnection.getSessionFactory().openSession();
    	session.beginTransaction();
    	session.save(t);
		session.getTransaction().commit();
        return t;
    }
 
 
    public void delete(final Object objeto) {
    	Session session = DataBaseConnection.getSessionFactory().openSession();
    	session.beginTransaction();
    	session.delete(objeto);
		session.getTransaction().commit();
    }
 
    public T find(final Object id) {
    	Session session = DataBaseConnection.getSessionFactory().openSession();
    	session.beginTransaction();
    	T result =  session.find(type, id);
		session.getTransaction().commit();
        return result;
    }
 
    public void update(final T t) {
    	Session session = DataBaseConnection.getSessionFactory().openSession();
    	session.beginTransaction();
    	session.update(t);
		session.getTransaction().commit();
    }
    


    
}

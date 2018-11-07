package com.globalapps.common.jpa.repository;

public interface Repository<T> {
	
	T create(T t);
	 
    void delete(T t);
 
    T find(T t);
 
    void update(T t);
     
}

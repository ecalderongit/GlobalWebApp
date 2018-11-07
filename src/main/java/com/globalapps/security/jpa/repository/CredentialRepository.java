package com.globalapps.security.jpa.repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.globalapps.common.jpa.repository.BaseRepository;
import com.globalapps.common.jpa.repository.DataBaseConnection;
import com.globalapps.security.Credential;

public class CredentialRepository extends BaseRepository<Credential> {


	public Credential findByEmail(String email) {
		Session session = DataBaseConnection.getSessionFactory().openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Credential> cr = cb.createQuery(Credential.class);
		Root<Credential> root = cr.from(Credential.class);
		cr.select(root).where(cb.equal(root.get("email"), email));
		Query<Credential> query = session.createQuery(cr);
		Credential result = query.getSingleResult();
		return result;
	}


}

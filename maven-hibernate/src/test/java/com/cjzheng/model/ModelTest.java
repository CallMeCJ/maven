package com.cjzheng.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;
import com.cjzheng.maven.entity.PersonEntity;
import com.cjzheng.maven.util.HibernateUtil;

public class ModelTest {

	@Test
	public void testGetSession() {
		Session session = HibernateUtil.getSession();
		Assert.assertNotNull(session);
		HibernateUtil.closeSession();
	}

	@Test
	public void testSave() {
		PersonEntity person = new PersonEntity();
		person.setId(100);
		person.setName("路飞");
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}

}
package com.spring.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.spring.model.Alien;
@Component
public class AlienDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public List<Alien> getAliens(){
		Session session = sessionFactory.getCurrentSession();
		List<Alien> aliens = session.createQuery("from Alien").list();
		return aliens;
	}
}

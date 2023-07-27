package com.spring.mvc.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.Session;
import com.spring.mvc.model.Alien;
@Component
public class AlienDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public List<Alien> getAliens(){
		Session session = sessionFactory.getCurrentSession();
		List <Alien> aliens = session.createQuery("from Alien",Alien.class).list();
		return aliens;
	}
}



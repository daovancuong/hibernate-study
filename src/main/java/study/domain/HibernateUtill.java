package study.domain;

import org.apache.log4j.chainsaw.Main;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {
	private static final SessionFactory SESSION_FACTORY = builSessionFactory();

	private static SessionFactory builSessionFactory() {
		// TODO Auto-generated method stub
		return new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFacetory() {
		return SESSION_FACTORY;

	}

	public static void main(String[] args) {
		HibernateUtill.getSessionFacetory();
	}

}

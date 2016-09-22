package hibernate.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import study.domain.Customer;
import study.domain.Order;

public class Chaper_20 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		List<Customer> customers= session.createQuery("from Customer where name like :name").setParameter("name", "aaa").list();
		System.out.println(">>>get customers size:"+customers.size());
		transaction.commit();
		session.close();
		for (Order order : customers.get(0).getOrders() ) {
			System.out.println(">>>>>>order name:"+order.getName());
		}
		sessionFactory.close();

	}

}

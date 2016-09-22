package study.generic;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public abstract class GenericDAOImpl<E, K extends Serializable> implements GenericDAO<E, K> {
	@Autowired
	private SessionFactory sessionFactory;
	protected Class<? extends E> daoType;

	public GenericDAOImpl() {
		// TODO Auto-generated constructor stub
		Type type = getClass().getGenericSuperclass();
		ParameterizedType parameterizedType = (ParameterizedType) type;
		daoType = (Class) parameterizedType.getActualTypeArguments()[0];
	}

	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(E entity) {
		currentSession().save(entity);
	}

	public E findById(K k) {
		return (E) currentSession().get(daoType, k);
	}

	public List<E> getAll() {
		// TODO Auto-generated method stub
		return currentSession().createCriteria(daoType).list();
	}

}

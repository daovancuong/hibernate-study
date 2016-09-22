package study.generic;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public abstract class GenericServiceImpl<E, K> implements GenericService<E, K> {

	private GenericDAO<E, K> genericDAO;

	public GenericServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public GenericServiceImpl(GenericDAO<E, K> genericDAO) {
		super();
		this.genericDAO = genericDAO;
	}

	public void add(E entity) {
		// TODO Auto-generated method stub
		genericDAO.add(entity);

	}

	public E findById(K k) {
		// TODO Auto-generated method stub
		return genericDAO.findById(k);
	}
	
	public List<E> getAll() {
		// TODO Auto-generated method stub
		return genericDAO.getAll();
	}

}

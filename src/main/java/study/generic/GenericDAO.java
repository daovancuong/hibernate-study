package study.generic;


import java.util.List;

public interface GenericDAO<E, K> {
	public void add(E entity);

	public E findById(K k);
	
	public List<E> getAll();

}

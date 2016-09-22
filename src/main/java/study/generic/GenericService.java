package study.generic;


import java.util.List;

public interface GenericService<E, K> {
	void add(E entity);

	E findById(K k);

	List<E> getAll();

}

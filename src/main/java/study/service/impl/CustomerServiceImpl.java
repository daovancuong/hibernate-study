package study.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.dao.CustomerDAO;
import study.domain.Customer;
import study.generic.GenericDAO;
import study.generic.GenericServiceImpl;
import study.service.CustomerService;


@Service
@Transactional
public class CustomerServiceImpl extends GenericServiceImpl<Customer, String> implements CustomerService {
	
	private CustomerDAO customerDAO;
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public CustomerServiceImpl(@Qualifier("customerDaoImpl") GenericDAO<Customer, String> genericDAO) {
		super(genericDAO);
		// TODO Auto-generated constructor stub
	}

}

package study.dao.Impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import study.dao.CustomerDAO;
import study.domain.Customer;
import study.generic.GenericDAOImpl;

@Repository
public class CustomerDaoImpl extends GenericDAOImpl<Customer, String> implements CustomerDAO{

	

}

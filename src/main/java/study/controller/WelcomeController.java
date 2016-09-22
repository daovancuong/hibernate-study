package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import study.domain.Customer;
import study.service.CustomerService;

/**
 * @author CSE
 * @version 1.0 Aug 13, 2016
 */
@Controller
public class WelcomeController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/hello")
	public String getInitialPage(Model model) {
//		List<Customer> all = customerService.getAll();
//		model.addAttribute("customers", all);
//		String ids = "";
//		for (Customer customer : all) {
//			ids += customer.getId() + ",";
//		}
//		model.addAttribute("ids", ids);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//		System.out.println(all.get(0).getOrders());
		return "index";
	}
	
	

}

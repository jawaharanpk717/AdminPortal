package com.example.AdminPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.AdminPortal.Entity.AgentEntity;
import com.example.AdminPortal.ServiceImpl.AdminServiceImpl;

@RestController
public class AdminController {
	
	
	@Autowired
	AdminServiceImpl adminserviceimpl;
	
	
	@RequestMapping(value = "/addAgent", method = RequestMethod.POST, headers = "Accept=application/json")
	public AgentEntity addAgent(@RequestBody AgentEntity customer) {
		return adminserviceimpl.addAgent(customer);
 
	}
 
	@RequestMapping(value = "/addAgent", method = RequestMethod.PUT, headers = "Accept=application/json")
	public AgentEntity updateAgent(@RequestBody AgentEntity customer) {
		return adminserviceimpl.updateAgent(customer); 
 
	}	
 
	@RequestMapping(value = "/deleteAgent/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCustomer(@PathVariable("id") int id) {
		 adminserviceimpl.deleteAgent(id);

}
	
	@RequestMapping(value = "/getBranchWiseAgent/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public void getBranchWiseAgent(@PathVariable String AgentBranchName) {
		adminserviceimpl.getBranchWiseAgent(AgentBranchName);
	}
	
	
	
	
	
	
	
}

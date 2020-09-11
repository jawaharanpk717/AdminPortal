package com.example.AdminPortal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.AdminPortal.Entity.InsurerEntity;
import com.example.AdminPortal.ServiceImpl.AgentServiceImpl;

@RestController
public class AgentController {
	
	@Autowired
	AgentServiceImpl agentserviceimpl;
	
	
	@RequestMapping(value = "/AddPayment/{Payment_Mode}/{Insurer_Name}", method = RequestMethod.POST, headers = "Accept=application/json")
	public void AddInsurerPayment(@PathVariable("Payment_Mode") String Payment_Mode,@PathVariable("Insurer_Name") String Insurer_Name) {
		agentserviceimpl.AddPayment(Payment_Mode,Insurer_Name);

}
 
	@RequestMapping(value = "/addInsurer", method = RequestMethod.POST, headers = "Accept=application/json")
	public InsurerEntity CreateInsurer(@RequestBody InsurerEntity insurer_entity) {
		return agentserviceimpl.addinsurer(insurer_entity);
 
	}
 

}

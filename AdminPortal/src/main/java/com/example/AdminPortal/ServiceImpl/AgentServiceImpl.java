package com.example.AdminPortal.ServiceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdminPortal.Entity.InsurerEntity;
import com.example.AdminPortal.Repository.AgentDao;

@Service("AgentService")
public class AgentServiceImpl {

	@Autowired
	AgentDao agentdao;
	
	@Transactional
	public  InsurerEntity addinsurer(InsurerEntity insurerentity) {
		agentdao.addInsurer(insurerentity);
		return insurerentity;
	}
	
	@Transactional
	public  void AddPayment(String payment_Mode,String Insurer_Name) {
		agentdao.addpayment(payment_Mode,Insurer_Name);
	}

	

}

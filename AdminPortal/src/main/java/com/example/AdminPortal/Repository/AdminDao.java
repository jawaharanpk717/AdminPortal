package com.example.AdminPortal.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.AdminPortal.Entity.AgentEntity;

@Repository
public class AdminDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public AgentEntity addAgent(AgentEntity agententity) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(agententity);
		return agententity;
		
	}
	
	public void updateAgent(AgentEntity agententity) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(agententity);
	}
 
	public void deleteAgent(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		AgentEntity p = (AgentEntity) session.load(AgentEntity.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
}
	
	public List<AgentEntity> getBranchWiseAgents(String AgentBranchName) {
		Session session = this.sessionFactory.getCurrentSession();
		List<AgentEntity>  AgentList = session.createQuery("from AgentEntity where AgentBranchName:=AgentBranchName").list();
		return AgentList;
	}
}

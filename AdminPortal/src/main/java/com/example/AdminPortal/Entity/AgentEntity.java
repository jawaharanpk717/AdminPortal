package com.example.AdminPortal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AGENTENTITY")
public class AgentEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="AgentName")
	private String AgentName;
	
	@Column(name="AgentBranchName")
	private String AgentBranchName;

	public AgentEntity(String agentName, String agentBranchName) {
		super();
		AgentName = agentName;
		AgentBranchName = agentBranchName;
	}

	public String getAgentName() {
		return AgentName;
	}

	public void setAgentName(String agentName) {
		AgentName = agentName;
	}

	public String getAgentBranchName() {
		return AgentBranchName;
	}

	public void setAgentBranchName(String agentBranchName) {
		AgentBranchName = agentBranchName;
	}
	
	
	
	
}

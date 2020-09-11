package com.example.AdminPortal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INSURERENTITY")
public class InsurerEntity {
	
	@Id
	@Column(name="Insurer_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Insurer_id;
	
	@Column(name="Payment_Mode")
	private String Payment_Mode;
	
	@Column(name="Insurer_Name")
	private String Insurer_Name;
	
	@Column(name="Insurer_ContactNumber")
	private String Insurer_ContactNumber;
	
	@Column(name="Insurer_Email")
	private String Insurer_Email;

	public InsurerEntity(String payment_Mode, String insurer_Name, String insurer_ContactNumber, String insurer_Email) {
		super();
		Payment_Mode = payment_Mode;
		Insurer_Name = insurer_Name;
		Insurer_ContactNumber = insurer_ContactNumber;
		Insurer_Email = insurer_Email;
	}

	public String getPayment_Mode() {
		return Payment_Mode;
	}

	public void setPayment_Mode(String payment_Mode) {
		Payment_Mode = payment_Mode;
	}

	public String getInsurer_Name() {
		return Insurer_Name;
	}

	public void setInsurer_Name(String insurer_Name) {
		Insurer_Name = insurer_Name;
	}

	public String getInsurer_ContactNumber() {
		return Insurer_ContactNumber;
	}

	public void setInsurer_ContactNumber(String insurer_ContactNumber) {
		Insurer_ContactNumber = insurer_ContactNumber;
	}

	public String getInsurer_Email() {
		return Insurer_Email;
	}

	public void setInsurer_Email(String insurer_Email) {
		Insurer_Email = insurer_Email;
	}

	public InsurerEntity() {
		super();
	}
	
	

}

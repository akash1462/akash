package com.cognizant.billpaymentsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bill")
public class BillDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	private int id;
	
	@NotNull
	@Column(name= "electricity")
	private int electricity;
	
	@NotNull
	@Column(name= "telephone")
	private int telephone;
	
	@NotNull
	@Column(name= "dth")
	private int dth;
	
	@NotNull
	@Column(name= "insurance")
	private int insurance;
	
	@NotNull
	@Column(name= "tax")
	private int tax;
	
	@NotNull
	@Column(name= "credit_card")
	private int credit_card;
	
	@NotNull
	@Column(name= "loan")
	private int loan;
	
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(unique = true)
	 private User user;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getElectricity() {
		return electricity;
	}


	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	public int getDth() {
		return dth;
	}


	public void setDth(int dth) {
		this.dth = dth;
	}


	public int getInsurance() {
		return insurance;
	}


	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}


	public int getTax() {
		return tax;
	}


	public void setTax(int tax) {
		this.tax = tax;
	}


	public int getCredit_card() {
		return credit_card;
	}


	public void setCredit_card(int credit_card) {
		this.credit_card = credit_card;
	}


	public int getLoan() {
		return loan;
	}


	public void setLoan(int loan) {
		this.loan = loan;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "BillDetails [id=" + id + ", electricity=" + electricity + ", telephone=" + telephone + ", dth=" + dth
				+ ", insurance=" + insurance + ", tax=" + tax + ", credit_card=" + credit_card + ", loan=" + loan
				+ ", user=" + user + "]";
	}
	

}

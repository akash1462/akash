package com.cognizant.billpaymentsystem.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_id")
	private int id;
	
	@NotNull
	@Column(name = "us_userid")
	private String userid;
	
	@NotNull
	@Column(name = "us_firstname")
	private String firstName;
	
	@NotNull
	@Column(name = "us_lastname")
	private String lastName;
	
	@NotNull
	@Column(name = "us_password")
	private String password;
	
	@NotNull
	@Column(name = "us_gender")
	private String gender;
	
	@NotNull
	@Column(name = "us_age")
	private int age;
	
	@NotNull
	@Column(name = "us_contact")
	private long contact;
	
	@NotNull
	@Column(name = "us_pan")
	private String pan;
	
	@NotNull
	@Column(name = "us_aadhar")
	private String aadhar_number;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}


	
	
//	@ManyToMany
//	@JoinTable(name = "cart", joinColumns = @JoinColumn(name = "ct_us_id"), inverseJoinColumns = @JoinColumn(name = "ct_pr_id"))
//	private List<MenuItem> menuItems;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "ur_us_id"), inverseJoinColumns = @JoinColumn(name = "ur_ro_id"))
	private List<Role> roles;

	public User() {
		super();
	}

//	public List<MenuItem> getMenuItems() {
//		return menuItems;
//	}
//
//	public void setMenuItems(List<MenuItem> menuItems) {
//		this.menuItems = menuItems;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

//	@Override
//	public String toString() {
//		return "User [id=" + id + ", userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName
//				+ ", password=" + password + ", gender=" + gender + ", age=" + age + ", contact=" + contact + ", pan="
//				+ pan + ", aadhar_number=" + aadhar_number + ", roles=" + roles + "]";
//	}


	 @OneToOne(mappedBy = "user")
	 private BillDetails billDetails;

	@Override
	public String toString() {
		return "User [id=" + id + ", userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", gender=" + gender + ", age=" + age + ", contact=" + contact + ", pan="
				+ pan + ", aadhar_number=" + aadhar_number + ", roles=" + roles + ", billDetails=" + billDetails + "]";
	}

	public BillDetails getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(BillDetails billDetails) {
		this.billDetails = billDetails;
	}

}
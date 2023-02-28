package com.revature.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	private String adminName;
	private String adminEmail;
	private String address;
	private String phone;
	private String gender;
	private String aadharCard;
	private String dob;
	@Id
	private String username;
	private String password;
	
	
	
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminEmail=" + adminEmail + ", address=" + address + ", phone="
				+ phone + ", gender=" + gender + ", aadharCard=" + aadharCard + ", dob=" + dob + ", username="
				+ username + ", password=" + password + "]";
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String adminName, String adminEmail, String address, String phone, String gender, String aadharCard,
			String dob, String username, String password) {
		super();
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.aadharCard = aadharCard;
		this.dob = dob;
		this.username = username;
		this.password = password;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}

package com.app.demo;

public class User {
	private int userId;
	private String name;
	private String address;
	private String contactNo;
	public User() {
		super();
	}
	public User(int userId, String name, String address, String contactNo) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address=" + address + ", contactNo=" + contactNo + "]";
	}
	
}

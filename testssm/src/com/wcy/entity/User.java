package com.wcy.entity;

public class User {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String email;
	private String address;
	public String getName() {
		return name;
	}
	public User(String name, String sex, int age, String email, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}

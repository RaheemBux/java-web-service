package com.test;

public class StudentModel {
	
	private Integer id;
	private String name;
	private String rollNum;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", rollNum="
				+ rollNum + "]";
	}
	
	

}

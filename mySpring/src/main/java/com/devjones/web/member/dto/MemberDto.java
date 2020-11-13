package com.devjones.web.member.dto;

public class MemberDto {
	
	private String student_no;
	private String name;
	private String birth;
	private String grade;
	private String phone;
	private String parents_phone;
	private String sail_date;
	
	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getParents_phone() {
		return parents_phone;
	}
	public void setParents_phone(String parents_phone) {
		this.parents_phone = parents_phone;
	}
	public String getSail_date() {
		return sail_date;
	}
	public void setSail_date(String sail_date) {
		this.sail_date = sail_date;
	}
	
	@Override
	public String toString() {
		return "MemberDto [student_no=" + student_no + ", name=" + name + ", birth=" + birth + ", grade=" + grade
				+ ", phone=" + phone + ", parents_phone=" + parents_phone + ", sail_date=" + sail_date + "]";
	}
}

package com.example.admin.modelVo;

import java.sql.Date;

public class DoctorInfoVO {
	
	private int doctorId;
	private String doctorName;
	private String mobileNo;
	private String emailId;
	private String address;
	private Date birthDate;
	private String gender;
	private String password;
	private String specialization;
	private double chargePerVisit;
	private int workExperience;	
	private String deptName;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public double getChargePerVisit() {
		return chargePerVisit;
	}
	public void setChargePerVisit(double chargePerVisit) {
		this.chargePerVisit = chargePerVisit;
	}
	public int getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}

package com.example.appointment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointmentdetails")
public class AppointmentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	
	@Column(name = "patient_name")
	private String patientName;
	
	@Column(name = "doctor_name")
	private String doctorName;
	
	@Column(name = "date")
	private String appointmentDate;
	
	@Column(name = "appointment_status")
	private String status;
	
	@Column(name = "patient_email")
	private String patientEmail;
	
	@Column(name = "patient_mobile")
	private String patientMobile;
	
	@Column(name = "patient_birth_date")
	private String patientBirthDate;
	
	@Column(name = "disease")
	private String disease;
	
	@Column(name = "doctor_email")
	private String doctorEmail;
	
	@Column(name = "doctor_mobile")
	private String doctorMobile;
	
	public AppointmentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPatientBirthDate() {
		return patientBirthDate;
	}
	public void setPatientBirthDate(String patientBirthDate) {
		this.patientBirthDate = patientBirthDate;
	}
	public String getPatientMobile() {
		return patientMobile;
	}
	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getDoctorMobile() {
		return doctorMobile;
	}
	public void setDoctorMobile(String doctorMobile) {
		this.doctorMobile = doctorMobile;
	}
	
		

}

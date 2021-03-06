package com.example.appointment.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.appointment.model.AppointmentModel;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentModel, Integer>{

	@Query(value = "select * from appointment_management.appointmentdetails where appointment_id=?1", nativeQuery = true)
	public AppointmentModel findByDoctorName(int appointmentId);
	
	@Query(value = "select * from appointment_management.appointmentdetails where patient_email=?1 and appointment_status='ACCEPTED'", nativeQuery = true)
	public List<AppointmentModel> findByPatientEmail(String patientEmail);
	
	@Query(value = "select * from appointment_management.appointmentdetails where appointment_id=?1", nativeQuery = true)
	public AppointmentModel findByAppointmentId(int id);
	
	@Query(value = "select * from appointment_management.appointmentdetails where doctor_email=?1", nativeQuery = true)
    public List<AppointmentModel> findByDoctorEmail(String doctorEmail);
	
	@Query(value = "select * from appointment_management.appointmentdetails where doctor_email=?1 and appointment_status='APPROVAL PENDING'", nativeQuery = true)
	public List<AppointmentModel> getAllPendingAppointments(String doctorEmail);
	
	@Query(value = "select * from appointment_management.appointmentdetails where doctor_email=?1 and date=CURDATE()", nativeQuery = true)
	public List<AppointmentModel> getAllTodaysAppointments(String doctorEmail);
	
	@Query(value = "select * from appointment_management.appointmentdetails where doctor_email=?1 and patient_email=?2 and appointment_status='COMPLETED'",countQuery="select count(*) from appointment_management.appointmentdetails where doctor_email=?1 and patient_email=?2 and appointment_status='COMPLETED'", nativeQuery = true)
	public Page<AppointmentModel> getAllPreviousAppointments(String doctorEmail, String patientEmail, Pageable page);
	
	@Query(value = "SELECT count(appointment_id) FROM appointmentservice.appointmentdetails where doctor_email=?1 and appointment_status='APPROVAL PENDING'", nativeQuery = true)
	public int getAllPendingAppointmentsCount(String doctorEmail);

	@Query(value = "SELECT count(appointment_id) FROM appointmentservice.appointmentdetails where doctor_email=?1 and appointment_status='ACCEPTED' and date=CURDATE()", nativeQuery = true)
	public int getAllTodaysAppointmentsCount(String doctorEmail);
}

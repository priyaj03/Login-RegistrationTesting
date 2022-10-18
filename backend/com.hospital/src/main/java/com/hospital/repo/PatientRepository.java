package com.hospital.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.hospital.bean.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	@Query("select p.pname,p.symptoms,p.mobile from Patient p where p.dpid = :did")
	public List<Patient> findByDpid(@Param("did") int did);
	@Query("select p from Patient p where p.dpid = :did and p.pstatus ='appointed' ")
	public List<Patient> getappoinmentsByid(int did);
	@Query("select p from Patient p where p.dpid = :did and p.pstatus ='discharged' ")
	public List<Patient> dischargePatientByid(int did);
	
	
	

}

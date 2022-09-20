package com.yash.service;

import java.util.List;

import com.yash.entity.Patient;

public interface PatientService {
	public Patient addPatient(Patient p);

	public List<Patient> findAll();

	public Patient findById(int pid);

	public Patient updatepat(Patient p, int pid);

	public String deletePatient(int pid);


}

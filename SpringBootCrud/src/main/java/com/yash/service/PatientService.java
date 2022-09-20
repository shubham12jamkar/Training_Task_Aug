package com.yash.service;

import java.util.List;

import com.yash.entity.patient;

public interface PatientService {
	public patient addPatient(patient p);

	public List<patient> findAll();

	public patient findById(int pid);

	public patient updatepat(patient p, int pid);

}

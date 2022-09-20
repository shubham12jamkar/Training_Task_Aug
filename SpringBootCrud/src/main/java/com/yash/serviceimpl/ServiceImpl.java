package com.yash.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.Department;
import com.yash.entity.Doctor;
import com.yash.entity.Hospital;
import com.yash.entity.Patient;
import com.yash.repository.PatientRepo;
import com.yash.service.PatientService;

@Service
public class ServiceImpl implements PatientService {

	@Autowired
	PatientRepo pr;

	@Override
	public Patient addPatient(Patient p) {

		return pr.save(p);
	}

	@Override
	public List<Patient> findAll() {

		return pr.findAll();
	}

	@Override
	public Patient findById(int pid) {

		return pr.findById(pid).orElse(null);
	}

	@Override
	public Patient updatepat(Patient p, int pid) {
		p.setPid(pid);

		return pr.save(p);
	}

	@Override
	public String deletePatient(int pid) {
		Patient patient = findById(pid);
		pr.deleteById(pid);
		return "delete data successfully";

	}

}

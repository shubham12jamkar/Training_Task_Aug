package com.yash.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.patient;
import com.yash.repository.PatientRepo;
import com.yash.service.PatientService;

@Service
public class ServiceImpl implements PatientService{

	@Autowired
	PatientRepo pr;
	@Override
	public patient addPatient(patient p) {
		
		return pr.save(p);
	}
	@Override
	public List<patient> findAll() {

		return pr.findAll();
	}
	@Override
	public patient findById(int pid) {
		
		return pr.findById(pid).orElse(null);
	}
	@Override
	public patient updatepat(patient p, int pid) {
		p.setPid(pid);
		
		return pr.save(p);
	}
	
	
	

	
}

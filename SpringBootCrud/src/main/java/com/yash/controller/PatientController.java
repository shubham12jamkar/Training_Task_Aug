package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Patient;
import com.yash.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService ps;
	
	@PostMapping("/addPatient")
	public Patient addData(@RequestBody Patient p)
	{
		return ps.addPatient(p);
		
	}
	
	@PostMapping("/updatePatient/{pid}")
	public Patient updateData(@RequestBody Patient p, @PathVariable int pid)
	{
		
		return ps.updatepat(p,pid);
		
	}
	
	@GetMapping("/getPatient")
	public List<Patient> getData()
	{
		return ps.findAll();
		
	}
	@GetMapping(path="/getAllPatient", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Patient> getAllData()
	{
		return ps.findAll();
		
	}
	
	@GetMapping("/getSingleData/{pid}")
	public Patient getSingleData(@PathVariable int pid)
	{
		return ps.findById(pid);
		
	} 

	@DeleteMapping("/deletePatient/{pid}")
	public String deleteData(@PathVariable  int pid)
	{
		ps.deletePatient(pid);
		return "delete successfully";
	
		
	}

}

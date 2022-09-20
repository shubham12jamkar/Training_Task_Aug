package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.patient;
import com.yash.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService ps;
	
	@RequestMapping(value = "/addPatient",method = RequestMethod.POST)
	public patient addData(@RequestBody patient p)
	{
		return ps.addPatient(p);
		
	}
	
	@PostMapping("/updatePatient/{pid}")
	public patient updateData(@RequestBody patient p, @PathVariable int pid)
	{
		
		return ps.updatepat(p,pid);
		
	}
	
	@RequestMapping(value = "/getPatient",method = RequestMethod.GET)
	public List<patient> getData()
	{
		return ps.findAll();
		
	}
	
	@RequestMapping(value = "/getSingleData/{pid}",method = RequestMethod.GET)
	public patient getSingleData(@PathVariable int pid)
	{
		return ps.findById(pid);
		
	}


}

package com.yash.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.entity.patient;

@Repository
public interface PatientRepo extends JpaRepository<patient, Integer>{

}

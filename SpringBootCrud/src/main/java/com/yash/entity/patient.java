package com.yash.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class patient {
	@Id
	private int pid;
	private String pname;
	private long pmobno;
	@OneToOne(cascade = CascadeType.ALL)
	private Doctor doctor;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPmobno() {
		return pmobno;
	}
	public void setPmobno(long pmobno) {
		this.pmobno = pmobno;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	

}

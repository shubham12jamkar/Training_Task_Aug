package com.yash.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	private int hid;
	private String hname;
	private long hmobno;
	private String hlocation;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public long getHmobno() {
		return hmobno;
	}
	public void setHmobno(long hmobno) {
		this.hmobno = hmobno;
	}
	public String getHlocation() {
		return hlocation;
	}
	public void setHlocation(String hlocation) {
		this.hlocation = hlocation;
	}

}

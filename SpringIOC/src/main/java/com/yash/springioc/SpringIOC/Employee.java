package com.yash.springioc.SpringIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting the address");
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside the constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

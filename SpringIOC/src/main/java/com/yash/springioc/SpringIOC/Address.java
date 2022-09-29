package com.yash.springioc.SpringIOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Address implements ApplicationContextAware,BeanNameAware{

	private String street;
	private String city;
	private ApplicationContext context=null;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
		
	}
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name of Bean:" +name);
		
	}
	
	
	
}

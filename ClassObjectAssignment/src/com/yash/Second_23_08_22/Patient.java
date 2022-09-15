package com.yash.Second_23_08_22;

public class Patient {
	private String patientName;
	private double height;
	private double weight;
	public Patient(String patientName, double height, double weight) {
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	
	public double computeBMI()
	{
		return weight/(height*height);
		
	}
	
	public static void main(String[] args) {
		Patient p = new Patient("Shubham", 1.651, 70 );
		double bmi = p.computeBMI();
		System.out.println(p.patientName+":"+bmi);
		
	}
	

}

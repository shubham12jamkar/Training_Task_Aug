package com.yash.Second_23_08_22_Oops_9;

public class Product implements Cloneable{
	private int pid;
	private String pname;
	private double price;
	private int unitOfMeasurement;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUnitOfMeasurement() {
		return unitOfMeasurement;
	}
	public void setUnitOfMeasurement(int unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Product p = new Product();
		p.setPid(1);
		p.setPname("medicine");
		p.setPrice(1000);
		p.setUnitOfMeasurement(199);
		System.out.println(p);
		
		Product p1=(Product)p.clone();
		System.out.println(p1.pname+" "+p1.price);
	}

}

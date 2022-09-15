package com.yash.Second_23_08_22_Oops_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		Employee e = new Employee();
		e.setEmpid(1);
		e.setEmpname("Shubham");
		e.setEmpaddress("pune");
		e.setEmpsalary(55000);

		String dob="12/03/1998";
		Date dobb = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		e.setEmp_dob(dobb);
		
		String doj="15/08/2022";
		Date doj1 = new SimpleDateFormat("dd/MM/yyyy").parse(doj);
		e.setEmp_doj(doj1);
		System.out.println(e);
		
	}

}

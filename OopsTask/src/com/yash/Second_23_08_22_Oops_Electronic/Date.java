package com.yash.Second_23_08_22_Oops_Electronic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	 public static void main(String[] args) {    
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		  }    

}

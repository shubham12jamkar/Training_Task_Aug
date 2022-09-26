package com.yash.JDBC;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentInterface i = new StudentService();
		while(true)
		{
			System.out.println("---------------------------------------");
			System.out.println("Enter 1 for addData");
			System.out.println("Enter 2 for getData");
			System.out.println("Enter 3 for deleteData");
			System.out.println("Enter 4 for updateData");
			System.out.println("-------------------------------------");
			System.out.println("Enter your choice");
			
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				i.addData();
				break;
			case 2:
				i.getData();
				break;
			case 3:
				i.deleteData();
				break;
			case 4:
				i.updateData();
				break;
				
			}
		}
	}

}

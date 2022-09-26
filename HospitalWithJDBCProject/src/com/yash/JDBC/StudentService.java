package com.yash.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentService implements StudentInterface{

	Scanner sc = new Scanner(System.in);
	MyConnection mycon = new MyConnection();
	
	@Override
	public void addData() throws Exception {
	System.out.println("Enter how many data you want to add");
	int data = sc.nextInt();
	for(int i=0;i<data;i++)
	{
		Connection con= mycon.getConnection();
		System.out.println("Enter rollno: ");
		int rollno = sc.nextInt();
		System.out.println("Enter name: ");
		String name= sc.next();
		System.out.println("Enter address");
		String address=sc.next();
		
		String sql = "insert into student values (?,?,?)";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setInt(1, rollno);
		 ps.setString(2, name);
		 ps.setNString(3, address);
		 ps.execute();
		 con.close();
	}
	System.out.println("Insert data successfully");
		
	}

	@Override
	public void getData() throws Exception {
		boolean b = true;
		while(b)
		{
			System.out.println("------------------------------");
			System.out.println("Enter 1 for addData get");
			System.out.println("Enter 2 for single data get");
			System.out.println("Enter 3 for exist");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				Connection con = mycon.getConnection();
				String sql = "select * from student";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
				ps.execute();
				con.close();
				System.out.println("Fetch all data successfully");
				break;
			case 2:
				Connection con1 = mycon.getConnection();
				System.out.println("Enter rollno which you want to retrive");
				int rollno=sc.nextInt();
				String sql1="select * from student where rollno=?";
				PreparedStatement ps1 = con1.prepareStatement(sql1);
				ps1.setInt(1,rollno);
				ResultSet rs1 = ps1.executeQuery();
				while(rs1.next())
				{
					System.out.println(rs1.getInt(1));
					System.out.println(rs1.getString(2));
					System.out.println(rs1.getString(3));
				}
				con1.close();
				System.out.println("single record retrive successfully");
				break;
			case 3:
				b=false;
				break;
			}
		}
	
		
	}

	@Override
	public void deleteData() throws Exception {
		boolean b = true;
		while(b)
		{
			System.out.println("----------------------------------");
			System.out.println("Enter 1 for single row data delete through rollno");
			System.out.println("Enter 2 for multiple row data delete through rollno");
			System.out.println("Enter 3 for multiple row data delete through name");
			System.out.println("Enter 4 for exit");
			System.out.println("-----------------------------------");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				Connection con = mycon.getConnection();
				System.out.println("for delete row");
				System.out.println("Enter which rollno data you want to delete");
				int rollno = sc.nextInt();
				String sql = "delete from student where rollno =?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, rollno);
				ps.execute();
				con.close();
				System.out.println("delete data successfully");
				break;
			case 2:
				Connection con1 = mycon.getConnection();
				System.out.println("for delete multiple row ");
				System.out.println("Enter which rollno between data you want to delete");
				System.out.println("Enter 1st rollno");
				int rn1=sc.nextInt();
				System.out.println("Enter 2nd rollno");
				int rn2=sc.nextInt();
				String sql1 = "delete from student where rollno between ? and ?";
				PreparedStatement ps1= con1.prepareStatement(sql1);
				ps1.setInt(1, rn1);
				ps1.setInt(2, rn2);
				ps1.execute();
				con1.close();
				System.out.println("multiple data delete successfully");
				break;
			case 3:
				Connection con2 = mycon.getConnection();
				System.out.println("for delete multiple row throu name");
				System.out.println("Enter 2 name for delete data");
				System.out.println("Enter 1st name");
				String nm1=sc.next();
				System.out.println("Enter 2nd name");
				String nm2=sc.next();
				String sql2= "delete from student where name in (?,?)";
				PreparedStatement ps2 = con2.prepareStatement(sql2);
				ps2.setString(1, nm1);
				ps2.setString(2, nm2);
				ps2.execute();
				con2.close();
				System.out.println("multiple data delete successfully");
				break;
			case 4:
				b=false;
				break;
			}
		}
		
	}

	@Override
	public void updateData() throws Exception {
		boolean b= true;
		while(b)
		{
			System.out.println("-------------------------------");
			System.out.println("Enter 1 for updata data through rollno");
			System.out.println("Enter 2 for updata data through name");
			System.out.println("Enter 3 for updata data through address");
			System.out.println("--------------------------------------");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				Connection con = mycon.getConnection();
				System.out.println("for update data through rollno");
				System.out.println("Enter which rollno row you want to updata");
				int rollno=sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter address");
				String address = sc.next();
				
				String sql = "update  student set name=?, address=?, where rollno=?";
				PreparedStatement ps= con.prepareStatement(sql);
				ps.setInt(3, rollno);
				ps.setString(1,name);
				ps.setString(2,address);
				ps.execute();
				con.close();
				System.out.println("update data successfully");
				break;
			case 2:
				Connection con1 = mycon.getConnection();
				System.out.println("for update data through name");
				System.out.println("Enter rollno");
				int rollno1=sc.nextInt();
				
				System.out.println("Enter which name you want to update");
				String name1 = sc.next();
				System.out.println("Enter address");
				String address1 = sc.next();
				
				String sql1 = "update  student set rollno=?, address=?, where name=?";
				PreparedStatement ps1= con1.prepareStatement(sql1);
				ps1.setInt(1, rollno1);
				ps1.setString(3,name1);
				ps1.setString(2,address1);
				ps1.execute();
				con1.close();
				System.out.println("update data successfully");
				break;
			case 3:
				Connection con2 = mycon.getConnection();
				System.out.println("for update data through address");
				System.out.println("Enter rollno");
				int rollno2=sc.nextInt();
				
				System.out.println("Enter name");
				String name2 = sc.next();
				System.out.println("Enter which address row you want to update");
				String address2 = sc.next();
				
				String sql2 = "update  student set rollno=?, name=?, where address=?";
				PreparedStatement ps2= con2.prepareStatement(sql2);
				ps2.setInt(1, rollno2);
				ps2.setString(2,name2);
				ps2.setString(3,address2);
				ps2.execute();
				con2.close();
				System.out.println("update data successfully");
				break;
			case 4:
				b=false;
				break;
			}
		}
		
	}

}

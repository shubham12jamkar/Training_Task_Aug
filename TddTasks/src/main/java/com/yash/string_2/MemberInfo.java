package com.yash.string_2;

public class MemberInfo {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String role;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String showMemberDetail()  {
		 setFirstName("Pankaj");

		 setLastName("Sharma");
		 setEmail("sharma.pankaj@yash.com");
		 setPassword("12345");
		 setRole("Trainer");
		
		return "{name:"+this.getFirstName()+" "+this.getLastName()  +",email :"+ this.getEmail()+", password :"+this.getPassword()+", role:"+this.getRole()+"}";
	}
	
	
}

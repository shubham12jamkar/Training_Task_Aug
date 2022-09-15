package com.yash.Second_23_08_22_Oops_4;

import java.util.Scanner;

public class Area
{
	int a, b, c, area, volume;
public void m1() 
{
System.out.println("Enter The 3 side");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a==b||b==c||a==c)
{
 if(a==b)
 {
	 System.out.println("Area is "+(a*b));
	 
 }
 else if(b==c)
 {
	 System.out.println("Area is "+(b*c));
 }
 
 else if(a==c)
 {
	 System.out.println("Area is "+(a*c));
 }
}
 else
 {
	 System.out.println("Volume is "+(a*b*c));
 }
}
public static void main(String[] args)
{
Area a=new Area();
a.m1();
}
}

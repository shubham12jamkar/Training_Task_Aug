package com.yash.Second_23_08_22_Oops_7;

import java.util.Scanner;

public class Comparison implements StringComparison{

	@Override
	public void compareString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String st1=sc.next();
		
		System.out.println("Enter String 2");
		String st2=sc.next();
		
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					System.out.println("char is :"+ch1[i]+":"+ch2[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		StringComparison c = new Comparison();
		c.compareString();
	}

}

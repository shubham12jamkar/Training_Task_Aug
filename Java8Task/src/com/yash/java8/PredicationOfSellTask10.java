package com.yash.java8;

import java.util.HashMap;
import java.util.Scanner;

public class PredicationOfSellTask10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Double> hm = new HashMap<>();
		Integer year = null;
		Double sell = null;
		System.out.println("Enter year and sell in crore");
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter year: ");
			year = sc.nextInt();
			System.out.println("Enter sell: ");
			sell = sc.nextDouble();
			hm.put(year, sell);
		}
		hm.put((year+1), (sell+0.5));
		hm.put((year+2), (sell+1));
		hm.put((year+3), (sell+1.5));
		
		System.out.println("your data"+hm);
		System.out.println("Enter year for predication of sell for any given year");
		int input = sc.nextInt();
		hm.forEach((k,v)->System.out.println("year is"+k+"sell is"+v));
		System.out.println(hm);
	}

}

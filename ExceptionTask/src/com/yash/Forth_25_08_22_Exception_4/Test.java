package com.yash.Forth_25_08_22_Exception_4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ItemPurchaseLimitExceed {
		System.out.println("----------------Welcome To D-Mart-------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Customer");
		int size = sc.nextInt();

		for (int i = 0; i <= size; i++) {
			Item item = new Item();
			Category category = new Category();

			System.out.println("Please Enter catogory:- ");
			sc.nextLine();
			String catname = sc.next();

			System.out.println("Enter Item Name:- ");
			String itemname = sc.next();
			System.out.println("Enter price:- ");
			float price = sc.nextFloat();
			System.out.println("Enter the Item Quantity:- ");
			int itqut = sc.nextInt();

			ItemBought ib = new ItemBought();
			ib.setItemid(i);
			sc.nextLine();

		}

	}

}

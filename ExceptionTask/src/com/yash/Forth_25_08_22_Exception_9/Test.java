package com.yash.Forth_25_08_22_Exception_9;

import java.util.Scanner;

public class Test {
	static int collarCount = 0;

	public static void getCollarDetails() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Enter The Collar Size");

			double collarSize = sc.nextDouble();

			if (collarSize >= 29.4 && collarSize <= 30.6) {
				collarCount++;

			}

		}
		try {
			if (collarCount > 5) {
				System.out.println("Total collars with accepted standard deviation =" + collarCount);
			} else {
				throw new CollarStandardDeviateException("The collars Standard Deviation is not satisfying");

			}

		} catch (CollarStandardDeviateException e) {

			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		getCollarDetails();

	}
}

package com.yash.First_Array22_08_22;

public class Task10_SortByLength {
	public static void main(String[] args) {
		String a[] = { "a hero", "either", "die", "we", "or", "live enough to see urself become a", "villian" };

		String temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].length() > a[j].length()) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

}

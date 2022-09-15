package com.yash.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2_BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {12,23,34,56,78};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println("Enter no to which you want to search");
		int k = sc.nextInt();
		
		System.out.println(k+"found at index: "+Arrays.binarySearch(arr, k));
	}

}

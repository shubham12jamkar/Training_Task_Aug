package com.yash.java8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CheckPalindrome_Task1 {
	
	public static boolean isPalindrome(int number) {
		
		return number == IntStream.iterate(number, i -> i / 10)
		        .map(n -> n % 10)
		        .limit(String.valueOf(number).length())
		        .reduce(0, (a, b) -> a = a * 10 + b);
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		System.out.println(num+" is palindrome = "+isPalindrome(num));

	}

}

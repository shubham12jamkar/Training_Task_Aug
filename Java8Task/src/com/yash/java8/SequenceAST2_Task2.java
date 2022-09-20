package com.yash.java8;

import java.util.Arrays;

public class SequenceAST2_Task2 {

		public static void main(String[] args) {
		String given[] = { "Taj is situated in Agra" };
		String find = "AST";
		boolean anyMatch = Arrays.stream(given).anyMatch(s -> s.contains(find));
		System.out.println(anyMatch);
		if (anyMatch == true) {
		System.out.println(find + " String found");
		}
		else
		{
		System.out.println(find + " String not found");
		}

		}


	}

package com.yash.Forth_25_08_22_Exception_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			while ((line = br.readLine()) != null) {
				System.out.println("Line =>" + line);
			}
		} catch (IOException e) {
			System.out.println("IOException in try block =>" + e.getMessage());
		}
	}
}

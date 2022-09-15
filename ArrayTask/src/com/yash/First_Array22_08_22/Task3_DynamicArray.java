package com.yash.First_Array22_08_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3_DynamicArray {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array :: ");
	        int size = sc.nextInt();
	        String myArray[] = new String[size];
	        System.out.println("Enter elements of the array (Strings) :: ");
	        for (int i = 0; i < size; i++) {
	            myArray[i] = sc.next();
	        }
	        System.out.println(Arrays.toString(myArray));
	        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
	        System.out.println("Enter the element that is to be added:");
	        String element = sc.next();
	        myList.add(element);
	        myArray = myList.toArray(myArray);
	        System.out.println(Arrays.toString(myArray));
	    }

}

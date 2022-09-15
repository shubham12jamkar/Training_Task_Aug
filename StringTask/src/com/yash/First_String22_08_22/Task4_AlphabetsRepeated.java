package com.yash.First_String22_08_22;

public class Task4_AlphabetsRepeated {
	public static void main(String[] args) {
        
	    String s = "aabbccddeegfdfc";
	    int count = 0;

	   char[] cs = s.toCharArray();

	   for (int i = 0; i < cs.length - 1; i++) {
	        for (int j = i + 1; j < cs.length; j++) 
	        {

	        	if (cs[i] == cs[j]) 
	        	{
	                count++;
	            }
	            break;
	        }



	   }
	    System.out.println(count);



	   }

}

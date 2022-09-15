package com.yash.Second_23_08_22_Oops_8;

public class Test {
	
	public static void main(String[] args)
	{
		Test t =new Test();
		
		System.gc();
		t=null;
		System.gc();
		System.out.println("ENd------------");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method");
		
	}


	
	

}

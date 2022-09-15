package com.yash.Second_23_08_22_Oops_5;

public class Div extends Mul{

	@Override
	void div(int a, int b) {
		int c=a/b;
		System.out.println("div: "+c);
		
	}
	public static void main(String[] args) {
		CalcAbs c = new Div();
		c.sum(10, 20);
		c.sub(20, 10);
		c.mul(10, 10);
		c.div(50, 2);
	}

}

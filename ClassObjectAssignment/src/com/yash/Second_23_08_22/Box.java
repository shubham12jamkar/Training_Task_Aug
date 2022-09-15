package com.yash.Second_23_08_22;

public class Box {
	int width;
	int height;
	int depth;
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public int volume()
	{
		return width*height*depth;
		
	}
	public static void main(String[] args) {
		Box b = new Box(5,6,8);
		int vol = b.volume();
		System.out.println(vol);
	}
	

}

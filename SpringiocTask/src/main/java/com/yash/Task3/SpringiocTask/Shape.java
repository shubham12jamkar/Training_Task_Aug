package com.yash.Task3.SpringiocTask;

public abstract class Shape {

	abstract void draw();
}

class Rectangle extends Shape
{
	@Override
	void draw() {
		 System.out.println("Rectangle");
	}
}

class Triangle extends Shape
{
	@Override
	void draw() {
		System.out.println("Triangle");		
	}
}

class Parallelogram extends Shape
{
	@Override
	void draw() {
		System.out.println("Parallelogram");		
	}
}
package com.yash.Task3.SpringiocTask;

public class DrawShape {
	private Rectangle rectangle;
	private Triangle triangle;
	private Parallelogram parallelogram;
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Parallelogram getParallelogram() {
		return parallelogram;
	}
	public void setParallelogram(Parallelogram parallelogram) {
		this.parallelogram = parallelogram;
	}
	public void displayInfo()
	{
		rectangle.draw();
		triangle.draw();
		parallelogram.draw();
	}

}

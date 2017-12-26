package ru.job4j.condition;

/**
	* @author George Almazov (try_again34@tuta.io)
	* @version $Id$
	* @since 0.1
	*/
public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point that) {
		Point a = this;
		Point b = that;
		int x1 = a.x;
		int y1 = a.y;
		int x2 = b.x;
		int y2 = b.y;
		double result =  Math.sqrt(
				Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
		);
		return result;
	}

	public static void main(String[] args) {
		Point a = new Point(0, 1);
		Point b = new Point(2, 5);
		//do call method
		System.out.println("x1 = " + a.x);
		System.out.println("y1 = " + a.y);
		System.out.println("x2 = " + b.x);
		System.out.println("y2 = " + b.y);

		double result = a.distanceTo(b);
		System.out.println("Расстояние между двумя точками A и B : " + result);
	}
}


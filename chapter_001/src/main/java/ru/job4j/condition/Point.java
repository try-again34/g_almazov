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
		System.out.println("x1 = " + a.x);
		System.out.println("y1 = " + a.y);
		System.out.println("x2 = " + b.x);
		System.out.println("y2 = " + b.y);
		return -1;
//		return Math.sqrt(
//				Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
//		);
	}

	public static void main(String[] args) {
		Point a = new Point(0, 1);
		Point b = new Point(2, 5);
	}
		}


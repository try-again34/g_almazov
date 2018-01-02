package ru.job4j.condition;
public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle (Point a, Point b, Point c) 
		this.a=a;
		this.b=b;
		this.c=c;
		
public double area() {
    double rsl = -1;
    double ab = this.a.distanceTo(this.b);
    double ac = this.a.distanceTo(this.c);
    double bc = this.b.distanceTo(this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) 
	// написать формулу для расчета площади треугольника.
	rsl = math.sqrt(p(p-a)(p-b)(p-c)/2);
    return rsl;
}
}

//метод exist проверяет условие, возможно ли построение треугольника
private boolean exist(double ab, double ac, double bc) {
   if (a+b>c && b+c>a && c+a>b);
		return true;
	else
		return false;
}
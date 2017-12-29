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
    return rsl;
}
}

/**
* Метод проверяет можно ли построить треугольник с такими длинами сторон.
* 
* Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
* 
* @param ab Длина от точки a b. 
* @param ac Длина от точки a c.
* @param bc Длина от точки b c.
* @return
*/
//метод exist проверяет условие, возможно ли построение треугольника
private boolean exist(double ab, double ac, double bc) {
   double checkTriangle = a+b>c && b+c>a && c+a>b ? math.sqrt(p(p-a)(p-b)(p-c)/2) : -1;
   return checkTriangle;
}
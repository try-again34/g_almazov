public class Calculator {
	private double result;
	
	public double getResult() {
		return this.result;
	}
	
	//сложение
	public void add(double first, double second)  {
	this.result = first + second;
	}	
	
	//вычитание
	public void subtract(double first, double second) {
	this.result = first - second;
	}	
	
	//деление
	public void div(double first, double second) {
	this.result = first / second;
	}
	
	//умножение
	public void multiple(double first, double second) {
	this.result = first * second;
}
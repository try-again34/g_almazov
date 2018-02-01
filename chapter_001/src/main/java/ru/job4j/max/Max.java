package ru.job4j.max;
public class Max {
	public int max(int first, int second) {
	return first >second ? first : second;
	}

	public int max(int first, int second, int third)
	int a = this.max(first, second); //находим максимальное число из первых двух значений
	int b = this.max(a.third); //находим макс из уже найденного максимума и оставшегося числа и тем самым получаем в итоге максимум из трех чисел
	return b;
	
	//return this.max(this.max(first, second), third); //сокращенный вариант

}
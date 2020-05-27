package com.startjava.lesson_1.variable;

public class Variable {
	public static void main(String[] args) {
	byte numOfCpuCores = 4;
	short freqCpuMhz = 3200;
	int priceCpuRub = 10000;
	long priceNewCpuRub = 15000;
	float exactPriceCpuRub = 10500.50f;
	double exactPriceNewCpuRub = 15600.60;
	char firstLOfCpu = 'I';
	boolean isGoodCPU = true;

	System.out.println(
		"Кол-во ядер: " + numOfCpuCores + 
		"\nЧастота проц-ра: " + freqCpuMhz +
		"\nЦена на проц-ор: " + priceCpuRub + 
		"\nЦена на новый проц-ор: " + priceNewCpuRub +
		"\nТочная цена на проц-ор: " + exactPriceCpuRub +
		"\nТочная цена на новый проц-ор: " + exactPriceNewCpuRub +
		"\nПервая буква названия проц-ра: " + firstLOfCpu +
		"\nХороший ли процессор?: " + isGoodCPU);
	}
}
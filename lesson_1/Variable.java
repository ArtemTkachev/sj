public class Variable {
	public static void main(String[] args) {
	byte numOfCPUCores = 4;
	short freqCPUMHz = 3200;
	int priceCPURub = 10000;
	long priceNewCPURub = 15000;
	float exactPriceCPURub = 10500.50f;
	double exactPriceNewCPURub = 15600.60;
	char firstLOfCPU = 'I';
	boolean IsaGoodCPU = true;

	System.out.println(
		"Кол-во ядер: " + numOfCPUCores + 
		"\nЧастота проц-ра: " + freqCPUMHz +
		"\nЦена на проц-ор: " + priceCPURub + 
		"\nЦена на новый проц-ор: " + priceNewCPURub +
		"\nТочная цена на проц-ор: " + exactPriceCPURub +
		"\nТочная цена на новый проц-ор: " + exactPriceNewCPURub +
		"\nПервая буква названия проц-ра: " + firstLOfCPU +
		"\nХороший ли процессор?: " + IsaGoodCPU);
	}
}
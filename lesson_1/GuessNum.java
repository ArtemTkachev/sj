public class GuessNum {
	public static void main(String[] args) {
		int guessNum = 47;

		for(int i = 0; i <= 100; i++) {
			if(i < guessNum) {
				System.out.println("Введенное вами число: " + i + " меньше того, что загадал компьютер");
			} else if(i > guessNum) {
				System.out.println("Введенное вами число " + i + " больше того, что загадал компьютер");
			} else if(i == guessNum) {
				System.out.println("Вы угадали. Это число " + i);
				break;
			}
		}
	}
}
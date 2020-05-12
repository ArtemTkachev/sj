public class ConditionalStatement {
	public static void main(String[] args) {
		
		int age = 32;
		if(age > 20) {
			System.out.println("Мой возраст больше 20!");
		}

		boolean sexMale = true;
		if(sexMale) {
			System.out.println("Мой пол мужской!");
		}

		if(!sexMale) {
			System.out.println("Мой пол не мужской!");
		}

		float height = 1.85f;
		if(height < 1.80) {
			System.out.println("Мой рост меньше 180!");
		} else {
			System.out.println("Мой рост больше или равен 180!");
		}

		char firstLetterOfName = 'А';
		if(firstLetterOfName == 'М') {
			System.out.println("Первая буква моего имени 'М'");
		} else if(firstLetterOfName == 'И') {
			System.out.println("Первая буква моего имени 'И'");
		} else {
			System.out.println("Первая буква моего имени не 'И' и не 'М'");
		}

	}
}
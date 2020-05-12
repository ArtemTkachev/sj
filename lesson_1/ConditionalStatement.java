public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 32;
		boolean sexMale = true;
		float height = 1.85f;
		char firstLetOfName = 'А';
		if(age > 20) {
			System.out.println("Мой возраст больше 20!");
		}
		if(sexMale) {
			System.out.println("Мой пол мужской!");
		}
		if(!sexMale) {
			System.out.println("Мой пол не мужской!");
		}
		if(height < 1.80) {
			System.out.println("Мой рост меньше 180!");
		} else {
			System.out.println("Мой рост больше или равен 180!");
		}
		if(firstLetOfName == 'М') {
			System.out.println("Первая буква моего имени 'М'");
		} else if(firstLetOfName == 'И') {
			System.out.println("Первая буква моего имени 'И'");
		} else {
			System.out.println("Первая буква моего имени не 'И' и не 'М'");
		}
	}
}
public class WolfTest {

	public static void main(String[] args) {
		Wolf localWolf = new Wolf();

		localWolf.gender = 'm';
		localWolf.age = 5;
		localWolf.weight = 50;
		localWolf.nickname = "Bobo";
		localWolf.color = "gray";

		System.out.println("Gender: " + localWolf.gender +
						   "\nAge: " + localWolf.age +
						   "\nWeight: " + localWolf.weight +
						   "\nNickname: " + localWolf.nickname +
						   "\nColor: " + localWolf.color);

		localWolf.go();
		localWolf.sit();
		localWolf.run();
		String howl = localWolf.howl();
		System.out.println(howl);
		localWolf.hunt();
	}
}
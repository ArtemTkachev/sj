public class WolfTest {

	public static void main(String[] args) {
		Wolf localWolf = new Wolf();

		localWolf.setGender('m');
		localWolf.setAge(5);
		localWolf.setWeight(50);
		localWolf.setNickname("Bobo");
		localWolf.setColor("Gray");

		System.out.println("Gender: " + localWolf.getGender() +
						   "\nAge: " + localWolf.getAge() +
						   "\nWeight: " + localWolf.getWeight() +
						   "\nNickname: " + localWolf.getNickname() +
						   "\nColor: " + localWolf.getColor());

		localWolf.go();
		localWolf.sit();
		localWolf.run();
		String howl = localWolf.howl();
		System.out.println(howl);
		localWolf.hunt();
	}
}
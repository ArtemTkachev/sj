public class Wolf {

	char gender;
	int age;
	int weight;
	String nickname;
	String color;

	void go() {
		System.out.println("Go");
	}

	void sit() {
		System.out.println("Sit");
	}

	void run() {
		System.out.println("Run");
	}

	String howl() {
		return "Auuuuuu!";
	}

	void hunt() {
		System.out.println("Hunt");
	}
}
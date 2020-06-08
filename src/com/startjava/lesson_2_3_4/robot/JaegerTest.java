package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerGipsyDanger = new Jaeger("Gipsy Danger", 
			"Mark-3", "USA", 79.25f, 1.98f, 7, 8, 6);

/*
		jaegerGipsyDanger.setModelName("Gipsy Danger");
		jaegerGipsyDanger.setMark("Mark-3");
		jaegerGipsyDanger.setOrigin("USA");
		jaegerGipsyDanger.setHeight(79.25f);
		jaegerGipsyDanger.setWeight(1.98f);
		jaegerGipsyDanger.setSpeed(7);
		jaegerGipsyDanger.setStrength(8);
		jaegerGipsyDanger.setArmor(6);
*/

		System.out.println("ModelName: " + jaegerGipsyDanger.getModelName() +
						   "\nMark: " + jaegerGipsyDanger.getMark() +
						   "\nOrigin: " + jaegerGipsyDanger.getOrigin() +
						   "\nHeight: " + jaegerGipsyDanger.getHeight() +
						   "\nWeight: " + jaegerGipsyDanger.getWeight() +
						   "\nSpeed: " + jaegerGipsyDanger.getSpeed() +
						   "\nStrength: " + jaegerGipsyDanger.getStrength() +
						   "\nArmor: " + jaegerGipsyDanger.getArmor());

		boolean driftJaegerGipsyDanger = jaegerGipsyDanger.drift();
		System.out.println(driftJaegerGipsyDanger);
		jaegerGipsyDanger.move();
		String scanJaegerGipsyDanger = jaegerGipsyDanger.scanKaiju();
		System.out.println(scanJaegerGipsyDanger);
		jaegerGipsyDanger.useWeapon();


		Jaeger jaegerCoyoteTango = new Jaeger("Coyote Tango", 
			"Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);

/*
		jaegerCoyoteTango.setModelName("Coyote Tango");
		jaegerCoyoteTango.setMark("Mark-1");
		jaegerCoyoteTango.setOrigin("Japan");
		jaegerCoyoteTango.setHeight(85.34f);
		jaegerCoyoteTango.setWeight(2.312f);
		jaegerCoyoteTango.setSpeed(5);
		jaegerCoyoteTango.setStrength(7);
		jaegerCoyoteTango.setArmor(4);
*/

		System.out.println("ModelName: " + jaegerCoyoteTango.getModelName() +
						   "\nMark: " + jaegerCoyoteTango.getMark() +
						   "\nOrigin: " + jaegerCoyoteTango.getOrigin() +
						   "\nHeight: " + jaegerCoyoteTango.getHeight() +
						   "\nWeight: " + jaegerCoyoteTango.getWeight() +
						   "\nSpeed: " + jaegerCoyoteTango.getSpeed() +
						   "\nStrength: " + jaegerCoyoteTango.getStrength() +
						   "\nArmor: " + jaegerCoyoteTango.getArmor());

		boolean driftJaegerCoyoteTango = jaegerCoyoteTango.drift();
		System.out.println(driftJaegerCoyoteTango);
		jaegerCoyoteTango.move();
		String scanJaegerCoyoteTango = jaegerCoyoteTango.scanKaiju();
		System.out.println(scanJaegerCoyoteTango);
		jaegerCoyoteTango.useWeapon();
	}
}
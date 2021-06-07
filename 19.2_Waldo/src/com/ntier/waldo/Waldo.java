package com.ntier.waldo;

import java.util.Random;

class Waldo {

	// declare an inst var 2D arrray of strings
	private String[][] people;

	// a method where we initialize our 2D array and fill it 3 x 3
	void hideWaldo() {
		people = new String[][] { { "Eve", "Ross", "Sue" }, { "Abe", "Kat", "Axe" }, { "Bob", "Ann", "Roy" } };
		Random r1 = new Random(2);
		int randomAssign = r1.nextInt(3);
		int randomAssign2 = r1.nextInt(3);
		people[randomAssign][randomAssign2] = "Waldo";
	}

	void findWaldo() {
		String[] person = new String[3];
		for (int i = 0; i < people.length; i++) {
			for (int j = 0; j < person.length; j++) {
				if (people[i][j].equals("Waldo")) {
					System.out.println(people[i][j] + " is in [" + i + "][" + j + "]");
				}
			}
		}
		for (String[] nameArray : people) {
			for (String name : nameArray) {
				System.out.print(name + "   ");
			}
		}
	}
	
	public static void main(String[] args) {
		Waldo waldoTest = new Waldo();
		waldoTest.hideWaldo();
		waldoTest.findWaldo();
	}
}

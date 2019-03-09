package pluralsight_wildcards;

import pluralsight.Person;

public class Partner extends Person {

	public Partner(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Partner = {name = " + super.getName() + ", age = " + super.getAge() + "}";
	}
}

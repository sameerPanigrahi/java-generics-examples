package pluralsight_wildcards;

import pluralsight.Person;

public class Employee extends Person {

	public Employee(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Employee = {name = " + super.getName() + ", age = " + super.getAge() + "}";
	}
}

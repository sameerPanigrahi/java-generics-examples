package myJavaGenericsLynda;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {

		// Exercise 1
		// checkSimpleGenericClass();

		// Exercise 2
		// System.out.println(useComparablesInGenerics());

		// example from Java Oracle docs
		exploreSubtyping();
	}

	public static void checkSimpleGenericClass() {
		Person<Employee> p1 = new Person<>();
		Person<Contact> p2 = new Person<>();

		Employee emp = new Employee(12345, "Sagar", "Panigrahi");
		Contact cont = new Contact("Mummy", "9594535052");

		p1.setPersonObj(emp);
		p2.setPersonObj(cont);

		System.out.println(p1.getPersonObj());
		System.out.println(p2.getPersonObj());

		p1.print(emp);
	}

	public static int useComparablesInGenerics() {
		List<EmployeeComparable> empGroup = new ArrayList<EmployeeComparable>();

		empGroup.add(new EmployeeComparable(12345, "Sagar", "Panigrahi"));
		empGroup.add(new EmployeeComparable(12346, "Mummy", "Panigrahi"));
		empGroup.add(new EmployeeComparable(19135, "Daddy", "Panigrahi"));

		PersonComparable<EmployeeComparable> p1 = new PersonComparable<>();
		PersonComparable<EmployeeComparable> p2 = new PersonComparable<>();

		p1.setPersonObj(empGroup.get(0));
		p2.setPersonObj(empGroup.get(1));

		Contact cont = new Contact("Mummy", "9594535052");
		p1.print2(cont);

		return (p1.getPersonObj()).compareTo(p2.getPersonObj());
	}

	public static void exploreSubtyping() {
		List<String> ls = new ArrayList<String>();

		// java compiler will not allow you to assign collections of 1 type to
		// collections of another.
		// In general, if Foo is a subtype (subclass or subinterface) of Bar, and G is
		// some generic type declaration, it is not the case that G<Foo> is a subtype of
		// G<Bar>. So the following line will give a compile error.
		// List<Object> lo = ls; <------Error

	}
}

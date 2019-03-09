package pluralsight_wildcards;

import java.util.ArrayList;
import java.util.List;

import pluralsight.Person;

public class MainWildcards {
	public static void main(String[] args) {

		Partner donDraper = new Partner("Don Draper", 89);
		Partner bertCooper = new Partner("Bert Cooper", 100);

		Employee peggyOlson = new Employee("Peggy Olson", 65);

		//// *************************************************************************************************
		// this goes fine...
		// Person [] persons = new Person[2];
		// persons[0] = donDraper; // adding partner to person
		// persons[1] = bertCooper; // adding partner to person
		// display(persons);

		// //below gives no compile time error but a runtime error
		// //though the Person is a superclass reference, it is pointing to a subclass
		// object Employee
		// //so when you assign it an object of another subclass you get a runtime error
		// Person [] persons = new Employee[2];
		// persons[0] = donDraper; //adding partner to employee array
		// persons[1] = bertCooper; //adding partner to employee array
		//// *************************************************************************************************

		//// *************************************************************************************************
		// so we go with list generics to get the potential errors in compile time
		// itself
		List<Partner> personList = new ArrayList<>();
		personList.add(bertCooper);
		personList.add(donDraper);
		// personList.add(peggyOlson); // compile error
		displayList(personList);

		List<Employee> personList2 = new ArrayList<>();
		personList2.add(peggyOlson);
		// personList2.add(donDraper);//compile error for below line! you cannot add
		// Patner to Employee list, so type safety taken care

		// the display list though is able to handle both Partner as well as Employee
		// since it has "? extends Person"
		displayList(personList2);
		//// *************************************************************************************************

		// **********subclass referencing for Generic types, type safety taken care

		// Person [] persons3 = new Person[2];
		// Employee [] employees3 = new Employee[3];
		// persons3 = employees3;// no compile error

		// List<Person> persons2 = new ArrayList<>();
		// List<Employee> employee2 = new ArrayList<>();
		// persons2 = employee2; // compile error... good, type safety is taken care
		///// *****************************************************************************************

		//// *************************************************************************************************
		// collection of Unknown
		// List<?> collections = new ArrayList<>();
		//
		// collections.add(donDraper);
		// collections.add(bertCooper);
		displayCollectionsOfUnknowm(personList);

	}

	private static void displayCollectionsOfUnknowm(List<?> personList) {
		System.out.println("displayCollectionsOfUnknowm()");
		for (Object p : personList) {
			System.out.println(p);
		}

	}

	private static void displayList(List<? extends Person> personList) {
		System.out.println("displayList()");
		for (Person p : personList) {
			System.out.println(p);
		}

	}

	private static void display(Person[] persons) {
		System.out.println("display()");
		for (Person p : persons) {
			System.out.println(p);
		}
	}
}

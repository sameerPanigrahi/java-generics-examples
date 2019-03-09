package pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Person donDraper = new Person("Don Draper", 89);
		Person peggyOlson = new Person("Peggy Olson", 65);
		Person bertCooper = new Person("Bert Cooper", 100);

		List<Person> madMen = new ArrayList<>();

		madMen.add(donDraper);
		madMen.add(peggyOlson);
		madMen.add(bertCooper);

		// plain display
		System.out.println(madMen);

		
////*******dealing with sort exercise; uncomment this section to study this************************		
		// sort ascending
		Collections.sort(madMen, new AgeComparator());
		System.out.println("sorting in ascending...");
		System.out.println(madMen);
		
		//sort descending
		//the ReverseComparator class is written such that it reverses any class implementing Comparator<T>
		// it can handle any generic type T.
		//when you instantiate the ReverseComparator, you do it with the Person Type so it now deals with Person comparator
		ReverseComparator<Person> reverseAgeComparator = new ReverseComparator<>(new AgeComparator());
		Collections.sort(madMen, reverseAgeComparator);
		System.out.println("sorting in descending...");
		System.out.println(madMen);
////************************************************************************************************
		
////*********dealing with minimum exercise; uncomment this section to study this********************		
//		Person youngestPerson;
//		// print minimum using a type unsafe method
//		// the problem is, if the Type of the comparator is different from the Type of
//		// the List,
//		// you will get the error only at runtime
//		youngestPerson = ((Person) minTypeUnsafe(madMen, ageComparator));
//		System.out.println("minTypeUnsafe ->" + youngestPerson);
//
//		// The following code does not show any errors at compile time but will fail at
//		// runtime.
//		// youngestPerson = ((Person) minTypeUnsafe(madMen, new Comparator<Integer>() {
//		//
//		// @Override
//		// public int compare(Integer left, Integer right) {
//		// return Integer.compare(left, right);
//		// }
//		//
//		// }));
//		// System.out.println("Type unsafe ->" + ((Person) minTypeUnsafe(madMen,
//		// ageComparator)) );
//
//		madMen.add(new Person("Sagar Panigrahi", 24));
//		youngestPerson = (Person) minTypeSafe(madMen, ageComparator);
//		System.out.println("minTypeSafe ->" + youngestPerson);
//
//		
////		youngestPerson = ((Person) minTypeSafe(madMen, new Comparator<Integer>() {
////			public int compare(Integer left, Integer right) {
////				return Integer.compare(left, right);
////			}
////
////		}));
////		System.out.println("Type unsafe ->" + ((Person) minTypeUnsafe(madMen, ageComparator)));
////***********************************************************************************************
	}

	private static <T> Object minTypeSafe(List<T> listCollection, Comparator<T> comparator) {

		if (listCollection.isEmpty()) {
			throw new IllegalAccessError("List is empty, cannot find minimum");
		} else {
			T lowest = listCollection.get(0);
			for (T o : listCollection) {
				if (comparator.compare(o, lowest) < 0) {
					lowest = o;
				}
			}
			return lowest;
		}
	}

	private static Object minTypeUnsafe(List listCollection, Comparator comparator) {

		if (listCollection.isEmpty())
			throw new IllegalAccessError("List is empty, cannot find minimum");
		else {
			Object minPerson = listCollection.get(0);

			for (Object p : listCollection) {
				if (comparator.compare(p, minPerson) < 0) {
					minPerson = p;
				}
			}

			return minPerson;

		}
	}

}

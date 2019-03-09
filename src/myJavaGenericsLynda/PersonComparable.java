package myJavaGenericsLynda;

public class PersonComparable<Y extends EmployeeComparable> {

	Y personObj;

	public Y getPersonObj() {
		return personObj;
	}

	public void setPersonObj(Y personObj) {
		this.personObj = personObj;
	}

	// not necessary
	@Override
	public String toString() {
		return "Person [personObj=" + personObj + "]";
	}

	public void print(Y obj) {
		System.out.println(obj);
	}

	public void print3(Object obj) {
		System.out.println(obj);
	}

	// this print has the ability to print any obj type passed to it
	public <Z> void print2(Z obj) {
		System.out.println(obj);
	}

}

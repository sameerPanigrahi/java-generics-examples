package myJavaGenericsLynda;

public class Person<Y> {

	Y personObj;

	public Y getPersonObj() {
		return personObj;
	}

	public void setPersonObj(Y personObj) {
		this.personObj = personObj;
	}
	
	//not necessary
	@Override
	public String toString() {
		return "Person [personObj=" + personObj + "]";
	}

	public void print(Y obj){
		System.out.println(obj);
	}

}

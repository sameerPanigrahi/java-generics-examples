package myJavaGenericsLynda;

public class Employee {

	private String fname, lname;
	private int empid;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Employee() {
		super();
	}

	public Employee(int empid, String fname, String lname) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + "]";
	}

}

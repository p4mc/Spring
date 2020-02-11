package co.edureka;

public class Student1 {
	private String name;

	public Student1() {
		System.out.println("Inside default constructor");
	}

	public Student1(String name) {
		this.name = name;
		System.out.println("Inside parameterized constructor");
	}

	public String getName() {
		System.out.println("Inside getName method");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Inside setName method");
	}

	@Override
	public String toString() {
		return "Student [" + name + "]";
	}
	
	public void myInit1() {
		System.out.println("User-defined initialization - 1");
	}
	public void myInit2() {
		System.out.println("User-defined initialization - 2");
	}
	
	public void myDestructor() {
		System.out.println("User-defined destructor");
	}

}
